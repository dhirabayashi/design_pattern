package com.github.dhirabayashi.designpattern.state

object NightState : State{
    override fun doClock(context: Context, hour: Int) {
        if(hour in 9..11 || hour in 13..16) {
            context.changeState(DayState)
        } else if(hour == 12) {
            context.changeState(LunchState)
        }
    }

    override fun doUse(context: Context) {
        context.callSecurityCenter("非常：夜間の金庫使用！")
    }

    override fun doAlarm(context: Context) {
        context.callSecurityCenter("非常ベル(夜間)")
        context.changeState(EmergencyState)
    }

    override fun doPhone(context: Context) {
        context.recordLog("夜間の通話録音")
    }

    override fun toString(): String {
        return "[夜間]"
    }
}