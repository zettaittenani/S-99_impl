object P22 {
  def range(start: Int, end: Int): List[Int] = (start, end) match {
    case (s, e) if (e < s) => throw new NoSuchElementException
    case (_, _) => (start to end).toList
  }
}
