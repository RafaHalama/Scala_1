import scala.language.postfixOps  
object Homework {

def zad5(a:Map[String,Double]): Map[String,Double] ={
  a map {case(n,m) => (n,m * 0.9)}
}

def zad6krotka(test:Tuple3[Int, String, Boolean]) : Unit = {
    println(test._1)  
    println(test._2) 
    println(test._3)
  }
   
 def zad7(a:Map[String, String]) : Unit = {
    println(a.get("Hello"))
    println(a.get("Bye"))
    println(a.getOrElse("Yes", "Nie ma takiego klucza"))
  } 

 def zad8(a: List[Int]): List[Int] = {
  def loop(a: List[Int], b: List[Int]): List[Int] = a match {
    case Nil => b
    case h :: t =>
      if (h == 0) {
        loop(t, b)
      }else{
        loop(t, b :+ h)
      }
  }
  loop(a, List())
} 

 def zad9(a:List[Int]):List[Int] = {
    a map(n => n+1)
  }
  
  def zad10(a:List[Double]):List[Double] = {
     val result = a.filter(n => (n> -5 && n<12)) map (_ abs)
    return result
  }
  

  def main(args: Array[String]): Unit = {
    
    val produkty = scala.collection.immutable.Map("Telefon" -> 1000.0, "Pizza" -> 20.0, "Jabłko" -> 3.5)
    val tuple = (3, "test", false) 
    val numbers = List(0,1,2,3,4,5,6,7,8,9,10,0)
    val numbers2 = List(0,1,2,-3,0.5,-6,55,-55)
    val translate = Map("Hello" -> "Ohayo", "Hello" -> "Witam", "Good Night" -> "Oyasuminasai")
	
	println(zad5(produkty))
	zad6krotka(tuple)
    zad7(translate)
    println(zad8(numbers))
	println(zad9(numbers))
    println(zad10(numbers2))
   

  }
}