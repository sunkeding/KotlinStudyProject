package com.sunkeding.kotlin

fun main(args: Array<String>) {
    hello(1,2,string = "skd")
    hello(1,2,3,string = "nb")
}
//这里并不知道有几个int的  vararg表示变长参数
fun hello(vararg intParameter:Int,string: String){
    for (i in intParameter) {
        println(i)
    }
    println(string)
}