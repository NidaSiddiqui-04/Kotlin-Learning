fun main(args: Array<String>) {
    /*
    + Unary plus operator
    _ Unary minus operator
    ++ increment operator
    -- decrement operator
    ! logical complement operator ( it inverts the value of a boolean)
     */

    var number: Double=73.58
    var isCheck: Boolean=true
    println("+number is :${+number}")
    println("-number is :${-number}")
    println("++number is :${++number}")
    println("--number is :${--number}")
    println("!isCheck is :${!isCheck}")


    var num: Int=34
    println("num++ is :${num++}")  //post increment
    println("num is :${num}")
    println("++num is :${++num}")  //pre increment
    println("num is :${num}")


}