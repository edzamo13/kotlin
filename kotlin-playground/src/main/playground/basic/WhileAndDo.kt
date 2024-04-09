package kotlinplayground.basic

fun main() {

    exploringWhile()
    exploringDo()
}

private fun exploringWhile() {
    var x = 1
    while (x < 5) {
        println("Value of x: $x")
        x++
    }
}

fun exploringDo() {
    var x = 1
    do {
        println("Value of the x: $x")
        x++
    } while (x < 5)
}