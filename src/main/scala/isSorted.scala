import findFirstGeneric.findFirst

object isSorted {

 def isSorted[A] (as: Array[A], ordered: (A,A) => Boolean): Boolean = {
   // [1, 2 ,3, 4]
   // [1,2]
   // [2,3]
   as.sliding(2).forall((a) => ordered(a(0), a(1)))
 }
}
