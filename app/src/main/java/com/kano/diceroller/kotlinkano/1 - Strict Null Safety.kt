package com.kano.diceroller.kotlinkano

import java.lang.Exception

fun main(){

    val name: String? = "kano".toUpperCase()
    //name?.toUpperCase()
    println(name)

    val names: String? = "foo"
    var size: Int = names!!.length
    println(size)


    val Current_Year= 2019

    println("Enter Name")
    val Firstname:String? = readLine()


    try {
        println("Enter birth year")
        val Year_Birth:Int? = readLine()?.toInt()
        println("$Firstname is ${Current_Year-Year_Birth!!} years old")

        if (Year_Birth == 2000){
            println("Happy BirthDay")
        }else{
            println("Not Happy Birthday")
        }
    }catch (e:Exception){
        println("invalid syntax")
    }




    
}

