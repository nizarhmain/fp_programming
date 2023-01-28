object findFirstGeneric {
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    def loop(n: Int): Int = {

      // If nothing is found, we return this
      if (n >= as.length) -1

      // These happens in three steps
      // n => the main looping element
      // as(n) => the element in the array
      // p(as(n)) => runs the predicate against the element in the array
      else if (p(as(n))) n

      // If nothing is found, we loop again
      else loop(n + 1)
    }

    loop(0)
  }
}
