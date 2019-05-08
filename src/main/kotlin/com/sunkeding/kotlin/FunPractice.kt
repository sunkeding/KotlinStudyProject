package com.sunkeding.kotlin

fun main(args: Array<String>) {
    val sum = sum(2, 9)
    val sumLambda = sumLambda(2, 9)
    val sumLambda2 = sumLambda2(2, 9)
    println(sum)
    println(sumLambda)
    println(sumLambda2)
}

fun sum(arg1: Int, arg2: Int) = arg1 + arg2
val sumLambda = { arg1: Int, arg2: Int -> arg1 + arg2 }
val sumLambda2 = { arg1: Int, arg2: Int ->
    println("sumLambda2方法：$arg1"+"+$arg2"+"=${arg1+arg2}")
    arg1 + arg2 }