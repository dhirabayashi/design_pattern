package com.github.dhirabayashi.designpattern.flyweight

class BigString(val string: String, shared: Boolean = true) {
    private val bigChars = mutableListOf<BigChar>()

    init {
        for(char in string.toCharArray()) {
            if(shared) {
                bigChars.add(BigCharFactory.getBigChar(char))
            } else {
                bigChars.add(BigChar(char))
            }
        }
    }

    fun print() {
        for(bigChar in bigChars) {
            bigChar.print()
        }
    }
}