object SpaceAge {
  private val earthYearInSeconds = 31557600
  private val earthToMercury = 0.2408467
  private val earthToVenus = 0.61519726
  private val earthToMars = 1.8808158
  private val earthToJupiter = 11.862615
  private val earthToSaturn = 29.447498
  private val earthToUranus = 84.016846
  private val earthToNeptune = 164.79132

  def onEarth(seconds: Double): Double = seconds / earthYearInSeconds
  def onMercury(seconds: Double): Double = onEarth(seconds) / earthToMercury
  def onVenus(seconds: Double): Double = onEarth(seconds) / earthToVenus
  def onMars(seconds: Double): Double = onEarth(seconds) / earthToMars
  def onJupiter(seconds: Double): Double = onEarth(seconds) / earthToJupiter
  def onSaturn(seconds: Double): Double = onEarth(seconds) / earthToSaturn
  def onUranus(seconds: Double): Double = onEarth(seconds) / earthToUranus
  def onNeptune(seconds: Double): Double = onEarth(seconds) / earthToNeptune
}