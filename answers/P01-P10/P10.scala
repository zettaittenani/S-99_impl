object P10 {
  def encode(list: List[Any]): List[(Int, Any)] = pack(list).map(x => (x.length, x.head))

  def pack(list: List[Any]): List[List[Any]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list.span{_ == list.head}
      if (next.isEmpty) List(packed)
      else packed :: pack(next)
    }
  }
}
