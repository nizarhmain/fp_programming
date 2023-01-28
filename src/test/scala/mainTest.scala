import findFirstGeneric.findFirst

class mainTest extends org.scalatest.TestSuite {
  var x: Int = findFirst(Array(1, 2, 3, 4, 5), (x: Int) => x == 3)
  assert(x == 2)
}
