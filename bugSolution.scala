```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor explicitly sets x to 0
}

object Main extends App {
  val myObject = new MyClass()
  println(myObject.x) // Prints 0
  val myObject2 = new MyClass(5)
  println(myObject2.x) // Prints 5
}
```
The solution explicitly assigns a default value (0) to `x` in the auxiliary constructor. This ensures `x` is always properly initialized, regardless of how `MyClass` is instantiated.