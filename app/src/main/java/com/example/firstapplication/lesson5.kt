package com.example.firstapplication

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")

    val lst = listOf("one", "two", "three")
    println("Immutable List")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()

    val mutablelst = mutableListOf("one", "two", "three")
    mutablelst.add("four")
    println("Mutable List")
    for (i in mutablelst.indices) {
        println(mutablelst[i])
    }

    set()
    map()
}

fun set() {
    val numbers = setOf(1, 2, 3, 4)
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")

    val studentMarks = mutableMapOf(
        "ram" to 45,
        "shyam" to 45,
        "hari" to 45,
        "gita" to 45,
    )
    studentMarks["ram"] = 60
    studentMarks.put("sabin", 80)
    println("Enter student name: ")
    val input: String = readln().lowercase()
    println(studentMarks[input])
}
