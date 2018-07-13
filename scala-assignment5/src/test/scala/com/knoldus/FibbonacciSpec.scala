package com.knoldus
//import org.scalatest.words.ShouldVerb
import org.scalatest.{FunSuite, MustMatchers}

class FibbonacciSpec extends FunSuite with MustMatchers {


  val testFibonacci = new Fibbonacci

  test("Check for positive integer"){
    val actualResult = testFibonacci.fiboSeries(7)
    val expectedResult = List(0, 1, 1, 2, 3, 5, 8)
    actualResult must equal(expectedResult)
  }

  test("Check for 1"){
    val actualResult = testFibonacci.fiboSeries(1)
    val expectedResult = List(0)
    actualResult must equal(expectedResult)
  }
  test("Check for 2"){
    val actualResult = testFibonacci.fiboSeries(2)
    val expectedResult = List(0, 1)
    actualResult must equal(expectedResult)
  }
  test("Check for negative numbers"){
    assertThrows[ArithmeticException]{
      testFibonacci.fiboSeries(-1)
    }
  }
  test("Check for zero"){
    assertThrows[ArithmeticException]{
      testFibonacci.fiboSeries(0)
    }
  }

}
