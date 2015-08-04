package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5)
    val t2 = Fork(Fork(Leaf('a',2), Leaf('b',3), List('a','b'), 5), Leaf('d',4), List('a','b','d'), 9)
  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }
  test("decodedSecret") {
   Huffman.decodedSecret
  }

  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a','b','d'))
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e',1), Leaf('t',2), Leaf('x',3)))
  }
  
  val extractedLocalValue = times(List('a', 'b', 'a')) 
  test("test times simple") {
      printTimesList(extractedLocalValue)
    assert(extractedLocalValue=== List(('b', 1),('a', 2)))
  }
  def printTimesList(list: List[(Char,Int)]) = list.foreach(pair => println(pair)) 
  
  test("test singleton") {
      val s1 = singleton(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))))
      assert(!s1)
      val s2 = singleton(makeOrderedLeafList(List(('t', 2))))
      assert(s2)
  }
  
  test("combine simple"){
    val emptyList = List()
    assert(combine(emptyList) == emptyList)
    val listWithSingleElement = List(Leaf('a',1))
    assert(combine(listWithSingleElement) == listWithSingleElement)
  }
  
  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e',1),Leaf('t',2),List('e', 't'),3), Leaf('x',4)))
  }

  test("until"){
    new TestTrees {
      assert(until(singleton, combine)(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))).size === 1)
    }
    
  }
  
  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }
  
  test("decode and quickEncode a very short text should be identity") {
    new TestTrees {
      assert(decode(t2, quickEncode(t2)("abdadbdadbdadddbdddadddbdabab".toList)) === "abdadbdadbdadddbdddadddbdabab".toList)
    }
  }
  
  
  test("create code tree"){
    println(createCodeTree(string2Chars("create code tree")))
  }
}
