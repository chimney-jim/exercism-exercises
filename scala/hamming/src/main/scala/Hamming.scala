object Hamming {
  def distance(strand1: String, strand2: String): Option[Int] = {
    def charsAreSame(pair: (Char, Char)): Boolean = pair._1 != pair._2

    if (strand1.length != strand2.length) None
    else Some(strand1 zip strand2 count charsAreSame)
  }
}