package com.github.dhirabayashi.designpattern.flyweight

class BigString(val string: String) {
    private val bigChars = mutableListOf<BigChar>()

    init {
        for(char in string.toCharArray()) {
            bigChars.add(BigCharFactory.getBigChar(char))
        }
    }

    fun print() {
        for(bigChar in bigChars) {
            bigChar.print()
        }
    }
}