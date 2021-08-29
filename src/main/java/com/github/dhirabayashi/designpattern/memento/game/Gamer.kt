package com.github.dhirabayashi.designpattern.memento.game

import java.util.concurrent.ThreadLocalRandom

class Gamer(private var money: Int) {
    private var fruits = mutableListOf<String>()
    private val random = ThreadLocalRandom.current()

    companion object {
        val fruitsName = arrayOf("りんご", "ぶどう", "バナナ", "みかん")
    }

    fun getMoney(): Int {
        return money
    }

    fun bet() {
        when (random.nextInt(6) + 1) {
            1 -> {
                money += 100
                println("所持金が増えました。")
            }
            2 -> {
                money /= 2
                println("所持金が半分になりました。")
            }
            6 -> {
                val f = getFruit()
                println("フルーツ($f)をもらいました。")
                fruits.add(f)
            }
            else -> {
                println("何も起こりませんでした。")
            }
        }
    }

    fun createMemento(): Memento {
        val m = Memento(money)
        for(f in fruits) {
            if(f.startsWith("おいしい")) {
                m.addFruits(f)
            }
        }
        return m
    }

    fun restoreMemento(memento: Memento) {
        this.money = memento.getMoney()
        this.fruits = memento.getFruits()
    }

    override fun toString(): String {
        return "[money = $money], fruits = $fruits]"
    }

    private fun getFruit(): String {
        var prefix = ""
        if(random.nextBoolean()) {
            prefix += "おいしい"
        }
        return prefix + fruitsName[random.nextInt(fruitsName.size)]
    }
}