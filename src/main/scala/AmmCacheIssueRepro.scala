package test

object AmmoniteShell {
  def main(args: Array[String]): Unit = {
    ammonite.Main(
      predef = "import test.TestObject._"
    ).run()
  }
}

object TestObject {
  val valX = 1
  val valZ = 2
}
