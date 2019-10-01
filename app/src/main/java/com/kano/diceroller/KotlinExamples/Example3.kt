package com.kano.diceroller.KotlinExamples

fun main(){
    for(item in 1..5){
        println(item)
        for(item2 in 1..10){
            println(item2)
        }
        println("Done In")
    }
    println("Done Out")
}