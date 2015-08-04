package recfun
import common._
import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance1(chars: List[Char]): Boolean = {
    @tailrec
    def loop(parens: List[Char], chars: List[Char]): Boolean = {
      if (parens.isEmpty && chars.isEmpty) true
      else if (chars.isEmpty && !parens.isEmpty) false
      else if (chars.head == ')' && !parens.isEmpty && parens.head == '(') {
        loop(parens.tail, chars.tail)
      } else if (chars.head == '(' || chars.head == ')') {
        loop(chars.head :: parens, chars.tail)
      } else {
        loop(parens, chars.tail)
      }
    }
    loop("".toList, chars)
  }
  
  /**
   * Exercise 2.2
   */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def loop(someChars: List[Char], counter: Int): Boolean = {
      if(counter < 0) false
      else if (someChars.isEmpty && counter == 0) true
      else if (someChars.head == ')') loop(someChars.tail, counter - 1)
      else if (someChars.head == '(') loop(someChars.tail, counter + 1)
      else loop(someChars.tail, counter)
    }
    loop(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def tryToDivide(someMoney: Int, coins: List[Int]): Int = {
      if(someMoney == 0) 1
      else if (coins.isEmpty) 0
      else if (coins.head > someMoney) tryToDivide(someMoney, coins.tail)
      else tryToDivide(someMoney-coins.head, coins) + tryToDivide(someMoney, coins.tail)
    }
    
    if(money == 0 || coins.isEmpty) 0
    else tryToDivide(money, coins.sortWith((x,y)=>x>y));
  }
}
