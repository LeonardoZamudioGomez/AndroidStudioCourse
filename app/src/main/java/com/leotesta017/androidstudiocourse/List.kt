package com.leotesta017.androidstudiocourse

fun main(){
    mutableList()
}

fun mutableList()
{
    val weekDays:MutableList<String> = mutableListOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    weekDays.add(3,"LeoDay")
    println(weekDays)

    if(weekDays.isEmpty())
    {
        // I'm not going to paint anything because there isn't
    }
    else
    {
        weekDays.forEach { println(it) }
    }

    if(weekDays.isNotEmpty())
    {
        weekDays.forEach { println(it) }
    }

    weekDays.last()

    for(SUSCRIBETE in weekDays)
    {

    }

    weekDays.forEach {  }
}

fun inmutableList()
{
    val readOnly:List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")

    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())

    // Filter
    val example = readOnly.filter { it.contains("a")  }
    println(example)

    // Iterate
    readOnly.forEach { weekDay -> println(weekDay) }
}