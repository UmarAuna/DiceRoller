package com.kano.diceroller.kotlinkano

fun main(){


    val Ages  = Age()
    println("Enter name")
    val name:String = readLine()!!.toString()


    println("Enter Year")
    val yearBirth: Int = readLine()!!.toInt()

    Ages.setName(name)
    Ages.setYearBirth(yearBirth)

    val Age = 2019 - Ages.getYearBirth()
    println("${Ages.getName()} is $Age years old!!!")



    val greeting = greetings()
    greeting.greet()
    println(greeting.greet1)
    println(greeting.greet2)
    println(greeting.greet3)
    println(greeting.greet4)


    val names = name("John Doe")
    println(names.name)

    val ages = age(20)
    println(ages)


}
class greetings{
    var greet1: String ="Good Morning"
    var greet2: String ="Good Afternoon"
    var greet3: String ="Good Evening"
    var greet4: String ="Good Night"
    fun greet(){
        println("Good Morning, Kotlin Rocks!!!!")
    }
}

class name(val name:String)

data class age (val age:Int)

//Copy Java Code and Paste here!!!
class Data{
    internal var name: String = ""
    internal var yearBirth: Int = 0

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }


    fun getYearBirth(): Int {
        return yearBirth
    }

    fun setYearBirth(yearBirth: Int) {
        this.yearBirth = yearBirth
    }
}



