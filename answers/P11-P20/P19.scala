object P19 {
  def rotate[T](n: Int, list: List[T]): List[T] = {
    val zwi = list.zipWithIndex
    zwi.map{
      e =>
      val rnum = e._2 + n
      if (rnum < 0)  zwi((rnum + zwi.length) % zwi.length)._1
      else zwi(rnum % zwi.length)._1
    }
  }
}
