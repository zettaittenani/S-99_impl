object P20 {
  def removeAt[T](n: Int, list: List[T]): (List[T], T) = (list, n) match {
    case (_, m) if (m < 0) => throw new NoSuchElementException
    case (Nil, _) => throw new NoSuchElementException
    case (_, _) => (list.zipWithIndex.filter(e => e._2 != n).map(_._1), list(n))
  }
}
