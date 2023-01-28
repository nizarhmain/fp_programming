import findFirstGeneric.findFirst

object isSorted {

 def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {

   // 1, 2 ,3
   // 1, 2 => true
   // 2, 1 => false

   as.sliding(2).forall((a) => ordered(a(0), a(1)))

 }


}
