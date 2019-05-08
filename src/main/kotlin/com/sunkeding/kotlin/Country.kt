package com.sunkeding.kotlin

data class Country(val id: Int, val name: String)

fun main(args: Array<String>) {
    val country = Country(0, "中国")
    println(country.id)
    println(country.name)
    println(country)

}

