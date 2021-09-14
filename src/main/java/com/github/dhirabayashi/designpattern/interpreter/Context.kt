package com.github.dhirabayashi.designpattern.interpreter

import java.lang.NumberFormatException
import java.util.*

class Context(text: String) {
    private val tokenizer: StringTokenizer

    private var currentToken: String? = null

    init {
        tokenizer = StringTokenizer(text)
        nextToken()
    }

    fun nextToken(): String? {
        if(tokenizer.hasMoreTokens()) {
            currentToken = tokenizer.nextToken()
        } else {
            currentToken = null
        }
        return currentToken
    }

    fun currentToken(): String? {
        return currentToken
    }

    fun skipToken(token: String?) {
        if(token != currentToken) {
            throw ParseException("Warning: $token is expected, but $currentToken is found.")
        }
        nextToken()
    }

    fun currentNumber(): Int {
        if(currentToken == null) {
            throw ParseException("Warning: currentToken is null.")
        }

        val number: Int
        try {
            number = currentToken!!.toInt()
        } catch (e: NumberFormatException) {
            throw ParseException("Warning: $e")
        }
        return number
    }
}