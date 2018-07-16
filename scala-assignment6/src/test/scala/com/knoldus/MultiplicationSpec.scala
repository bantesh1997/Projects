package com.knoldus
import org.scalatest.{FunSuite, MustMatchers}
class MultiplicationSpec  extends FunSuite with MustMatchers{

  val multiply= new Multiplication()

  test("checking for positive integer 9")
  {
    val actualResult = multiply.multiplication(9)
    val expectedResult = List(0,9, 18, 27, 36, 45, 54, 63, 72, 81, 90)
    actualResult must equal(expectedResult)
  }

}
