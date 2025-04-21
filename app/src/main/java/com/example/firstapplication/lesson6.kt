package com.example.firstapplication

//Arithmetic Operator

fun main() {
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")

    //Assignment Operator

    var x: Int = 20
    var y: Int = 30
    var z: Int = 0

    z = x + y
    println("z = x + y = %z")
    z += x
    println("z += x = %z")
    z -= x
    println("z -= x = %z")
    z *= x
    println("z *= x = %z")
    z /= x
    println("z /= x = %z")
    z %= x
    println("z %= x = %z")

    //Unary Operator

    var number: Double = 7.6
    var isCheck: Boolean = true
    println("+number = ${+number}")
    println("-number = ${-number}")
    println("++number = ${++number}")
    println("--number = ${--number}")
    println("!isCheck = ${!isCheck}")
    println("------------------------")
    var result2: Double = 4.7
    println("result : $result")
    println("result++ :" + result++)

    //Equality and Relational Operator

    var a: Int = 5
    var b: Int = 5

    println("a==b :" + (a == b))
    println("!==b :" + (a != b))
    println("a<b :" + (a < b))
    println("a>b :" + (a > b))
    println("a>=b :" + (a >= b))
    println("a<=b :" + (a <= b))

    //Conditional Operator
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result3: Boolean = false
    //Conditional operator(&&)
    result3 = (number1 > number2) && (number3 > number2)
    println(result)
    //Conditional operator
    result3 = (number1 > number2) || (number3 > number2)
    println(result)

    //Operator Precendence
    //BODMAS
    var result4: Int = 5 + 2 * 4
    println("Result =" + result)
    result4 = (5 + 2) * 4
    println("Result =" + result)
    var xa: Int = 8
    var yb: Int = 4
    var zc: Int = 2
    var sum: Int = 0
    sum = x + --y + --z
    println("x+ --y + --z ::: &sum")

    var myCharRange ='a'.rangeTo('j')
    var testCharRange ='a'..'j'

    var check ='Z' in testCharRange
    println("mycharRange has Z : $check")
    println(myCharRange)
    println(testCharRange)

    print("Enter name::")
    var name: String? = readln()
    print("Enter age::")
    var age: Int = readln()!!.toInt()
}