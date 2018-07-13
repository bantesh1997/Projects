package com.knoldus

import org.scalatest.{FunSuite, MustMatchers}

class PersonSpec extends FunSuite with MustMatchers{

  val p1=new Person("test",24)
  val p2=new Person("test",25)
  val p3=new Person("test2",21)

  test("comparing p1 and p2") {
    val actualResult = p1<p2
    val expectedResult = true
    actualResult must equal(expectedResult)
  }
  test("comparing p2 and p3") {
    val actualResult = p3<p2
    val expectedResult = false
    actualResult must equal(expectedResult)
  }
}