package com.kano.diceroller.kotlinkano

fun main(){

    for (i in 1..5){
        print(i)
    }
    println()

    for (i in 'a'..'z'){
        print(i)
    }
    println()

    val weight = 60
    val healthy = 50..75
    if (weight in healthy){
        println("$weight is in $healthy range")
    }else{
        println("Out of Range")
    }

    val c = 'k'
    val alphabet = 'a'..'z'
    if (c in alphabet){
        println("$c is a character")
    }else{
        println("Not a Character")
    }

    for(i in  5 downTo 1) print(i)
    println()
    for (i in 1..20 step 2) print(i)
    println()
    for (i in 9 downTo  1 step 3) print(i)

}