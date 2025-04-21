package com.example.firstapplication

fun main(args: Array<String>){
    var age = arrayOf(1,2,3)

    //Arrays
    println(age)
    println("The first element of age is"+ age[0] )
    println("The second element of age is"+ age[1] )
    println("The third element of age is"+ age[2] )

    println("******************************")

    var name = arrayOf("ram","shyam","gita")
    name[1]="Sanjeev"
    println("The first element of name is"+ name[0])
    println("The second element of name is"+ name[1])
    println("The third element of name is"+ name[2])

    println(name.size)


//    ArrayList
    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)
    var name2 = arrayListOf<String>("Sanjeev", "ram", "shyam")
    name2.add("hari")
    name2.add(4,"Sita")

    name2.remove("shyam")
    name2.removeAt(0)

    println(name)

    var mixArrayList =arrayListOf<Any>("Hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])
}