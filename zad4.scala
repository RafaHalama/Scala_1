object Homework {

def zad4foldl(a:List[String]):String = {
     a.foldLeft("")(_ + _ +",").dropRight(1)
   }
   def zad4foldr(a:List[String]):String = {
     a.foldRight("")(_ + "," + _).dropRight(1)
   }
  def zad4foldlP(a:List[String]):String = {
     var str = a.foldLeft("")((x,y) =>
      if(y.startsWith("P")) x + y + ","
      else x
      )
    str.dropRight(1)
   }
   
   
   def main(args: Array[String]): Unit = {
    
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
   

    println(zad4foldl(days))
    println(zad4foldr(days))
    println(zad4foldlP(days))
  }
}