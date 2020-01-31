object Leap {
  def leapYear(year: Int): Boolean = {
    def evenlyDivisibleByYear(n: Int) = year % n == 0
    (evenlyDivisibleByYear(4) && !evenlyDivisibleByYear(100)) || evenlyDivisibleByYear(400)
  }
}
