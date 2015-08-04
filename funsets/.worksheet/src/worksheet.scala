object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(177); 
  
  def loop(f: Int => Int, a: Int, b:Int) ={
    def loop(a: Int, acc:Int) : Int =
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  };System.out.println("""loop: (f: Int => Int, a: Int, b: Int)Int""");$skip(32); 

  println(loop(x => x, 1, 10));$skip(32); 
  println(loop(x => x*x, 1,10));$skip(106); 
  
  def product (f: Int => Int) (a: Int, b: Int) : Int =
  	if(a > b) 1
  	else f(a) * product(f)(a+1,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(27); val res$0 = 
  	
  product(x => x)(2,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(54); 
  
  def factorial(x:Int): Int = product(x => x)(1,x);System.out.println("""factorial: (x: Int)Int""");$skip(16); val res$1 = 
 	factorial(10);System.out.println("""res1: Int = """ + $show(res$1));$skip(34); 
 	
 	val half = new Rational(1,2);System.out.println("""half  : Rational = """ + $show(half ));$skip(36); 
 	val tweederde = new Rational(2,3);System.out.println("""tweederde  : Rational = """ + $show(tweederde ));$skip(25); val res$2 = 
 	
 	half.add(tweederde);System.out.println("""res2: Rational = """ + $show(res$2));$skip(11); val res$3 = 
 	half.neg;System.out.println("""res3: Rational = """ + $show(res$3));$skip(17); val res$4 = 
 	half.sub(half);System.out.println("""res4: Rational = """ + $show(res$4));$skip(48); val res$5 = 
 	
 	new Rational(10,10).sub(new Rational(1,2));System.out.println("""res5: Rational = """ + $show(res$5));$skip(30); 
 
  val x = new Rational(1,3);System.out.println("""x  : Rational = """ + $show(x ));$skip(28); 
  val y = new Rational(5,7);System.out.println("""y  : Rational = """ + $show(y ));$skip(28); 
  val z = new Rational(3,2);System.out.println("""z  : Rational = """ + $show(z ));$skip(18); val res$6 = 
  x.sub(y).sub(z);System.out.println("""res6: Rational = """ + $show(res$6))}
}

class Rational(x:Int, y:Int){

	private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b,a%b)

	def numer = x
	def denom = y
	
	def add(that: Rational) =
		new Rational(
			numer * that.denom + that.numer * denom,
			denom * that.denom)
	
	def neg() = new Rational(-numer, denom)
	
	def sub(that: Rational) = add(that.neg)
	
	override def toString = numer / gcd(numer,denom) + "/" + denom / gcd(numer,denom)
}
