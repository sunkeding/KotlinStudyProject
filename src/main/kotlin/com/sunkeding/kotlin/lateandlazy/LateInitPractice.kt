package com.sunkeding.kotlin.lateandlazy


fun main(args: Array<String>) {
//    val person = Person("HXL")
//    person.initHello()   //不加这句，会报错：kotlin.UninitializedPropertyAccessException: lateinit property hello has not been initialized
//    print(person.hello)

    println("notLazyValue:"+notLazyValue)
    println("lazyValue:"+lazyValue)
}

class Person(val name: String) {
    lateinit var hello: String
    fun initHello() {
        hello = "Hello,my name is $name"
    }
}

val notLazyValue:String="notLazyValue"
val lazyValue: String by lazy {
    "lazyValue"
}


