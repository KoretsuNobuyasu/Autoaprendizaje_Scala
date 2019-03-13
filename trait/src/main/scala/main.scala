trait A {
  val foo: String
}

trait B extends A {
  val bar = foo + "world"
}

class C extends B {
  lazy val foo = "Hello"

  def printBar(): Unit =  println(bar)
}

object App {
  def main(args: Array[String]): Unit = {
    val c = new C()
    c.printBar()
  }
}