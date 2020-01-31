object MatchingBrackets {
  def isPaired(s: String): Boolean = {
    val m = Map('['-> 0, '(' -> 0, '{' -> 0)
    s.toCharArray
      .foldLeft(m)(countBrackets)
      .values
      .sum == 0
  }

  private def countBrackets(acc: Map[Char, Int], char: Char): Map[Char, Int] = {
    val pairs = Map(']' -> '[', ')' -> '(', '}' -> '{')
    if (pairs.values.toList.contains(char))
      acc updated (char, acc(char) + 1)
    else {
      val k = pairs(char)
      acc updated (k, acc(k) - 1)
    }
  }
}