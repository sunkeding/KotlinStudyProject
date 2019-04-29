package com.sunkeding.kotlin


fun main(args: Array<String>) {
    val intArray: IntArray = intArrayOf(1, 2, 3)
    val stringArray: Array<String> = arrayOf("1", "2")

    println(intArray.toString() + "   size=" + intArray.size)
    println(stringArray.toString() + "   size=" + stringArray.size)
}