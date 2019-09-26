object MyUselessClass {
  def staticMethod(x: Int) = x + 5

  def apply(immutableField: Int): MyUselessClass = new MyUselessClass(immutableField, 2)

  def apply(immutableField: Int, mutableField: Int): MyUselessClass = new MyUselessClass(immutableField, mutableField)

  def apply(immutableField: Int, mutableField: Int, privateField: Int): MyUselessClass = new MyUselessClass(immutableField, mutableField, privateField)

  class MyUselessClass(val immutableField: Int, var mutableField: Int, privateField: Int = 8) {
    def instanceMethod() = {
      val sumOfFields = immutableField + mutableField + privateField
      MyUselessClass.staticMethod(sumOfFields)
    }
  }


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
