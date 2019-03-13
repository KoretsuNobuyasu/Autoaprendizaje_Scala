class Person(name: String, age: Int, private val weight: Int)

object Person{
  def printweight(): Unit ={
    val taro = new Person("Taro", 22, 70)
    println(taro.weight)
  }
  def main(args: Array[String]): Unit = {
    printweight()
  }
}