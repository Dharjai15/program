object Factorial {
  def main(args: Array[String]): Unit = {
    // Prompt the user for input
    println("Enter a number to calculate its factorial:")
    
    // Read user input as an integer
    val num = scala.io.StdIn.readInt()

    // Variable to store the result
    var result = 1
    
    // Calculate factorial using an iterative loop
    for (i <- 1 to num) {
      result *= i  // Multiply the result by the current number
    }

    // Display the result
    println(s"The factorial of $num is: $result")
  }
}
