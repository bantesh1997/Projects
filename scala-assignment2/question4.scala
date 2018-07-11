class BankAccount {

  private var balance=0

  def Deposite(var x: Int): Int ={
    balance = balance + x
  }

  def Withdraw(var x: Int): Int ={

    if (x < balance)
{
    balance = balance - x
 
}   else
 {
    println ("please enter valid amount")
    //balance
  }

  }

  def main(args: Array[String]):Unit = {
    BankAccount bank = new BankAcount
    bank.Deposite(100)
    bank.Withdraw(200)
  }

}
