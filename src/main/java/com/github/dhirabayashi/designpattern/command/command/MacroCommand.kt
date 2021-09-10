package com.github.dhirabayashi.designpattern.command.command

import java.util.*

class MacroCommand : Command {
    private val commands = Stack<Command>()

    override fun execute() {
        commands.forEach {
            it.execute()
        }
    }

    fun append(cmd: Command) {
        if(cmd != this) {
            commands.push(cmd)
        }
    }

    fun undo() {
        if(!commands.empty()) {
            commands.pop()
        }
    }

    fun clear() {
        commands.clear()
    }
}