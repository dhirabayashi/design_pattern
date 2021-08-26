package com.github.dhirabayashi.designpattern.observer

class GraphObserver: Observer {
    override fun update(generator: NumberGenerator) {
        println("GraphObserver:")
        val count = generator.getNumber()
        for(i in 1..count) {
            print("*")
        }
        println()
        Thread.sleep(100)
    }
}