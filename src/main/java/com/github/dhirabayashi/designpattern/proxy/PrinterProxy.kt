package com.github.dhirabayashi.designpattern.proxy

class PrinterProxy(private var name: String, private var className: String) : Printable {
    private var real: Printable? = null

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

    @Synchronized
    private fun realize() {
        if(real == null) {
            real = Class.forName(className).declaredConstructors[0].newInstance(name) as Printable?
        }
    }
}