package com.github.dhirabayashi.designpattern.proxy

interface Printable {
    fun setPrinterName(name: String)

    fun getPrinterName(): String

    fun print(string: String)
}