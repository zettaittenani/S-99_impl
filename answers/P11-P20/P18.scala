object P18 {
  // Builtin slice(m, n)

  def slice[T](m: Int, n: Int, list: List[T]): List[T] = list.zipWithIndex.filter(e => (m <= e._2) && (e._2 < n)).map(_._1)
}
