class FirstName(val fName: String) extends AnyVal {

}

class LastName(val lName: String) extends AnyVal {

}

class Age(val age: Int) extends AnyVal {

}

object ValueClass extends App {

  def displayDetails(firstName: FirstName, lastName: LastName, age: Age): String = {
    s"${firstName.fName} ${lastName.lName} is of ${age.age}  years"
  }

  val ob1 = new FirstName("Prashant")
  val ob2 = new LastName("Goel")
  val ob3 = new Age(21)
  println(displayDetails(ob1, ob2, ob3))
}