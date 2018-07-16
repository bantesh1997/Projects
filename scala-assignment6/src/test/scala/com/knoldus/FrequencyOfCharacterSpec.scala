package com.knoldus
import scala.collection.mutable
import org.scalatest.{FunSuite, MustMatchers}

class FrequencyOfCharacterSpec extends FunSuite with MustMatchers{

  val testFrequency = new FrequencyOfCharacter()

  test("Checking for valid list"){
    val actualResult = testFrequency.calculate("i am indian")
    val expectedResult = Map('i' -> 3, 'a' -> 2, 'm' -> 1, 'n' -> 2, 'd' -> 1,' ' ->2)
    actualResult must equal(expectedResult)
  }

}
