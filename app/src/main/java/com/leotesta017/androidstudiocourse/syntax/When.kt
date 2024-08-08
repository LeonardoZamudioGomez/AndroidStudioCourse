package com.leotesta017.androidstudiocourse.syntax

fun main()
{
    //getMonth(1)
    //getTrimester(12)
    //getSemester(4)
    result("Bye")
}

fun result(value:Any)
{
    when(value)
    {
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) print("Hello")
    }
}

fun getSemester(month: Int) = when(month)
{
    in 1..6 ->  "First semester."
    in 7..12 ->   "Second semester"
    !in 1..12 -> "Invalid semester."
    else ->  "trikitrakatelas"
}

fun getTrimester(month:Int)
{
    when(month)
    {
        1, 2, 3 -> print("First trimester.")
        4, 5, 6 -> print("Second trimester")
        7, 8, 9 -> print("Third trimester")
        10, 11, 12 -> print("Fourth trimester")
        else -> print("Invalid trimester.")
    }
}

fun getMonth(month:Int)
{
    when(month)
    {
        1 -> print("January")
        2 -> print("February")
        3 -> print("March")
        4 -> print("April")
        5 -> print("May")
        6 -> print("June")
        7 -> print("July")
        8 -> print("August")
        9 -> print("September")
        10 -> print("October")
        11 -> {
            print("November")
            print("Other string in November")
        }
        12 -> print("December")
        else -> print("Invalid month.")
    }
}