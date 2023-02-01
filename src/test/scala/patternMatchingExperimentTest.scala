import patternMatchingExperiment._

class patternMatchingExperimentTest extends org.scalatest.TestSuite {
  assert(patterTest(List(1,2,4)) == 30)
  assert(patterTest(List(1,5,4)) == 101)
  assert(patterTest(List()) == 42)
  assert(patterTest(List(1)) == 101)
}
