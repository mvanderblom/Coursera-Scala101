package funsets

import scala.annotation.tailrec

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))
}
