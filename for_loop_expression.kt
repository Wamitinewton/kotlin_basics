fun main(args:Array<String>){
    for (i in 1..10){
        if (i % 2 == 0){
            println(i)
        }
    }
    println("Done")

    for (i in 10 downTo 1){
        if (i % 2 == 0){
            println(i)
        }
    }
}