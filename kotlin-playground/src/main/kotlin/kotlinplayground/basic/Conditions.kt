package kotlinplayground.basic

fun main() {

    usingIf()
    usingWhen()
}

fun usingIf() {
    val name = "Edwin"
    val nameSecond = "Jose"
    val resul = if (name.equals("hola")) {
        println("Here!.")
        "The value is ok"
    } else {
        println("Other Here!.")
        "The Value is wrong "
    }
    println("The result is: $resul")
}

fun usingWhen() {
    val position = 10
    val result = when (position) {
        1 -> {
            "Gold"
        }
        2 -> {
            "Blue"
        }
        3 -> {
            "Black"
        }
        else -> {
            "White"
        }
    }

    println("the result when is: $result")
}