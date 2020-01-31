import scala.collection.immutable.{Map, ListMap}

class School {
  type DB = Map[Int, Seq[String]]
  private var database = Map[Int, Seq[String]]()

  def add(name: String, g: Int): Unit = database = database updated (g, grade(g) :+ name)

  def db: DB = database

  def grade(g: Int): Seq[String] = db.getOrElse(g, Seq())

  def sorted: DB = ListMap(db.toSeq.sortBy(_._1):_*)
}
