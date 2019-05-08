package com.sunkeding.kotlin.lambda

fun main(args: Array<String>) {
    println(sum(2, 3))
    println(sum.invoke(2, 3))
    println(sum2(2, 3))
    println(int2Long(2))
    println(int2Long2(2))


    val intArray: Array<Int> = arrayOf(1, 2, 3, 4)
    println("---------------------------")

    for (i in intArray) {
        println(i)
    }
    println("---------------------------")
    intArray.forEach { println(it) }
    println("---------------------------")
    intArray.forEach ({element-> println(element)})
    println("---------------------------")
    intArray.forEach(::println)
}

val sum = { arg1: Int, arg2: Int -> arg1 + arg2 }
val sum2 = { arg1: Int, arg2: Int ->
    println("计算前先打印下：$arg1+$arg2=${arg1 + arg2}")
    arg1 + arg2
}

//匿名函数
fun int2Long(arg: Int): Long {
    return arg.toLong()
}

val int2Long2=fun (arg: Int): Long {
    return arg.toLong()
}