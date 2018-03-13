import scala.util.Random

object P23 {
  def randomSelect[T](n: Int, list: List[T]): List[T] = n match {
    case _ if (n < 0 || list.length < n) => throw new NoSuchElementException
    case _ => Random.shuffle(list).take(n)
  }
}
