package com.github.dhirabayashi.designpattern.interpreter

class PrimitiveCommandNode : Node {
    private var name: String? = null

    override fun parse(context: Context) {
        name = context.currentToken()
        context.skipToken(name)
        if(name != "go" && name != "right" && name != "left") {
            throw ParseException("$name is undefined")
        }
    }

    override fun toString(): String {
        return name.toString()
    }
}