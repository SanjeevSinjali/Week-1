package com.example.firstapplication

fun main() {

    //if-else
    print("Please enter a number : ")
    var number: Any = readln()!!.toInt()

    if (number.toString().toInt() % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }

    //if-else and if-ladder
    print("Please enter your age :: ")
    var yourAge: Int = readln()!!.toInt()

    if (yourAge < 13) {
        print("You are a child")
    } else if (yourAge < 19) {
        print("You are a teenager")
    } else {
        if (yourAge < 50) {
            print("You are an adult")
        } else {
            print("You are a senior")
        }
    }

    //Nested if
    println("Please enter 3 numbers : ")
    var number1: Int = readln()!!.toInt()
    var number2: Int = readln()!!.toInt()
    var number3: Int = readln()!!.toInt()
    var largestNumber: Int

    if (number1 >= number2) {
        if (number1 >= number3) {
            largestNumber = number1
        } else {
            largestNumber = number3
        }
    } else {
        if (number2 >= number3) {
            largestNumber = number2
        } else {
            largestNumber = number3
        }
    }

    println("The largest number is $largestNumber")

    //When statement
    print("Please enter a day number of week : - ")
    var dayNumber: Int = readln()!!.toInt()
    var day: String

    when (dayNumber) {
        1 -> day = "Sunday"
        2 -> day = "Monday"
        3 -> day = "Tuesday"
        4 -> day = "Wednesday"
        5 -> day = "Thursday"
        6 -> day = "Friday"
        7 -> day = "Saturday"
        else -> day = "Invalid day choice"
    }

    println(day)

    //for loop
    // Simple loop from 1 to 9
    for (i in 1..9) {
        println(i)
    }

// Loop with sum
    var sum: Int = 0
    for (x in 0..5) {
        println(x)
        sum += x
    }

// Loop with even number sum
    sum = 0
    for (x in 0..10) {
        if (x % 2 == 0) {
            println(x)
            sum += x
        }
    }
    println("The sum of even number is $sum")

// Loop through array
    var vehicle = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")
    for (y in vehicle.indices) {
        println("The value in $y index is : - ${vehicle[y]}")
    }

    //for-each loop
    val vehicle2 = arrayListOf<String>("Tata", "Kia", "Hyundai", "MG")

    vehicle.forEach { it: String ->
        println(it)
    }

    //While loop
    // Basic while loop
    var i: Int = 0
    while (i < 5) {
        println(i)
        i++
    }

// Factorial using while loop
    var k = 1
    var fact = 1
    while (k < 6) { // calculating factorials up to 5!
        fact *= k
        println("$k! = $fact")
        k++
    }
}
fun show() {
    //do-while loop
    var number = 1
    do {
        println(number)
        number++
    } while (number <= 15)
}



