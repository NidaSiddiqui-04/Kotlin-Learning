/*
toByte()
toShort()
toInt()
toLong()
toFloat()
toDouble()

Double>Float>Long>Int>Short>Byte
byte to int ✔️
Short to int,long,float,double ✔️

double to float,long...  ❌ you may lose the data
*/


fun main()
{
    var a: Byte=120
    var b: Long = a.toLong()
    var c: Float=b.toFloat()
    println(a)
    println(b)
    println(c)
}