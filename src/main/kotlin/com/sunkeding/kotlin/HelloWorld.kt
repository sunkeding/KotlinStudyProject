package com.sunkeding.kotlin

fun main(args: Array<String>) {
    val i:Double = (633 / 18).toDouble()
    println(i)
    val sqrt = Math.sqrt(10.0)
    println(sqrt)
    val ceil = Math.ceil(sqrt)
    println(ceil)
    // 快捷键打印  sout
    println("helloworld")

    val aChar ='a';
    val bChar ='b';
    val cChar ='a';
    println(aChar==cChar)

    val str ="hello"
    val charArrayOf = charArrayOf('h', 'e','l','l','o')

    val fromChar = String(charArrayOf)

    println(charArrayOf)
    //==相当于java的equals
    println(str==fromChar)
    //===相当于java的==
    println(str===fromChar)


    val ss="""
        asdfghi
        中国
        """
    println("字符串ss长度="+ss.length)

    val arg0=0
    val arg1=1
    println(""+arg0+"+"+arg1+"="+(arg0+arg1))
    //字符串模板
    println("$arg0+$arg1=${arg0+arg1}")

    val format = String.format("%s孙", "ok")
    println(format)

}