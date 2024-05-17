fun main(args: Array<String>) {
    var result = findVolume(2,3,10)
    print(result)
}

fun findVolume(lenght : Int , width : Int , height : Int): Int{
    return lenght * width * height
}