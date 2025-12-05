fun main(args: Array<String>) {
    /*
    Syntax

    when(expression){
    value1 -> // code to be executed
    value2 -> //code to be executed
    .
    .
    .
    valueN -> //code to be executed
    else -> //if all cases are false,code to be executed
    }

    -> this expression is called the lambda
     */


    print("Please enter a day number of week : ")
    var dayNumber = readLine()!!.toInt()
    var day: String

    when(dayNumber){
        1 -> day = "Monday"
        2 -> day = "Tuesday"
        3 -> day = "Wednesday"
        4 -> day = "Thursday"
        5 -> day = "Friday"
        6 -> day = "Saturday"
        7 -> day = "Sunday"
        else  -> day = "Invalid day"







    }
    println("Day is ${day}")
}