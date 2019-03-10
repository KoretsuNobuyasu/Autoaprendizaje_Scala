object App {
  def main(args: Array[String]): Unit ={
    var num: Int = 0
    do {
      val problem = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
      problem match {
        case a :: b :: c :: d :: e :: _ =>
          var res =  List(a,b,c,d,a)
          num += 1
          println("No." + num + "...." + res)
        case _ =>
          num += 0
      }
    } while(num < 1000)
  }

}