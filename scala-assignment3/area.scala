object area extends App {

def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String = {

shape match{

case "rectangle" => f(first, second).toString

case "square" => if (first != second) "Not defined" else f(first, second).toString

case "parallelogram" => f(first, second).toString

case "rhombus" => f(first, second).toString

case _ => "Not defined".toString

}
}

println(area("square", 4, 5, (x,y) => x*y))

println(area("rhombus",4,5,(x,y)=>x*y))


}
