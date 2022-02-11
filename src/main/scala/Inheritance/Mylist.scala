package Inheritance

abstract class Mylist {
    def head: Int
    def tail: Mylist
    def isempty : Boolean
    def add(element :Int) : Mylist
  }
  object Empty extends Mylist{
    def head:Int = throw new NoSuchElementException
    def tail:Mylist =throw new NoSuchElementException
    def isempty : Boolean = true


    def add(element:Int): Mylist = new Cons(element ,Empty)
  }


  class Cons(h:Int, L : Mylist) extends Mylist {
    def head = h
    def tail=L
    def isempty : Boolean = false
    def add(element:Int) : Mylist = new Cons(element , this)

  }
  object List extends App {
    val list = new Cons(3,new Cons(2,new Cons(1,Empty)))
    println(list.head)
    println(list.tail.head)
    println(list.isempty)

  }

