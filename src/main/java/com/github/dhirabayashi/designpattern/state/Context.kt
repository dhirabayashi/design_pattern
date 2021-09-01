package com.github.dhirabayashi.designpattern.state

interface Context {
    fun setClock(hour: Int)

    fun changeState(state: State)

    fun callSecurityCenter(msg: String)

    fun recordLog(msg: String)
}