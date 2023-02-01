import isSorted.isSorted
import Partials.uncurry
import Partials.curry

object main {
  def main(args: Array[String]) = {

    val f = (x: Double) => Math.PI / 2 - x
    val cos = f andThen (math.cos)
    val sin = cos andThen (math.sin)
    println(sin(2))
  }
}
