fun main() {
    println("Hellow , world!..")
    secondExample()
    example()
    usingFruits()
    operatorElvis()
    println("example")
 var stringMifuncion=   miFuncion("Andrea","Gomez")
    println(stringMifuncion)
}

fun secondExample(){
    println("Happy Birthday!..")
}

fun example() {
    val age = 24
    val layers = 5
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)

}

fun printCakeBottom(age: Int, layers: Int) {

}

fun printCakeTop(age: Int) {

}

fun printCakeCandles(age: Int) {

}

fun usingFruits(){
    var listFruits= listOf("Lemon","Apple","Banana","Grapes")
    listFruits.forEach { f-> println("This fruits is: $f ")}
}

fun operatorElvis(){
    var name:String?=null
    val caracterOfName: Int= name?.length?:0
    println(caracterOfName)
}

fun miFuncion(nombre: String, apellido: String): String {
    println("llego!..")
    return nombre + apellido
}