package kotlinplayground.basic

import kotlinplayground.functions.courseName
import kotlinplayground.functions.topLevelFunction

fun main() {
    val name: String = "Edwin"
    println("name Inmutable :" + name)

    var age: Int = 40
    println("Value of Age:$age")

    age = 41
    println("change value of age:$age")


    // String interpolation ${}
    val nameCourse = "Curso Kotlin"
    println("size of de course is ${nameCourse.length}")

    val cadSpace=" ABC\n DEF"
    println(cadSpace)

    val multipleLine="""
        ABC
        DEF
     """.trimIndent()
    println(multipleLine)

    topLevelFunction();
    println(" course Name is $courseName" )
}