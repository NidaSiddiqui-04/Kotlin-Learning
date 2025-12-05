import kotlin.random.Random

/*
Syntax

var i = 1 initialization
while(condition)
{
   //code to executed
   i++
}

 */

fun main(args: Array<String>) {
    // while loop
    var i : Int = 0
    var sum: Int =0
    while (i <= 10){
        println(i)
        sum+=i
        i++
    }
    println(sum)

    // infinite loop
    val num=Random.nextInt(0,100)// generating random number in kotlin
    println("please enter a number : ")
    while (true){
        val number =readLine()!!.toInt()
        if (number==num){
            println("Congratulations you guessed the number!")
            break
        } else if (num>number)
        {
            println("Increased the number!")
        }else{
            println("Decreased the number!")
        }
    }

}