package com.github.dhirabayashi.designpattern.interpreter

class RepeatCommandNode : Node {
    private var number = 0
    private var commandListNode: Node? = null

    override fun parse(context: Context) {
        context.skipToken("repeat")
        number = context.currentNumber()
        context.nextToken()
        commandListNode = CommandListNode()
        commandListNode!!.parse(context)
    }

    override fun toString(): String {
        return "[repeat $number $commandListNode]"
    }
}