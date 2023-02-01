/** Exercise 3.1
  */
object chapter3 {

  def patterTest[A](l: List[Int]): Int = {
    l match {
      // we are taping inside the constructor here
      // and looking for this pattern
      // first element is checked, then we check if the second element equals 2
      // then we check if the third element equals 4
      // if it matches we return 30
      // the final _ indicates that the list has no element after and that 4 is the last element
      case x :: 2 :: 4 :: _      => 30
      case Nil                   => 42
      case x :: y :: 3 :: 4 :: _ => x + y
      case h :: t => h + t.sum
      case _ => 101
    }
  }
}
