fun main(args: Array<String>) {
    val x = 100

    val str: String = when(x){
        1 -> "x is 1"
        2 -> "x is 2"
        else -> {
            "x is neither 1 nor 2"
            "x is an alien"
        }
    }
    println(str)
}