package com.github.dhirabayashi.designpattern.proxy

class PrinterProxy(private var name: String) : Printable {
    private var real: Printer? = null

    @Synchronized
    override fun setPrinterName(name: String) {
        real?.setPrinterName(name)
        this.name = name
    }

    override fun getPrinterName(): String {
        return name
    }

    override fun print(string: String) {
        realize()
        // nullではないことはrealize()呼び出しにより保証されるが、コンパイラにはそれがわからない
        real?.print(string)
    }

    private fun realize() {
        if(real == null) {
            real = Printer(name)
        }
    }
}