package com.github.dhirabayashi.designpattern.interpreter

class ProgramNode : Node {
    private var commandListNode: Node? = null

    override fun parse(context: Context) {
        context.skipToken("program")
        commandListNode = CommandListNode()
        commandListNode!!.parse(context)
    }

    override fun toString(): String {
        return "[program $commandListNode]"
    }
}