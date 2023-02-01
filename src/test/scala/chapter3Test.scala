import chapter3._

// Exercise 3.1
class patternMatchingExperimentTest extends org.scalatest.TestSuite {
  assert(patterTest(List(1, 2, 4)) == 30)
  assert(patterTest(List(1, 5, 4)) == 10)
  assert(patterTest(List()) == 42)
  assert(patterTest(List(1)) == 1)
  assert(patterTest(List(1, 2, 3, 4, 5)) == 3)
}
