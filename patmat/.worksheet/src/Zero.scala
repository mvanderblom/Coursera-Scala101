

abstract class Nat{
 def isZero: Boolean
 def predecessor: Nat
 def successor = new Succ(this)
 def + (that:Nat):Nat
 def - (that:Nat):Nat
}
object Zero extends Nat{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(195); 
	override def isZero = true;System.out.println("""isZero: => Boolean""");$skip(61); 
  override def predecessor = throw new IllegalStateException;System.out.println("""predecessor: => Nothing""");$skip(35); 
  override def + (that:Nat) = that;System.out.println("""+ : (that: Nat)Nat""");$skip(62); 
  override def - (that:Nat) = throw new IllegalStateException;System.out.println("""- : (that: Nat)Nothing""")}
}
class Succ(n:Nat) extends Nat {
	override def isZero = false
	override def predecessor = n
  override def + (that:Nat) = Zero
  override def - (that:Nat) = throw new IllegalStateException
}

object week4 {
  println("Welcome to the Scala worksheet")
}
