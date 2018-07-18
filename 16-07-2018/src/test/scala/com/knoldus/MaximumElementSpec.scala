package com.knoldus

import org.scalatest.{FunSuite, MustMatchers}

class MaximumElementSpec extends  FunSuite with MustMatchers{

  val objct = new MaximumElements

  test("checking for invalid input ") {

    assertThrows[ArrayIndexOutOfBoundsException] {
      objct.maximumElements(List(1, 7, 18, 9, 20, 55))
    }
  }
  test("checking for input less than 5 element") {

    assertThrows[ArrayIndexOutOfBoundsException] {
      objct.maximumElements(List(1, 7, 18, 9))
    }
  }

  test(" checking for valid input  maximum number ") {
    val actualResult = objct.maximumElements(List(11, 13, 10, 15, 9, 23,18))
    val expectedResult = List(90, 75, 65, 55,50)
    actualResult must equal(expectedResult)
  }

}
