package com.github.dhirabayashi.designpattern.command.command

import com.github.dhirabayashi.designpattern.command.drawer.DrawCanvas
import java.awt.Color

class ColorCommand(private val canvas: DrawCanvas, private val color: Color) : Command {
    override fun execute() {
        canvas.color = color
    }
}