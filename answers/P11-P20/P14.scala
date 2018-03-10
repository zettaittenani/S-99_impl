object P14 {
  // the model answer is "list flatMap { e => List(e, e) }"
  def duplicate[T](list: List[T]): List[T] = list.map(x => List(x, x)).flatten
}
