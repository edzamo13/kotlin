package kotlinplayground.basic

fun main() {

    val range = 1..10
    for (i in range) {
        println("i : $i ")
    }

    val reverseRange = 10 downTo 1
    for (i in reverseRange){
        println("i : $i")
    }

    for (i in reverseRange step 2){
        println("i with skip : $i")
    }
}