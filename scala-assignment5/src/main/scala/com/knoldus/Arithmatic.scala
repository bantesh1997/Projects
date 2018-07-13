package com.knoldus

class Arithmatic {


    def sum(number1:Int,number2:Int):Int={
      number1+number2
    }

    def division(number1:Int,number2:Double):Double={

      if(number2==0)
        throw new ArithmeticException
          else
        {
          number1/number2
        }
    }
  }

