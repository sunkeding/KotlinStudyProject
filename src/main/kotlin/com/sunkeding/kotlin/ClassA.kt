package com.sunkeding.kotlin

class ClassA {
    var name = "skd"
        set(value) {
            println("set")
            field = value
        }
        get() {
            println("get")
            return field
        }
}