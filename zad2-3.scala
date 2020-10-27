import scala.language.postfixOps
object Homework {

  def rekurencja( a:List[String]) : String = {
       if(a.isEmpty)
          ""
       else if(a.tail.isEmpty)
          a.head + rekurencja(a.tail)
       else
          a.head + "," + rekurencja(a.tail)
   }
  
  def rekurencjaodwrotna( a:List[String]) : String = {
     
     if(a.isEmpty)
          ""
     else
      rekurencjaodwrotna(a.tail) + a.head + ","
    
   }
  
   def ogonowa(a:List[String]): String  = {
   
     def iter(days:List[String], result:String, it:Int) :String ={
         if(it == a.size-1) result + days(it)
         else iter(days, result + days(it) + ",", it+1)
     }
     iter(a,"",0)
   }

  
  def main(args: Array[String]): Unit = {
    
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
  
    println(rekurencja(days))
    println(rekurencjaodwrotna(days).dropRight(1))
    println(ogonowa(days))
    
  }
}