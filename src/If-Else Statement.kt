fun main(args: Array<String>) {
    // check the entered number is either even or odd

    /*
    if-statement
    if-else statement
     */
    print("Please enter a number : ")
    var num: Int=readLine()!!.toInt()

    if (num%2==0){
        println("$num is even")
    }else
    {
        println("$num is odd")
    }

    /*
    if-else-if ladder
    nested if
     */

    print("Please enter your age : ")
    var age: Int=readLine()!!.toInt()

    if(age<=13){
        println("you are a child")


    }else if(age<=19){
        println("you are a teenage")
    }else{
        if (age<65){
            println("you are an adult")
        }else{
            println("you are a senior")
        }
    }


}