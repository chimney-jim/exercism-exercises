import scala.util.Random
import scala.collection.immutable.Stream

class Robot {
  var name: String = genName()
  var previouslyGeneratedNames: Stream[String] = Stream.empty :+ name

  def reset(): Unit = {
    previouslyGeneratedNames = previouslyGeneratedNames :+ genName()
    name = previouslyGeneratedNames.last
  }

  private def genRandomIntInRange(start: Int, end: Int): Int = {
    start + Random.nextInt((end - start) + 1)
  }

  private def genChar(): Char = {
    val asciiCapA = 65
    val asciiCapZ = 90
    genRandomIntInRange(asciiCapA, asciiCapZ).toChar
  }

  private def genInt(): Int = {
    genRandomIntInRange(0, 9)
  }

  private def genName(): String = {
    val chars = 1 to 2 map (_ => genChar())
    val ints = 1 to 3 map (_ => genInt())
    (chars ++ ints).mkString
  }
}