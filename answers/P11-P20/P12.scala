object P12 {
  def decode(list: List[(Int, Any)]): List[Any] = {
    if (list.isEmpty) List()
    else {
      list map { elem => List.fill(elem._1)(elem._2)}
    }
  }
}
