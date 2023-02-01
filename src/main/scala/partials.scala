object Partials {

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C = {
    // return a function that takes a value b of type B
    (b: B) =>
      f(a, b)
  }

  var x = partial1(1, (a: Int, b: Int) => a + b)
  println(x)

  def curry[A, B, C](f: (A, B) => C): A => (B => C) = { (a: A) => (b: B) =>
    f(a, b)
  }

  def uncurry[A, B, C](f: A => (B => C)): (A, B) => C = { (a: A, b: B) =>
    f(a)(b)
  }
}
