@file:Suppress("IMPLICIT_CAST_TO_ANY")

package com.kano.diceroller.kotlinkano

fun main(){

    //Java, however, treats if as a statement while Kotlin treats if as an expression

    //If Statement
    val x = 5

    if(x > 10){
        println("greater")
    }else{
        println("smaller")
    }

    println(if(x>10) "greater" else "smaller")


    val hour = 10
    val greeting: String
    if(hour <18){
        greeting = "Good day"
    }else{
        greeting = "Good evening"
    }
    println(greeting)


    val greetings = if(hour <18) {
        "Good day"
    }else{
        "Good evening"
    }
    println(greetings)

    //When Expression
    val y = 2

    when(y){
        1 -> println("X == 1")
        2 -> println("X == 2")
        else -> println("y is neither 1 nor 2")
    }

    //If when is used as an expression, the else branch is mandatory, unless the compiler
    //can prove that all possible cases are covered with branch conditions.
    val vehicle = "Bike"
    val message = when (vehicle){
        "Car" ->{
            "Four Wheels"
        }
        "Bike" ->{
            "Two Wheels"
        }
        else -> {
            "Unknown number of wheels"
        }
    }
    println(message)


    val vehicles = "Car"
    when(vehicles){
        "Car", "Bike" -> println("Vehicle")
        else -> println("Unidentified funny object")
    }



    val riskAssessment = 47
    val risk = when (riskAssessment) {
        in 1..20 -> "negligible risk"
        !in 21..40 -> "minor risk"
        !in 41..60 -> "major risk"
        else -> "undefined risk"
    }
    println(risk)



    val riskAssessments = 80
    val handleStrategys = "Warn"

    val risks = when(riskAssessments){
        in 1..20 -> println("negligible risk")
        in 21..40 -> println("minor risk ")
        in 41..60 -> println("major risk")
        else -> when (handleStrategys){
            "Warn" -> "Risk assessment warning"
            "Ignore" -> "Risk ignored"
             else -> "Unknown risk!"
        }
    }
    println(risks)


}
