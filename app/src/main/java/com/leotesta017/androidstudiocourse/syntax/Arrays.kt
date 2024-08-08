package com.leotesta017.androidstudiocourse.syntax

fun main() {
    var name: String = "Leo"
    var name1: String = "Leo"
    var name2: String = "Leo"
    var name3: String = "Leo"

    // Index 0-7
    // Size 7
    val weekDays = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

//    println(weekDays[0])
//    println(weekDays.size)

    // Sizes
    if (weekDays.size >= 8) {
//        println(weekDays[7])
    } else {
//        println("There are no more values in the array")
    }

    // Modify values
    weekDays[0] = "Happy Monday"
//    println(weekDays[0])


    // Loops for Arrays
    for(position in weekDays.indices){
//       println(weekDays[position])
    }

    for((position, value) in weekDays.withIndex()){
//        println("The position $position, contains $value")
    }

    for (hello in weekDays){
        println("Now is $hello")
    }

    weekDays.forEach { it }
}