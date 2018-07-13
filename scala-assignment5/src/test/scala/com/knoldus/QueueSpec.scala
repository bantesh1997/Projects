package com.knoldus

import org.scalatest.{FunSuite, MustMatchers}

import scala.collection.mutable.ListBuffer

class QueueSpec extends FunSuite with MustMatchers{

  val queue = new Queue with DoubleQueue with SquareQueue

  test("If Queue is empty"){
    val actualResult = queue.dequeue
    val expectedResult=None
    actualResult must equal (expectedResult)
  }

  test("Doubling and Squaring 5") {
    val actualResult = queue.enqueue(5)
    val expectedResult = ListBuffer(50)
    actualResult must equal(expectedResult)
  }
  test("Doubling and Squaring 3") {
    val actualResult = queue.enqueue(3)
    val expectedResult = ListBuffer(50,18)
    actualResult must equal(expectedResult)
  }
  test("Dequeue form queue")
  {
    val actualResult = queue.dequeue
    val expectedResult=Some(50)
    actualResult must equal (expectedResult)
  }
}