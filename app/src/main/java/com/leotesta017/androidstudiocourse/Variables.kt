//Leonardo
package com.leotesta017.androidstudiocourse

// Variables that can be called in any function.
val age:Int = 21

fun main()
{
    showMyName() // Empty functions.
    showMyAge(21) // Input parameter functions.
    add(1, 2)
    val mySubtract = subtract(10, 5) // Functions output parameters.
    println(mySubtract)
}

fun showMyName()
{
    println("My name is Leo")
}

fun showMyAge(currentAge:Int = 21)
{
    println("My age is $currentAge years old")
}

fun add(firstNumber:Int, secondNumber:Int)
{
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber:Int, secondNumber:Int):Int
{
    return firstNumber - secondNumber
    //println("This message will not be seen by the return.")
}

fun subtractExampleOneLine(firstNumber:Int, secondNumber:Int):Int = firstNumber - secondNumber

fun numericalVariables()
{
    /**
     * Numerical Variables.
     */

    // Variable num INT (-2, 147, 483, 647 a 2, 147, 483, 647)
    //val age:Int = 21
    var age2:Int = 22

    // Num more big -> Long (-9, 223, 372, 036, 854, 775, 807 a 9, 223, 372, 036, 854, 775, 807)
    val exampleLong:Long = 21

    // Float -> {five decimal places}.
    val floatExample:Float = 21.5f

    // Double -> {fourteen decimal places}.
    val doubleExample:Double = 21.14

    println("Add age + age2:")
    println(age + age2)

    println("Subtract age - age2:")
    println(age - age2)

    println("Multiply age * age2:")
    println(age * age2)

    println("Divide age / age2:")
    println(age / age2)

    println("Module age % age2:")
    println(age % age2)

    var exampleAdd = age + floatExample.toInt()
    //println(exampleAdd)
}

fun alphanumericVariables()
{
    /**
     * Alphanumeric variables.
     */

    // Char -> {It only supports one character}.
    val charExample:Char = 'L'
    val charExample1:Char = '9'
    val charExample2:Char = '#'

    // String -> {It is a garbage container and can withstand anything}.
    val stringExample:String = "S0"
    val stringExample1:String = "S1"

    //println(stringExample + stringExample1) // Concatenation.
    var stringConcatenation:String = "Hello"
    stringConcatenation = "Hello, this is $stringExample1 and I have $age years old"
    println(stringConcatenation)
}

fun booleanVariables()
{
    /**
     * Boolean variables.
     */

    //Boolean -> {True or false}.
    val booleanExample:Boolean = true
    val booleanExample1:Boolean = false
}
