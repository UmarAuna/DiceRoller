package com.kano.diceroller.kotlinkano

fun main (){
    presentGently("Duck")
    presentGently(42)

    presentGentlys(null)
    presentGentlys(1)
    presentGentlys("Str")

    printSum(1, 2, 3, 4, 5)
    println()
    printSum(1, 2, 3)
    println()
    printSum()
    println()
    marks()

    printAll("A", "B", "C")

}

fun marks(){
    println("Enter Marks")
    var marks:Int = readLine()!!.toInt()
    if (marks >= 50){
        println("pass")
    }else{
        println("fail")
    }
}

fun presentGently(v: Any)= println("Hello. I would like to present you: $v")

fun presentGentlys(v: Any?)= println("Hello. I would like to present you: $v")

//Sometimes, the number of parameters is not known in advance. In such cases we
//can add a vararg modifier to a parameter.
fun printSum(vararg number:Int){
    val sum = number.sum()
    print(sum)
}

fun printAll(vararg  texts: String){
    val allTexts = texts.joinToString(",")
    println("Texts are $allTexts")
}
