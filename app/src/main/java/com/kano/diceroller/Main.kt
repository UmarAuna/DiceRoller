package com.kano.diceroller

fun main(){
    val test = Test()
    test.setAge(12)
    test.setName("Umar Saidu Auna")

    println("${test.getAge()} ${test.getName()}")

    val num =100
    val total = when{
         num > 10 -> print("welcome")
        else -> print("not welcome")
    }
    println(total)
    method()
    //method2()
}

fun method(){
    println("Enter Marks")
    var marks:Int = readLine()!!.toInt()
    if (marks >= 50){
        println("pass")
    }else{
        println("fail")
    }
}

fun method2(){
    println("Enter Marks")
    var marks:Int? = readLine()?.toInt()
    when(marks){
        1 -> println("A")
        2 -> println("B")
        in 3..5 -> println("C")
        else -> println("D")

    }
}


