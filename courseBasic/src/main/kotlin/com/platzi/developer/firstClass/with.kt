fun main(args: Array<String>) {
    usingWith()
}


fun usingWith(){
    var colors= listOf("Blue","Green","White","Balck")
    with(colors){
        println("The list colors is: $this ")
        println("The size of list $size")
    }
}