object MyApp{
  // comment

  /*
  comment
  comment
  comment
   */
  def main(args: Array[String]): Unit = {
    //　変数
    // - val:あたいの再代入ができない immutable
    // - var:あたいの再代入ができる mutable
    //val msg: String = "Hello World"
    // val msg = "Hello World"  型推論
    //println(msg)


    // 整数　Byte Short Int Long
    val i = 5
    val l = 555555555555L
    //　浮動小数点数う Float Double
    val d = 32535.5 //ダブル型
    val f = 234.34F //フロート型
    // 文字 Char
    val c = 'c'
    //文字列 String
    val s = "Hello"
    // 特殊文字 \n: 改行  \t:タブ

    // 論理値 Boolean
    val flag = true // false

    val msg = "Hello W\norl\td"
    println(msg)

  }
}
