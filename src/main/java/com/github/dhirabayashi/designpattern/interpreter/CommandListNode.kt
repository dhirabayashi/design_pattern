package com.github.dhirabayashi.designpattern.interpreter

class CommandListNode : Node {
    private val list = mutableListOf<Node>()

    override fun parse(context: Context) {
        while (true) {
            if(context.currentToken() == null) {
                throw ParseException("Missing 'end'")
            } else if(context.currentToken() == "end") {
                context.skipToken("end")
                break
            } else {
                val commandNode = CommandNode()
                commandNode.parse(context)
                list.add(commandNode)
            }
        }
    }

    override fun toString(): String {
        return list.toString()
    }
}