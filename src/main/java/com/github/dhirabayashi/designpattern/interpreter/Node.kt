package com.github.dhirabayashi.designpattern.interpreter

interface Node {
    fun parse(context: Context)
}