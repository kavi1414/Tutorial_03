object SumEvenNumbers {
  def sumEvenNumbers(nums: List[Int]): Int = {
    var sum = 0
    for (num <- nums) {
      if (num % 2 == 0) {
        sum += num
      }
    }
    sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    val sum = sumEvenNumbers(numbers)
    println("The sum of even numbers in the list is: "+sum)
  }
}
