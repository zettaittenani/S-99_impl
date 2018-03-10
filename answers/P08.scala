object P08 {
  def compress(list: List[Any]): List[Any] = list match {
    case Nil => Nil
    case head :: tail => (tail match {
      case Nil => List(head)
      case h :: t if (h == head) => compress(tail)
      case _ => List(head) ::: compress(tail)
    })
  }
}
