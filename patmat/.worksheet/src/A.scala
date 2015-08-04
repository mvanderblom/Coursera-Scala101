
class A (x:Int){
	def aaaa = x
}

object A{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
	def apply(a :Int, b:Int) = new A(a+b);System.out.println("""apply: (a: Int, b: Int)A""")}
}

object week4 {
  println("Welcome to the Scala worksheet")
  val a1 = new A(1)
}
