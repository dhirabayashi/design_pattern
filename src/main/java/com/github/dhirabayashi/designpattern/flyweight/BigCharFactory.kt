package com.github.dhirabayashi.designpattern.flyweight

object BigCharFactory {
    private val pool = mutableMapOf<Char, BigChar>()

    @Synchronized
    fun getBigChar(charName: Char): BigChar {
        var bc = pool[charName]
        if(bc == null) {
            bc = BigChar(charName)
            pool[charName] = bc
        }
        return bc
    }
}