object chapter3 {

  // Exercise 3.1
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
      case h :: t                => h + t.sum
      case _                     => 101
    }
  }

  // Exercise 3.2
  // remove first element of a list
  def tail[A](l: List[A]): List[A] = {
    l match {
      case h :: t => t
      case Nil    => Nil
    }
  }

  // Exercise 3.3
  def setHead[A](l: List[A], newValue: A): List[A] = {
    l match {
      case h :: t => List[A](newValue) ++ t
      case Nil    => Nil
    }
  }

  // Exercise 3.4
  // remove first element of a list
  def drop[A](l: List[A], n: Int): List[A] = {
    l match {
      // If n is 0 we return the list
      // Otherwise, we call drop on the tail of the list
      case h :: t => if (n == 0) l else drop(t, n - 1)
      case Nil    => Nil
    }
  }

  // Exercise 3.5
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = {
    l match {
      // If n is 0 we return the list
      // Otherwise, we call drop on the tail of the list

      // f(h) is a boolean
      // if f(h) is true we call dropWhile on the tail of the list
      case h :: t => if (f(h)) dropWhile(t, f) else l
      case Nil    => Nil
    }
  }

  // Exercise 3.6
  def init[A](l: List[A]): List[A] = {
    l match {
      // every step extract, the Head of the list and append it to the result
      // repeat until the length is equal to 1
      case h :: t => if (t.length == 1) List(h) else List(h) ++ init(t)
      case Nil    => Nil
    }
  }

  // Exercise 3.11
  def sum[A](l: List[Int]): Int = {
    l.foldLeft(0)(_ + _)
  }

  def product[A](l: List[Int]): Int = {
    l.foldLeft(l.head)(_ * _)
  }

  // Exercise 3.12
  def reverse[A](l: List[Int]): List[Int] = {
    // List[Int]() is the object that we will start with and in our case, it's b
    // we will then append the B element to our A list
    l.foldLeft(List[Int]())((a, b) => List(b) ++ a)
  }

  // Exercise 3.16
  def incrementIntsInList[A](l: List[Int]): List[Int] = {
    l.map(_+1)
  }

  // Exercise 3.17
  def transformDoubleIntoString[A](l: List[Double]): List[String] = {
    l.map(_.toString())
  }

}
