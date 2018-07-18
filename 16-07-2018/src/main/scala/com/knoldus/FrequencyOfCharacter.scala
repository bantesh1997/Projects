package com.knoldus
import scala.collection.mutable
class FrequencyOfCharacter {

  def calculate(str: String): mutable.Map[Char, Int] = {

    str.foldLeft(mutable.Map[Char, Int]()) { (m, c) => m + (c -> (m.getOrElse(c, 0) + 1)) }

  }
}