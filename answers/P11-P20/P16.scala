object P16 {
  def drop[T](n: Int, list: List[T]): List[T] = list.zipWithIndex.filter(e => (e._2 + 1) % n != 0).map(x => x._1)
}
