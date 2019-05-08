package com.sunkeding.kotlin

// :是继承的意思
class Girl : Person() {

    var age = 20;
    var name = "sss";
    fun printInfo() {
        println("age=" + age + "\r换行了吧.....\rname=" + name)
    }
}

open class Person {
    var desc: String = ""

    init {
        println("初始化Person")
    }

    constructor(s1: String) {
        desc = s1
        println("Person一参的构造方法")
    }

    constructor() {
        println("Person无参的构造方法")
    }

    override fun toString(): String {
        return super.toString()
    }
}

fun main(args: Array<String>) {
    println(args.toString())
//    val girl = Girl()
//    println(String.format("age=%s",girl.age))
//    println(String.format("name=%s",girl.name))
//    girl.printInfo()

    val person = Person("skd")
    println(person.toString())
}