package com.github.dhirabayashi.designpattern.proxy

class Printer(private var name: String) : Printable {

    init {
        heavyJob("Printerのインスタンスを生成中")
    }

    override fun setPrinterName(name: String) {
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        println("=== $name ===")
        println(string)
    }

    private fun heavyJob(msg: String) {
        kotlin.io.print(msg)
        for(i in 0..4) {
            Thread.sleep(1000)
            kotlin.io.print(".")
        }
        println("完了。")
    }
}