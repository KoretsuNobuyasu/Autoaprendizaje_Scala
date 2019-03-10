object App {
  class Point3D(_x: Int, _y: Int, _z: Int){
    val x = _x
    val y = _y
    val z = _z
  }
  def main(args: Array[String]): Unit = {
    val p = new Point3D(10, 20, 30)
    println(p.x)
    println(p.y)
    println(p.z)
  }
}