package com.knoldus

import org.scalatest.{FunSuite, MustMatchers}

class EmployeeSpec extends FunSuite with MustMatchers {
  val empData = Map(1 -> 18000.0, 2 -> 25000.0, 3 -> 10000.0, 4 -> 36000.0, 5 -> 50000.0, 6 -> 35000.0, 7 -> 40000.0)
  val testMap = new Employee

  test("Checking for find employees function"){
    val actualResult = testMap.findEmployees(empData)
    val expectedResult = Set(4, 5, 7)
    actualResult must equal(expectedResult)
  }

  test("Checking for revise salary function"){
    val actualResult = testMap.reviseSalary(empData)
    val expectedResult = Map(1 -> 36000, 2 -> 37500, 3 -> 20000, 4 -> 54000, 5 -> 62500, 6 -> 52500, 7 -> 60000)

    actualResult must equal(expectedResult)
  }

}
