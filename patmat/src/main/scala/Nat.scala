
abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor = new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat): Nat
}
object Zero extends Nat {
  def isZero = true
  def predecessor = throw new IllegalStateException
  def +(that: Nat) = that
  def -(that: Nat) = if(that.isZero) this else this.predecessor
}
class Succ(n: Nat) extends Nat {
  override def isZero = false
  override def predecessor = n
  override def +(that: Nat) = new Succ(that + n)
  override def -(that: Nat) = if(that.isZero) this else that.predecessor - n
}


