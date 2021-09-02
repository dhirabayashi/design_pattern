package com.github.dhirabayashi.designpattern.state

object LunchState : State {
    override fun doClock(context: Context, hour: Int) {
        if(hour < 9 || 17 <= hour) {
            context.changeState(NightState)
        } else if(hour in 9..11 || hour in 13..16) {
            context.changeState(DayState)
        }
    }

    override fun doUse(context: Context) {
        context.callSecurityCenter("非常：昼食時の金庫使用！")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル(昼食時)")
        context.changeState(EmergencyState)
    }

    override fun doPhone(context: Context) {
        context.recordLog("昼食時の通話録音")
    }

    override fun toString(): String {
        return "[昼食時]"
    }
}