package com.github.dhirabayashi.designpattern.command

import com.github.dhirabayashi.designpattern.command.command.ColorCommand
import com.github.dhirabayashi.designpattern.command.command.MacroCommand
import com.github.dhirabayashi.designpattern.command.drawer.DrawCanvas
import com.github.dhirabayashi.designpattern.command.drawer.DrawCommand
import java.awt.Color
import java.awt.event.*
import javax.swing.*
import kotlin.system.exitProcess

class Main(appTitle: String) : JFrame(appTitle), ActionListener {
    private val history = MacroCommand()

    private val canvas = DrawCanvas(400, 400, history)

    private val clearButton = JButton("clear")

    private val colorButton = JButton("choose color")

    private val undoButton = JButton("undo")

    init {
        addWindowListener(object: WindowAdapter() {
            override fun windowClosing(e: WindowEvent) {
                exitProcess(0)
            }
        })
        canvas.addMouseMotionListener(object: MouseMotionAdapter() {
            override fun mouseDragged(e: MouseEvent) {
                val cmd = DrawCommand(canvas, e.point)
                history.append(cmd)
                cmd.execute()
            }
        })
        clearButton.addActionListener(this)
        colorButton.addActionListener(this)
        undoButton.addActionListener(this)

        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(clearButton)
        buttonBox.add(colorButton)
        buttonBox.add(undoButton)
        val mainBox = Box(BoxLayout.Y_AXIS)
        mainBox.add(buttonBox)
        mainBox.add(canvas)
        contentPane.add(mainBox)

        pack()
        isVisible = true
    }

    override fun actionPerformed(e: ActionEvent) {
        if(e.source == clearButton) {
            history.clear()
            canvas.repaint()
        } else if(e.source == colorButton) {
            val color = JColorChooser.showDialog(this, "choose color", Color.white)
            if(color != null) {
                val cmd = ColorCommand(canvas, color)
                cmd.execute()
            }
        } else if(e.source == undoButton) {
            history.undo()
            canvas.repaint()
        }
    }
}

fun main() {
    Main("Command Pattern Sample")
}