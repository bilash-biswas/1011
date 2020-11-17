import java.util.Scanner

fun main(args: Array<String>){
    val read = Scanner(System.`in`);
    val pi = 3.14159
    var a = read.nextInt()
    println("VOLUME = %.3f".format((4.toDouble() / 3) * pi * a * a * a))
}
