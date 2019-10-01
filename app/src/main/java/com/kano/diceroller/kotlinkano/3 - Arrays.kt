package com.kano.diceroller.kotlinkano

fun main(){
    val array = arrayOf(1,2,3,4,'A',"Kano")
    print(array[1])
    println()

    val array2= intArrayOf(1,2,3,4)
    for(i in array2){
        print(i)
    }
    println()

    val array3= longArrayOf(1,2,3,4)
    for(i in array3){
        print(i)
    }
    println()

    val array4 = Array (10) {it * 2}
    for( i in array4){
        print("$i ")
    }



}