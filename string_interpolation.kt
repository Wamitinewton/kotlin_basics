fun main(args: Array<String>){
    var rect  = Rectangle()
    rect.length = 5
    rect.width = 3
    print("area is ${rect.length * rect.width}")

}

class Rectangle{
    // have mutable objects in the class

    var length: Int = 0

    var width: Int = 0

}