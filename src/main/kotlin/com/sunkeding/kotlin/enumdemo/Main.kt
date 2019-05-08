package com.sunkeding.kotlin.enumdemo

fun main(args: Array<String>) {
    println(ActivityState.PLAYING)
    Color.RED.print()
    Color.GREEN.print()
    val red = Color.valueOf("RED")
    println(red)
}

enum class Color(value: Int) {
    RED(0xFF0000) {
        override fun print() {
            println("red:" + RED.ordinal)
        }
    },
    GREEN(0x00FF00) {
        override fun print() {
            println("green:" + GREEN.ordinal)
        }
    };

    abstract fun print()
}