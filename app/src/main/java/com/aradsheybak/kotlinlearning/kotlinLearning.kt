package com.aradsheybak.kotlinlearning

fun main(){
    //variables
    //variables use for string values and we have 2 options for declaring variables
    // option 1 -> using var keyword
    // option 2 -> using val keyword
    // declaring variables with opt.1 and opt.2 are same and is like below:
    // var variableName = Value or val variableName= Value
    var firstName = "Arad"
    val age = 28

    println(firstName)
    println(age)

    //difference between var and val
    // var is mutable and can be changed, in other hand val is immutable and it's read-only and you cant change it while the project

    firstName = "Arad2"
    println(firstName)
}