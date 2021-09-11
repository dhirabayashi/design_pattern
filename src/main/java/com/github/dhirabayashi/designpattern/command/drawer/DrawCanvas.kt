package com.github.dhirabayashi.designpattern.command.drawer

import com.github.dhirabayashi.designpattern.command.command.MacroCommand
import java.awt.Canvas
import java.awt.Color
import java.awt.Graphics

class DrawCanvas(width: Int, height: Int, private val history: MacroCommand) : Drawable, Canvas() {
    var color = Color.red

    private val radius = 6

    init {
        setSize(width, height)
        background = Color.white
    }

    override fun paint(g: Graphics) {
        history.execute()
    }

    override fun draw(x: Int, y: Int) {
        val g = graphics
        g.color = color
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2)
    }
}