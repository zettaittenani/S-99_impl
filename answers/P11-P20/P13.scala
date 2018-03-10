object P13 {
  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    if (list.isEmpty) List()
    else {
      val (packed, next) = list.span(_ == list.head)
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}
