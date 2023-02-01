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
}
