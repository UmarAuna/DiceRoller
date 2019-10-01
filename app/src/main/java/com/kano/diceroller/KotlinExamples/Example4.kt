package com.kano.diceroller.KotlinExamples

fun main(){
    //Contacts
    var arrayList = ArrayList<String>()
    arrayList.add("Umar")
    arrayList.add("Saidu")
    arrayList.add("Auna")

    println("Name: "+ arrayList.get(0))
    arrayList.set(0,"Musa")

    println("Contacts")
    for(items in arrayList){
        println(items)
    }
    if(arrayList.contains("Musa")){
         println("Found")
    }else{
        println("Not Found")
    }
}