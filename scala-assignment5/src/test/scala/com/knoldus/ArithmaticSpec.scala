package com.knoldus
import org.scalatest.words.ShouldVerb
import org.scalatest.{BeforeAndAfter, FunSuite, MustMatchers}

class ArithmaticSpec extends FunSuite with BeforeAndAfter with MustMatchers with ShouldVerb{

 val testArithmatic= new Arithmatic

  test("add two valid integers"){

    val actualResult= testArithmatic.sum(1,2)
    val expectedResult=3
    actualResult must equal(expectedResult)
  }

  test("add two negative numbers"){
      val actualResult = testArithmatic.sum(-1,-2)
      val expectedResult = -3
     actualResult
  }
  test("division of two integers"){
    val actualResult = testArithmatic.division(4,2.0)
    val expectedResult = 2
    assert(expectedResult===actualResult)
  }
  test("devide by 0 case"){
   assertThrows[ArithmeticException] {
     testArithmatic.division(2,0)
   }
  }
}
