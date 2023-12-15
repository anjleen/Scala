class Cat(name:String, breed:String, age:Int, color:String) {
  println("Name: " +name);
  println("Breed: " +breed);
  println("Age: " +age);
  println("Color: " +color);
}

object Creating_Obj {
  def main(args: Array[String]): Unit = {
    var obj = new Cat("Angela", "Persian", 5, "Grey")
  }
}
