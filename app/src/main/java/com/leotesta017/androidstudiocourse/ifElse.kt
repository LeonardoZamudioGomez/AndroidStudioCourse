package com.leotesta017.androidstudiocourse

fun main()
{
    ifMultipleOr()
}

fun ifMultipleOr()
{
    var pet = "cat"
    var isHHappy = true

    if(pet == "dog" || (pet == "cat" && isHHappy))
    {
        println("Is a dog or a car.")
    }
    else
    {
        println("Is not a dog or a cat.")
    }
}

fun ifMultiple()
{
    var age = 21
    var itIsNight = true
    var iHappy = true

    if(age >= 18 && itIsNight && iHappy)
    {
        println("I can drink beer.")
    }
    else
    {
        println("I can not drink beer.")
    }
}

fun ifInt()
{
    var age = 21

    if(age >= 18)
    {
        println("More or Equal than 18")
    }
    else
    {
        println("Less than 18")
    }
}

fun ifBoolean()
{
    var imAmHappy:Boolean = true

    if(!imAmHappy)
    {
        println("I am sad :(")
    }
    else
    {
        println("I am happy :)")
    }
}

fun ifNested()
{
    val animal = "cat"

    if(animal == "dog")
    {
        println("This is a dog.")
    }
    else if (animal == "cat")
    {
        println("This is a cat.")
    }
    else if (animal == "bird")
    {
        println("This is a bird.")
    }
    else
    {
        println("It is not one of the expected animals.")
    }
}

fun ifBasic()
{
    val name = "Leo"

    if(name == "Leo")
    {
        println("Hello Leo.")
    }
    else
    {
        println("You are not Leo, go out.")
    }
}