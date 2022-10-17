fun main(args: Array<String>) {
    usingRun()
}

fun usingOther() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3").also { lista ->
        println("El valor original de la lista es $lista")
    }.asReversed()
    println(moviles)
}


fun usingRun() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Huawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
            this
        }
    println(moviles)
}