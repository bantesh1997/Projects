
class Person(val name: String, val age: Int) extends Ordered[Person] {

  override def compare(that: Person): Int = {

    if (this.name == that.name) {
      this.age - that.age
    }
    else {

      this.name.length - that.name.length
    }

  }
}

object check extends App {
  val p1 = new Person("testadghhgj", 24)
  val p2 = new Person("testdf", 25)
  println(p1 < p2)
}