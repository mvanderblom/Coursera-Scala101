
import patmat.Huffman

object week4 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val a1 = new A(1)                               //> a1  : A = A@3796751b
  println(a1.aaaa)                                //> 1
  val a2 = A(2,4)                                 //> a2  : A = A@67b64c45
  println(a2.aaaa)                                //> 6
  Nil.size                                        //> res0: Int = 0
  val a = Huffman.decodedSecret                   //> a  : List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  
  
  println("a")                                    //> a
  a                                               //> res1: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
  
  println(Huffman.frenchCode)                     //> Fork(Fork(Fork(Leaf(s,121895),Fork(Leaf(d,56269),Fork(Fork(Fork(Leaf(x,5928)
                                                  //| ,Leaf(j,8351),List(x, j),14279),Leaf(f,16351),List(x, j, f),30630),Fork(Fork
                                                  //| (Fork(Fork(Leaf(z,2093),Fork(Leaf(k,745),Leaf(w,1747),List(k, w),2492),List(
                                                  //| z, k, w),4585),Leaf(y,4725),List(z, k, w, y),9310),Leaf(h,11298),List(z, k, 
                                                  //| w, y, h),20608),Leaf(q,20889),List(z, k, w, y, h, q),41497),List(x, j, f, z,
                                                  //|  k, w, y, h, q),72127),List(d, x, j, f, z, k, w, y, h, q),128396),List(s, d,
                                                  //|  x, j, f, z, k, w, y, h, q),250291),Fork(Fork(Leaf(o,82762),Leaf(l,83668),Li
                                                  //| st(o, l),166430),Fork(Fork(Leaf(m,45521),Leaf(p,46335),List(m, p),91856),Lea
                                                  //| f(u,96785),List(m, p, u),188641),List(o, l, m, p, u),355071),List(s, d, x, j
                                                  //| , f, z, k, w, y, h, q, o, l, m, p, u),605362),Fork(Fork(Fork(Leaf(r,100500),
                                                  //| Fork(Leaf(c,50003),Fork(Leaf(v,24975),Fork(Leaf(g,13288),Leaf(b,13822),List(
                                                  //| g, b),27110),List(v, g, b),52085),List(c, v, g, b),102088),List(r, c, v, g, 
                                                  //| b),202588),Fork(Leaf(n,1
                                                  //| Output exceeds cutoff limit.
 List("aa", "cc" ).filterNot(_.endsWith(".js"))   //> res2: List[String] = List(aa, cc)

val f = new java.io.File("aaaa")                  //> f  : java.io.File = aaaa
f.isDirectory()                                   //> res3: Boolean = false
f.getName                                         //> res4: String = aaaa
}


class A (x:Int){
	def aaaa = x
}

object A{
	def apply(a :Int, b:Int) = new A(a+b)
}