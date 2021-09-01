package com.github.dhirabayashi.designpattern.state

fun main() {
    val frame = SafeFrame("State Sample")
    while (true) {
        for(hour in 0..23) {
            frame.setClock(hour)
            Thread.sleep(1000)
        }
    }
}