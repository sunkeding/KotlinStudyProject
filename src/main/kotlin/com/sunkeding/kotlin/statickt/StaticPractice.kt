package com.sunkeding.kotlin.statickt

fun main(args: Array<String>) {
    val lat = Location.getLat(9.0)
    val lng = Location.getLat(10.0)
    println(lat)
    println(lng)
    println(StaticA.TAG)
    println(StaticA.getName())
}

class Location {
    private constructor(double: Double)
    companion object { //伴生对象
        @JvmField
        val TAG = "Location"

        fun getLat(double: Double): Location {
            return Location(double)
        }

        // JvmStatic表示在java中不需要通过companion来访问静态方法，直接就跟java写法一样，如果不需要给java用，一般不加这个注解
        @JvmStatic
        fun getLng(double: Double): Location {
            return Location(double)
        }

    }
}

object StaticA {
    val TAG="StaticA:"
    fun getName(): String {
        return TAG+"skd"
    }
}
