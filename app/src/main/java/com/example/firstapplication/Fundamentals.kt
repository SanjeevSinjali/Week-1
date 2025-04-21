package com.example.firstapplication

fun main(args: Array<String>) {
    println("Hello World!");


    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 444
    var f: Long = 67457621L
    var g: Float = 5.487156F
    var h: Double = 7.234242
    var x: Double = 132.33
    var y: Int = x.toInt()
    var z: Byte = y.toByte()
    var za: String = "!Hello World"
    var i: Int = za.length
    var xa: Boolean = a.equals("!Hello World")
    var username : String = "softwarica"


    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)


    println(x)
    println(y)
    println(z)

    println(username.trim())
    println(za)
    println(i)
    println(za.isEmpty())
    println(za.lowercase())
    println(za.uppercase())
    println(xa)
    println(za.plus(".How are you"))
}