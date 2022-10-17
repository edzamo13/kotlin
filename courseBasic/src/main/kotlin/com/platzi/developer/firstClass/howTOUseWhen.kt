fun main(arg: Array<String>) {

    val nameColor="Carmesi"
    when(nameColor){
        "Yellow"-> println("The color yellow is the color to Happiness ")
        "Red","Carmesi"-> println("This Color symbolizes the hot")
        else-> println("Error, I Don't have any information of color ")

    }

    val code=501
    when(code){
        in 200..299-> println("All has been ok ")
        in 400..500-> ("All has bee bad")
        else-> println("Code is unKnown. something was wrong ")
    }
}