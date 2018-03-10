object P12 {
  def decode(list: List[(Int, Any)]): List[Any] = {
    if (list.isEmpty) List()
    else {
      list map { e => List.fill(e._1)(e._2)}
    }
  }
}
