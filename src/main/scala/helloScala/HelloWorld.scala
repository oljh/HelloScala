package helloScala

object HelloWorld {
  def main(args:Array[String]) : Unit = {
    println("Hello World")
    class Foo(x: String){
      def bar(y: String) = x + y
    }

    trait Foo2[A]{
      def bar[B,C](a:A, b:B): C //метод который принимает аргументы типа А и В и возваращает С
    }

    val foo = new Foo("sda")
    foo.bar("sada")
    println(foo.bar("asda"))

    //вызов метода apply
    val myUselessObject = MyUselessClass.apply(1)


    //аналогичный предыдущему варианту
    val myAnotherUselessObject = MyUselessClass.apply(1)

    //третий конструктор
    val myTherdUselessObject = MyUselessClass(1, 2, 3)

    //вызов метода
    myUselessObject.instanceMethod()

    //Поля доступны также, как методы
    myUselessObject.mutableField

    myUselessObject.immutableField

    myUselessObject.mutableField = 9

    myUselessObject.mutableField

    //Вызов статического метода
    MyUselessClass.staticMethod(3)


  }
}
