object HelloWorld {
  def main(args:Array[String]) : Unit = {
    println("Hello World")
    class Foo(x: String){
      def bar(y: String) = x + y;
    }

    val foo = new Foo("sda")

    foo.bar("sada")
    println(foo.bar("asda"))
  }
}


