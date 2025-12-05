fun main(args: Array<String>) {
    var name: String?=readLine()
    // 0r
    var name2: String=readLine()!!

    println(name2)
    println(name)

    //its always returns the data in String

    var age: Int=readLine()!!.toInt()
    println(age)

    print("enter your name : ")
    var n3: String=readLine()!!
    print("enter your age :   ")
    var n4: Int=readLine()!!.toInt()
    print("your name is $n3 and you are $n4" )
}