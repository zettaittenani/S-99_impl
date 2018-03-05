object P03 {
  def nth(n: Int, list: List[Int]): Int = {
    list.length match {
      case p if p <= n => -1
      case _ => list.apply(n)
    }
  }
}
