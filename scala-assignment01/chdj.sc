class BankAccount {

  private var balance = 0;


  def deposit(amt: Int): Unit = {
    balance = balance + amt;
    println("Deposit Ammount Is =" + balance)

  }


  def withdraw(amt: Int): Unit = {

    if (balance > amt) {
      balance = balance - amt;
      println("Your amount withdrawn sucessFully \n Your Remaining balance is=" + balance)
    } else {
      println("Your balance is low Please enter valid amount")
    }

  }
}

object BankDemo {
  def main(args: Array[String]): Unit = {
    var bankAccount = new BankAccount()
    bankAccount.deposite(100000)
    bankAccount.withdraw(600)
  }
}