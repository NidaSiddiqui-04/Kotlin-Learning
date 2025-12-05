fun main(args: Array<String>) {
    var age=arrayListOf<Int>()
    age.add(23)
    age.add(34)
    age.add(45)
    println(age[0])
    println(age[1])
    println(age[2])
    age.add(0,100)
    println(age[0])
    println(age[1])
    println(age[2])

    age.remove(100)
    println(age[0])
    println(age.size)
    println(age[1])
    println(age[2])


    var cars= ArrayList<String>()
    cars.add("Ford")
    cars.add("Mercedes")
    println(cars[0])
    println(cars[1])

    var data= ArrayList<Any>()
    data.add("nida")
    data.add(23)
    data.add('n')
    data.add(9.34)
    println("${data[0]}, ${data[1]}, ${data[2]} ,${data[3]}")
}