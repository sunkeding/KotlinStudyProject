package com.sunkeding.kotlin

import com.sunkeding.java.Child

fun main(args: Array<String>) {
//    val name:String= getMyName()?:return
//    println(name.length)

    val parent=Person()
    val child:Child?=parent as? Child   //不会抛出类型转换异常
    if (parent is Child){
        println(parent.getAge())
    }
}

fun getMyName(): String? { //可以为空的意思

    return null
}


