package com.knoldus

class Sum {


  def sum(f: Int => Int,a: Int, b:Int): Int = f(a) + f(b)
  def int(x:Int):Int = x
  def square(x:Int):Int = x*x
  def cube(x:Int):Int = x*x*x

}
