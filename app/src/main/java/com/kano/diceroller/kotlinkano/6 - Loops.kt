package com.kano.diceroller.kotlinkano

fun main (){
    var array = arrayOf(1,2,3,4,"kano","kaduna","Katsina")

    //The array.indices param returns IntRange with all indexes.
    for(i in array.indices){
        print("${array[i]} ")
    }
    println()

    for ((index,value) in array.withIndex()){
        println("Element at ${index} is $value")
    }

    repeat(3){
        System.out.println("Hello World")
    }

}