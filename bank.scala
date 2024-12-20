import scala.io.StdIn

// Define the BankAccount class
class BankAccount(var balance: Double, val accountHolder: String) {

  // Method to deposit money
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $$${amount}. New balance: $$${balance}")
    } else {
      println("Amount to deposit should be positive.")
    }
  }

  // Method to withdraw money
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $$${amount}. New balance: $$${balance}")
    } else {
      if (amount <= 0) {
        println("Amount to withdraw should be positive.")
      } else {
        println("Insufficient balance!")
      }
    }
  }

  // Method to check the balance
  def checkBalance(): Unit = {
    println(s"Balance for $accountHolder: $$${balance}")
  }
}

object BankApp {
  def main(args: Array[String]): Unit = {
    // Creating a bank account
    println("Enter account holder's name:")
    val name = StdIn.readLine()

    println("Enter initial deposit amount:")
    val initialDeposit = StdIn.readDouble()

    val account = new BankAccount(initialDeposit, name)

    // Menu for performing operations
    var continue = true

    while (continue) {
      println("\nChoose an option:")
      println("1. Deposit")
      println("2. Withdraw")
      println("3. Check Balance")
      println("4. Exit")

      val option = StdIn.readInt()

      option match {
        case 1 =>
          println("Enter deposit amount:")
          val amount = StdIn.readDouble()
          account.deposit(amount)

        case 2 =>
          println("Enter withdrawal amount:")
          val amount = StdIn.readDouble()
          account.withdraw(amount)

        case 3 =>
          account.checkBalance()

        case 4 =>
          continue = false
          println("Exiting... Thank you for using the Bank system!")

        case _ =>
          println("Invalid option. Please choose a valid option.")
      }
    }
  }
}
