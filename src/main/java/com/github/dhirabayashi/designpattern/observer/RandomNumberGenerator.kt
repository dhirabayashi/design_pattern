package com.github.dhirabayashi.designpattern.observer

import java.util.concurrent.ThreadLocalRandom

class RandomNumberGenerator : NumberGenerator() {
    private val random = ThreadLocalRandom.current()

    private var number: Int = 0

    override fun getNumber(): Int {
        return number
    }

    override fun execute() {
        for (i in 0..19) {
            number = random.nextInt(50)
            notifyObservers()
        }
    }
}