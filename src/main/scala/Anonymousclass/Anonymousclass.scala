package Anonymousclass

object Anonymousclass extends App{
  abstract class Animal {

    def eat: Unit
  }

  // class Anonymousclass$$anon$1 extends animal {
  // override def eat: Unit = println("ahahah")
  //anon class
  val funanimal: Animal = new Animal {
    override def eat: Unit = println("ahahah")
    eat
  }

}
