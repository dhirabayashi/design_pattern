package com.github.dhirabayashi.designpattern.observer

fun main() {
    //val generator = RandomNumberGenerator()
    val generator = IncrementalNumberGenerator(10, 50, 5)
    val observer1 = DigitObserver()
    val observer2 = GraphObserver()
    val observer3 = SequenceObserver()
    generator.addObserver(observer1)
    generator.addObserver(observer2)
    generator.addObserver(observer3)
    generator.execute()
}
