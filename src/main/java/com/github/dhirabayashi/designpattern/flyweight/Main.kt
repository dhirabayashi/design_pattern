package com.github.dhirabayashi.designpattern.flyweight

fun main(args: Array<String>) {
    val bs = BigString(args[0], args[1] == "share")
    bs.print()

    println()

    Runtime.getRuntime().gc()
    println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())
}