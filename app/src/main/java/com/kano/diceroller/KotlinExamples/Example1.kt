package com.kano.diceroller.KotlinExamples

import java.util.*

fun main(){
    //Age Calculator
    var Dob:Int
    var Age:Int?
    var year = Calendar.getInstance().get(Calendar.YEAR)

    println("Enter Dob")
    try{
        Dob = readLine()!!.toInt()
        Age = year - Dob

        println(Age)
    }catch (e: Exception){
        println("Invalid Entry")
    }



}