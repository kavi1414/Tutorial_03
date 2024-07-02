object Q3 {
  def arithmeticMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
  BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = scala.io.StdIn.readLine("Enter the first number: ").toInt
    val num2 = scala.io.StdIn.readLine("Enter the second number: ").toInt
    val result = arithmeticMean(num1, num2)
    println("Arithmetic mean of num1 and num2 is:"+result)
  }
}
