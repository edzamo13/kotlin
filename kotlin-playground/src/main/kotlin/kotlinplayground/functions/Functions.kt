package kotlinplayground.functions

import java.time.LocalDate

fun main() {
    printName("Elvin")
    val result: Int = addition(2, 2)
    println("Result of addition is : $result")

    val resultApproach: Int = additionApproach(2, 2)
    println("Result of approach $resultApproach")

    printVoidFunction("This a message!..")

   // printPersonDetails("Dilip", "abc@hotmail.com", LocalDate.parse("2000-01-01"))
    printPersonDetails("Edwin !.")
    printPersonDetails(name = "I know this name" , dob = LocalDate.parse("2000-01-01"))

}

fun printPersonDetails(name: String, email: String = "", dob: LocalDate = LocalDate.now()) {
    println("Name is: $name and the email is $email and the dob is $dob")
}

fun additionApproach(x: Int, y: Int): Int = x + y


fun addition(i: Int, i1: Int): Int {
    return i + i1
}


fun printName(name: String) {
    println(" The name is $name")
}

fun printVoidFunction(unit: String): Unit {
    println(unit)
}


