fun main(args: Array<String>) {
    var variable=arrayListOf<Any>("nida",'S',23,23,56,true,false)
    println(variable.size)
    println(variable.last())


    var setVariable=setOf<Any>("nida",'S',23,23,56,true,false,"nida")
    println(setVariable.size)
    println(setVariable.last())
}