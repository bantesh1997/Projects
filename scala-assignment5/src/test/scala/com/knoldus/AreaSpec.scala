package com.knoldus
import org.scalatest.{FunSuite, MustMatchers}

class AreaSpec extends FunSuite with MustMatchers{

  val testArea = new Area

  test("Checking for area of rectangle"){
    val actualResult = testArea.area("rectangle" , 4, 5, (x, y) => x*y)
    val expectedResult = "Area of rectangle is 20"
    actualResult must equal(expectedResult)
  }
  test("Checking for area of rectangle with negative dimension"){
    assertThrows[ArithmeticException]{
      testArea.area("rectangle" , -4, 5, (x, y) => x*y)
    }
  }

  test("Checking for area of square with unequal sides"){
    val actualResult = testArea.area("square" , 4, 5, (x, y) => x*y)
    val expectedResult = "not defined yet for square"
    actualResult must equal(expectedResult)
  }

  test("Checking for area of square with equal sides"){
    val actualResult = testArea.area("square" , 4, 4, (x, y) => x*y)
    val expectedResult = "Area of square is 16"
    actualResult must equal(expectedResult)
  }

  test("Checking for area of parallelogram"){
    val actualResult = testArea.area("parallelogram" , 4, 5, (x, y) => x*y)
    val expectedResult = "Area of parallelogram is 20"
    actualResult must equal(expectedResult)
  }

  test("Checking for area of parallelogram with negative dimension"){
    assertThrows[ArithmeticException]{
      testArea.area("parallelogram" , -4, 5, (x, y) => x*y)
    }
  }

  test("Checking for area of rhombus"){
    val actualResult = testArea.area("rhombus" , 4, 5, (x, y) => x*y)
    val expectedResult = "Area of rhombus is 20"
    actualResult must equal(expectedResult)
  }

  test("Checking for area of rhombus with negative dimension"){
    assertThrows[ArithmeticException]{
      testArea.area("rhombus" , -4, 5, (x, y) => x*y)
    }
  }


}