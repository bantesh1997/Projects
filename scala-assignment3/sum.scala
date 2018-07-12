object sum extends App{
 
def sum(f: Int => Int,a: Int, b:Int): Int = f(a)+f(b)

def intFunction(x:Int):Int = x

def squareFunction(x:Int):Int = x*x

def cubeFunction(x:Int):Int = x*x*x

val resultOfInt = sum(intFunction, 6,7)

println(s"Sum of ints = $resultOfInt")

val resultOfSquare = sum(squareFunction, 8, 5)

println(s"Sum of squares = $resultOfSquare")

val resultOfCube = sum(cubeFunction, 1, 3)

println(s"Sum of cubes = $resultOfCube")

}
