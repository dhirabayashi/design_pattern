package com.github.dhirabayashi.designpattern.observer

class SequenceObserver : Observer {
    override fun update(generator: NumberGenerator) {
        println("SequenceObserver:")
        val number = generator.getNumber()
        for(i in 1..number) {
            print("$i ")
        }
        println()

        Thread.sleep(100)
    }
}