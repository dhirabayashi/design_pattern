package com.github.dhirabayashi.designpattern.memento.game

import java.io.Serializable

class Memento(private val money: Int) : Serializable {
    private val fruits = mutableListOf<String>()

    fun getMoney(): Int {
        return money
    }

    internal fun addFruits(fruit: String) {
        fruits.add(fruit)
    }

    internal fun getFruits(): MutableList<String> {
        return fruits.toMutableList()
    }
}