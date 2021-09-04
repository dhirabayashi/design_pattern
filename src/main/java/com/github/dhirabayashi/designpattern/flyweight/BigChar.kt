package com.github.dhirabayashi.designpattern.flyweight

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

class BigChar(charName: Char) {
    private val fontData: String = try {
        Files.readString(Path.of("big${charName}.txt"))
    } catch (e: IOException) {
        "$charName?"
    }

    fun print() {
        print(fontData)
    }
}