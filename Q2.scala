object Q2 {
  def main(args: Array[String]): Unit = {
    val inputList = List("Scala", "Programming", "Hello", "World", "OpenAI", "GPT-4")
    val filteredList = filterStrings(inputList)
    println("Filtered list:"+filteredList)
  }

  def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }
}
