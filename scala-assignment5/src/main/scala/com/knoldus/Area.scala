package com.knoldus

class Area {
  def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = {

    if(first > 0 && second >0) {

      shape match {
        case "rectangle" => s"Area of $shape is ${f(first, second).toString}"
        case "square" => if (first != second) "not defined yet for square" else s"Area of $shape is ${f(first, second).toString}"
        case "parallelogram" => s"Area of $shape is ${f(first, second).toString}"
        case "rhombus" => s"Area of $shape is ${f(first, second).toString}"
        case _ => s"$shape is not defined"
      }
    }
    else throw new ArithmeticException()
  }

}
