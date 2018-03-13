object P25 {
  import P23.randomSelect

  def randomPermute[T](list: List[T]): List[T] = randomSelect(list.length, list)
}
