package com.kano.diceroller.KotlinExamples

fun main(){
    //Crops name
    var map = HashMap<Int, String>()
    map.put(1, "Cassava")
    map.put(2, "Millet")
    map.put(3, "Maize")
    map.put(4, "Banana")
    map.put(5, "Guinea Corn")
    println(map.get(2))
    map.put(3,"Corn")

    for(k in map.keys){
        println(map.get(k))
    }
    if(  map.containsValue("Millet")) println("Found") else println("Not Found")


}
