
// rangeTo() function and in operator

fun main(args: Array<String>) {
    var  myCharRange="a".rangeTo("j")
    // or
    //  var  myCharRange='a'..'z'
    var myChar="k" in myCharRange
    println(myChar)
    println(myCharRange)



}