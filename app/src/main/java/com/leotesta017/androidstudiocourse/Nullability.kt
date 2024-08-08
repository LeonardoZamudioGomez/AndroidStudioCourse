package com.leotesta017.androidstudiocourse

fun main()
{
    var name:String? = "Leo"

    println(name?.get(1) ?:  "Is null")
}