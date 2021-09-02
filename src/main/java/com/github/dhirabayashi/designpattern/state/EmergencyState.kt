package com.github.dhirabayashi.designpattern.state

object EmergencyState : State {
    override fun doClock(context: Context, hour: Int) {
        // 何もしない
    }

    override fun doUse(context: Context) {
        context.callSecurityCenter("非常：非常時の金庫使用！")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル(非常時)")
    }

    override fun doPhone(context: Context) {
        context.callSecurityCenter("非常時の通話")
    }

    override fun toString(): String {
        return "[非常時]"
    }
}