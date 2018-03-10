object P21 {
  def insertAt[T](e: T, n: Int, list: List[T]): List[T] = (list, n) match {
    case (_, m) if ((m < 0) || (list.length < m)) => throw new NoSuchElementException
    case (_, _) => {
      val splitted = list.splitAt(n)

      (splitted._1 :+ e) ::: splitted._2
    }
  }
}
