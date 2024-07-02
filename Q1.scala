object Q1 {
  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter a string: ")
    val reversedString = reverseString(inputString)
    println(reversedString)
  }

  def reverseString(s: String): String = {
    if (s.isEmpty) {
      ""  
    } else {
      reverseString(s.tail) + s.head  
    }
  }
}
