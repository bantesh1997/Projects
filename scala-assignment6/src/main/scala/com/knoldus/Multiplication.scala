package com.knoldus

class Multiplication {

  def multiplication(inputNumber:Int):List[Int]={

    val list=(0 to 10).toList
    list.map(_ * inputNumber)
  }

}
