fun main(args: Array<String>) {
    println("Enter two numbers: ")
    val num1= readLine()!!.toInt()
    val num2=readLine()!!.toInt()



    addNumbers(num1, num2)
}

fun addNumbers(x:Int,y:Int): Unit{
    println("you entered $x and $y")
    var sum=0f;
    sum+=x + y;
    println("sum = $sum")

}

