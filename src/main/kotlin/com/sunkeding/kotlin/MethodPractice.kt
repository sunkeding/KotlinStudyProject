package com.sunkeding.kotlin


fun main(args: Array<String>) {
    methon1(::methon2)
}

fun methon1(body: () -> Unit) {
    body()
}

fun methon2() {
    println("skd")
}

