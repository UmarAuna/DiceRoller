package com.kano.diceroller.KotlinExamples

fun main(){
    //Grade Example
    println("Enter Grade")
   var grade = readLine()!!.toDouble()

    if(grade >= 90){
        println("A")
    }else if(grade >= 80 && grade <90){
        println("B")
    }else if (grade >= 70 && grade <80){
        println("C")
    }else{
        println("You have failed")
    }

    println("Your grade is $grade")


}