fun main(args: Array<String>) {
    //immutable
    var dataOfStudent=mapOf<String, Int>("sahil" to 21,"david" to 67)
    println(dataOfStudent["sahil"])
    println(dataOfStudent["david"])


    // Mutable
    var muteDataOfStudent=mutableMapOf<String, Int>("sahil" to 21,"david" to 67)
    muteDataOfStudent.put("Nida" ,23)
    println(muteDataOfStudent["sahil"])
    println(muteDataOfStudent["david"])
    println(muteDataOfStudent["Nida"])
}