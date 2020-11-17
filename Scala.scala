object Main {
  def main(args:Array[String]){
    var a = scala.io.StdIn.readInt()
    val n = 3.14159
    println("VOLUME = %.3f".format((4.toDouble / 3) * n * a * a * a))
  }
}
