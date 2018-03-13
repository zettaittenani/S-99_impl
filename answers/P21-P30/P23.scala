object P23 {
  import scala.util.Random
  def randomSelect[T](n: Int, list: List[T]): List[T] = n match {
    case _ if (n < 0 || list.length < n) => throw new NoSuchElementException
    case _ => Random.shuffle(list).take(n)
  }
}
