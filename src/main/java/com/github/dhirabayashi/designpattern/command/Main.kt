package com.github.dhirabayashi.designpattern.command

import com.github.dhirabayashi.designpattern.command.command.MacroCommand
import com.github.dhirabayashi.designpattern.command.drawer.DrawCanvas
import com.github.dhirabayashi.designpattern.command.drawer.DrawCommand
import java.awt.event.*
import javax.swing.Box
import javax.swing.BoxLayout
import javax.swing.JButton
import javax.swing.JFrame
import kotlin.system.exitProcess

class Main(appTitle: String) : JFrame(appTitle), ActionListener, MouseMotionListener, WindowListener {
    private val history = MacroCommand()

    private val canvas = DrawCanvas(400, 400, history)

    private val clearButton = JButton("clear")

    init {
        addWindowListener(this)
        canvas.addMouseMotionListener(this)
        clearButton.addActionListener(this)

        val buttonBox = Box(BoxLayout.X_AXIS)
        buttonBox.add(clearButton)
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
        }
    }

    override fun mouseDragged(e: MouseEvent) {
        val cmd = DrawCommand(canvas, e.point)
        history.append(cmd)
        cmd.execute()
    }

    override fun mouseMoved(e: MouseEvent?) {
    }

    override fun windowOpened(e: WindowEvent?) {
    }

    override fun windowClosing(e: WindowEvent?) {
        exitProcess(0)
    }

    override fun windowClosed(e: WindowEvent?) {
    }

    override fun windowIconified(e: WindowEvent?) {
    }

    override fun windowDeiconified(e: WindowEvent?) {
    }

    override fun windowActivated(e: WindowEvent?) {
    }

    override fun windowDeactivated(e: WindowEvent?) {
    }

}

fun main() {
    Main("Command Pattern Sample")
}