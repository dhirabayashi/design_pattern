package com.github.dhirabayashi.designpattern.proxy

fun main() {
    val p = PrinterProxy("Alice", "com.github.dhirabayashi.designpattern.proxy.Printer")
    println("名前は現在${p.getPrinterName()}です。")
    p.setPrinterName("Bob")
    println("名前は現在${p.getPrinterName()}です。")
    p.print("Hello, world.")
}