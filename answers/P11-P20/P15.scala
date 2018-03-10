object P15 {
  def duplicateN[T](n: Int, list: List[T]): List[T] = list.flatMap(x => List.fill(n)(x))
}
