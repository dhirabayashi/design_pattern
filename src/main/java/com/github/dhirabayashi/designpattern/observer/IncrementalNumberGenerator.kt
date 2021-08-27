package com.github.dhirabayashi.designpattern.observer

class IncrementalNumberGenerator(val start: Int, val end: Int, val increase: Int) : NumberGenerator() {
    private var number = start

    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for(i in start until end step increase) {
            number = i
            notifyObservers()
        }
    }
}