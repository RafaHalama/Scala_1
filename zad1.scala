  object Homework {
  def zad1for(a:List[String]) : String = {
     var str =""
     for (i <- a) {
       if(i == a(a.size-1))
        str = str.concat(i) 
       else
        str = str.concat(i + ",")
     }
    return str
  }
  
  def zad1forP(a:List[String]) : String={
    var str2 =""
    for (i <- a){
      if (i.startsWith("P")){
        str2 = str2.concat(i + ","); 
      }
      }
     str2 = str2.substring(0, str2.length - 1)   
    return str2
  }
  
  def zad1while(a:List[String]) : String={
     var it=0
    var listsize = a.size
    var str3 =""
    while(it < listsize) {
      if(it == listsize-1)
        str3 = str3.concat(a(it))
      else
        str3 = str3.concat(a(it) + ",")

      it+=1
    }
    return str3
  }
  
  
    def main(args: Array[String]): Unit = {
    
    val days = List("Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela")
   
    println(zad1for(days))
    println(zad1forP(days))
    println(zad1while(days))

  }
}