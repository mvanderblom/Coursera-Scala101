object worksheet {
  
  def loop(f: Int => Int, a: Int, b:Int) ={
    def loop(a: Int, acc:Int) : Int =
      if(a > b) acc
      else loop(a + 1, f(a) + acc)
    loop(a, 0)
  }                                               //> loop: (f: Int => Int, a: Int, b: Int)Int

  println(loop(x => x, 1, 10))                    //> 55
  println(loop(x => x*x, 1,10))                   //> 385
  
  def product (f: Int => Int) (a: Int, b: Int) : Int =
  	if(a > b) 1
  	else f(a) * product(f)(a+1,b)             //> product: (f: Int => Int)(a: Int, b: Int)Int
  	
  product(x => x)(2,4)                            //> res0: Int = 24
  
  def factorial(x:Int): Int = product(x => x)(1,x)//> factorial: (x: Int)Int
 	factorial(10)                             //> res1: Int = 3628800
 	
 	val half = new Rational(1,2)              //> half  : Rational = 1/2
 	val tweederde = new Rational(2,3)         //> tweederde  : Rational = 2/3
 	
 	half.add(tweederde)                       //> res2: Rational = 7/6
 	half.neg                                  //> res3: Rational = 1/-2
 	half.sub(half)                            //> res4: Rational = 0/1
 	
 	new Rational(10,10).sub(new Rational(1,2))//> res5: Rational = 1/2
 
  val x = new Rational(1,3)                       //> x  : Rational = 1/3
  val y = new Rational(5,7)                       //> y  : Rational = 5/7
  val z = new Rational(3,2)                       //> z  : Rational = 3/2
  x.sub(y).sub(z)                                 //> res6: Rational = -79/42
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