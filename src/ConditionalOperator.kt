fun main(args: Array<String>) {
    /*
    && conditional AND operator
    || condtional OR operator
     */


    var a: String="hello"
    var b: String="world"

    println(a.length==b.length && a.equals("hello"))
    println(a.equals("world") && a!=b)
    println(a.equals("world") || a!=b)


}