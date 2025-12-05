fun main(args: Array<String>) {
    /*
    Syntax
    for(i in 0..10)  0..10 range from 0 to 10, i is the variable which loops through the range
    {
       code to be executed
    }
     */

    // print number from 0 to 10
    for (number in 0..10)
    {
        println(number)
    }


    var sum: Int=0
    for(i in 1..10)
    {
        sum+=i
    }
    println(sum)

    var fruits=arrayListOf<String>("Apple", "Banana", "Pear", "Grape")
    fruits.add("Mango")
    for (fruit in fruits)
    {
        println(fruit)
    }
    for (fruit in 0..(fruits.size)-1)
    {
        println(fruits[fruit]+" - "+ "index${fruit}") // prints the indices of fruits array
    }
   println("*****************************************************************")

    // For each
    var friuts=arrayListOf<String>("mango","apple","banana", "pear","grape")
    fruits.forEach { println(it) }
}