package com.sunkeding.kotlin

fun main(args: Array<String>) {
    val intRange: IntRange = 0..1024   //[0,1024]
    val intRange2: IntRange = 0 until 1024  //[0,1024)
    val emptyRange: IntRange = 0..-1  //[0,1024)
    println(intRange)
    println(intRange2)
    println(intRange.contains(1024))
    println(intRange2.contains(1024))
    println(10 in intRange)
    println(emptyRange.isEmpty())

    for (i in intRange) {
        print("$i ")
    }

}