import chapter3._

class patternMatchingExperimentTest extends org.scalatest.TestSuite {

  // Exercise 3.1
  assert(patterTest(List(1, 2, 4)) == 30)
  assert(patterTest(List(1, 5, 4)) == 10)
  assert(patterTest(List()) == 42)
  assert(patterTest(List(1)) == 1)
  assert(patterTest(List(1, 2, 3, 4, 5)) == 3)

  // Exercise 3.2
  assert(tail(List(1, 2, 3, 4, 5)) == List(2, 3, 4, 5))
  assert(tail(List()) == List())
  assert(tail(List('q', 'w', 'e')) == List('w', 'e'))

  // Exercise 3.3
  assert(setHead(List(0, 1, 2), 99) == List(99, 1, 2))

  // Exercise 3.4
  assert(drop(List(0, 1, 2), 1) == List(1, 2))
  assert(drop(List(0, 1, 2), 2) == List(2))

  // Exercise 3.5
  assert(dropWhile(List(10, 11, 12), ((a: Int) => a < 11)) == List(11, 12))

  assert(init(List(1, 2, 3, 4)) == List(1, 2, 3))

  assert(sum(List(1, 2, 3, 4)) == 10)
  assert(product(List(1, 2, 3, 4)) == 24)

  // Exercise 3.12
  assert(reverse(List(1, 2, 3)) == List(3, 2, 1))

// Exercise 3.16
  assert(incrementIntsInList(List(1, 2, 3)) == List(2, 3, 4))

  assert(transformDoubleIntoString(List(null, 2, 3)) == None)

  for {
    settings <- transformDoubleIntoString(List(1, 2, 3))
  } yield assert(settings == List("1", "2", "3"))

}
