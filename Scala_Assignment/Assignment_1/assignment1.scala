package Assignment

object assignment1 extends App {

  /*1- Create a new string which is 4 copies of the 2 front characters of a given string.
     If the given string length is less than 2 return the original string
   */
  def aString (str: String):String = {

    if (str.length <=2 ) str
    else (str.substring(0,2))*4

  }
  println("Result: " + aString("Scala"))
  println("Result: " + aString("string"))

  /*2- Remove the character in a given position of a given string.
    The given position will be in the range 0...string length -1 inclusive.
     */

  def strring (str: String, i: Int):String ={
    str.take(i) + str.drop(i+1)
  }
  println("Result : "+ strring("java", 0 ))
  println("Result : "+ strring("java", 1 ))

  /* 3-Create a new string with the last char added at the front and back of a given string of length 1 or more.
    */

  def str3 (str: String) :String = {
    if ((str.length) <= 1) str
    else (str.charAt((str.length) - 1) + str + str.charAt((str.length) - 1))
  }
  println(str3("hello"))
  println(str3("world"))

  /*4: Create a new string where 'if' is added to the front of a given string.
   If the string already begins with 'if', return the string unchanged.
    */
  def string(str: String):String = {
    if ( str.startsWith("If")) str
    else ( "If" + str)
  }
  println(string(" I am happy "))
  println(string("If i was happy"))

  /*5-Check which number is nearest to the value 100 among two given integers.
    Return 0 if the two numbers are equal.
  */

  def checkNumber(num1 :Int , num2 : Int) : Int = {
    val aNum1 = Math.abs(num1 - 100)
    val bNum2 = Math.abs(num2 - 100)
    if (aNum1 == bNum2) 0
    else if (aNum1 < bNum2) num1
    else num2
  }
  println(" the number is : " + checkNumber(110,120))

  /*6-Check whether two given integers are in the range x <= 20 to y >= 50 or y <= 20 to x >= 50,
     return true if the given numbers are within the range, or if the numbers are out of range return false
   */

  def numRange( x: Int, y: Int): Boolean ={
    if (( x<=20 & y >= 50 ) || ( y <= 20 & x >= 50)) true
    else false
  }
  println(numRange(20,31))
  println(numRange(5,8))
  /*7- Write a Scala program to check whether a specified character is happy or not.
  A character is happy when the same character appears to its left or right in a string.
 */
  var CheckAlpha = true
  def checkChar(str: String, x:Char): Boolean = {
    for( i <- 0 until  str.length-1){
      if( str.charAt(i) == x){
        if (i >0 && str.charAt(i - 1) == x )
          CheckAlpha = true
        else if ( i < str.length-1 && str.charAt(i + 1)== x)
          CheckAlpha = true
        else CheckAlpha = false
      }
    }
    CheckAlpha
  }
  var strcheck1 = "result"
  var x = 'a'
  println("The given string is: " + strcheck1);
  println(s"is $x is happy " + checkChar(strcheck1, x))

  strcheck1 = "error"

  x = 'b'
  println("The given string is: " + strcheck1);
  println(s"is $x is happy " + checkChar(strcheck1, x))

}

