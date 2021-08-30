package com.github.dhirabayashi.designpattern.memento.game

import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import java.nio.file.Files
import java.nio.file.Path
import java.util.concurrent.ThreadLocalRandom

class Gamer {
    private var money: Int = 0
    private var fruits = mutableListOf<String>()
    private val random = ThreadLocalRandom.current()

    companion object {
        val fruitsName = arrayOf("りんご", "ぶどう", "バナナ", "みかん")
        val datPath: Path = Path.of("game.dat")
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

    private fun createMemento(): Memento {
        val m = Memento(money)
        for(f in fruits) {
            if(f.startsWith("おいしい")) {
                m.addFruits(f)
            }
        }
        return m
    }

    fun writeMemento(): Memento {
        val memento = createMemento()
        ObjectOutputStream(Files.newOutputStream(datPath)).use {
            it.writeObject(memento)
        }
        return memento
    }

    fun readMemento(): Memento {
        val memento: Memento
        if(Files.exists(datPath)) {
            ObjectInputStream(Files.newInputStream(datPath)).use {
                memento = it.readObject() as Memento
            }
        } else {
            memento = Memento(100)
        }
        restoreMemento(memento)
        return memento
    }

    private fun restoreMemento(memento: Memento) {
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