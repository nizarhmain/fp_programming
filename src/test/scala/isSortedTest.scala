import isSorted.isSorted

/** If course this could be implemented with array.sorted
  */
class isSortedTest extends org.scalatest.TestSuite {
  assert(isSorted(Array(1, 2, 3, 4, 5), (x: Int, y: Int) => x < y))
  assert(!isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x < y))

  assert(!isSorted(Array(1, 2, 3, 4, 5), (x: Int, y: Int) => x > y))
  assert(isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x > y))

  // Learned that the hashcode of a is 97
  // hashcode of b is 98
  // hashcode of c is 99
  // and so on
  assert(
    isSorted(
      Array("one", "two"),
      (x: String, y: String) => x(0).hashCode() < y(0).hashCode()
    )
  )
  assert(
    isSorted(
      Array("abba", "baba"),
      (x: String, y: String) => x(0).hashCode() < y(0).hashCode()
    )
  )
  assert(
    isSorted(
      Array("xerxes", "abba"),
      (x: String, y: String) => x(0).hashCode() > y(0).hashCode()
    )
  )
}
