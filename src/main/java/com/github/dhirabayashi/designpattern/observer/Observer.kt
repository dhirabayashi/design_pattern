package com.github.dhirabayashi.designpattern.observer

interface Observer {
    fun update(generator: NumberGenerator)
}