
import patmat.Huffman

object week4 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 
  println("Welcome to the Scala worksheet");$skip(20); 
  val a1 = new A(1);System.out.println("""a1  : A = """ + $show(a1 ));$skip(19); 
  println(a1.aaaa);$skip(18); 
  val a2 = A(2,4);System.out.println("""a2  : A = """ + $show(a2 ));$skip(19); 
  println(a2.aaaa);$skip(11); val res$0 = 
  Nil.size;System.out.println("""res0: Int = """ + $show(res$0));$skip(32); 
  val a = Huffman.decodedSecret;System.out.println("""a  : List[Char] = """ + $show(a ));$skip(21); 
  
  
  println("a");$skip(4); val res$1 = 
  a;System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(33); 
  
  println(Huffman.frenchCode);$skip(48); val res$2 = 
 List("aa", "cc" ).filterNot(_.endsWith(".js"));System.out.println("""res2: List[String] = """ + $show(res$2));$skip(34); 

val f = new java.io.File("aaaa");System.out.println("""f  : java.io.File = """ + $show(f ));$skip(16); val res$3 = 
f.isDirectory();System.out.println("""res3: Boolean = """ + $show(res$3));$skip(10); val res$4 = 
f.getName;System.out.println("""res4: String = """ + $show(res$4))}
}


class A (x:Int){
	def aaaa = x
}

object A{
	def apply(a :Int, b:Int) = new A(a+b)
}
