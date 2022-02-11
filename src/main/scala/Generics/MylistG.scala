package Generics
abstract class MylistG[+A] {
  def head:A
  def tail: MylistG[A]
  def isempty : Boolean
  def add[B>:A](element :B) : MylistG[B]
}
object Empty extends MylistG[Nothing]{
  def head:Nothing = throw new NoSuchElementException
  def tail:MylistG[Nothing] =throw new NoSuchElementException
  def isempty : Boolean = true
  def add[B>:Nothing](element:B): MylistG[B] = new Cons(element ,Empty)
}
  class Cons[+A](h:A, L : MylistG[A]) extends MylistG[A] {
    def head: A = h
    def tail : MylistG[A]=L
    def isempty : Boolean = false
    def add[B>:A](element:B): MylistG[B] = new Cons(element ,this)
  }
  object List extends App {
    val listint:MylistG[Int] = new Cons(3,new Cons(2, new Cons(1,Empty)))
    val liststr:MylistG[String] = new Cons("hi",new Cons("how're", new Cons("you",Empty)))
    println(listint.tail.head)
    println(liststr.head)

  }



