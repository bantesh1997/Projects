package com.knoldus


  class Firstname(val fName : String) extends AnyVal{

  }

  class Lastname(val lName : String) extends AnyVal{

  }
  class Age(val age : Int) extends AnyVal{

  }

  class ValueClass {

    def displayDetail(first :Firstname,last :Lastname,age :Age): String =
    {
      s"${first.fName} ${last.lName} is of ${age.age}"
    }

}
