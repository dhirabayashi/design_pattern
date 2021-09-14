package com.github.dhirabayashi.designpattern.interpreter

import java.io.FileInputStream

fun main() {
    FileInputStream("program.txt").bufferedReader().use {
        val lines = it.readLines()
        lines.forEach { text ->
            println("text = \"$text\"")
            val node = ProgramNode()
            node.parse(Context(text))
            println("node = $node")
        }
    }
}