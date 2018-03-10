object P09 {
  def pack(list: List[Any]): List[Any] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list.span{_ == list.head}
      if (next.isEmpty) List(packed)
      else packed :: pack(next)
    }
  }
}
