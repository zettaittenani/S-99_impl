object P24 {
  import P23.randomSelect

  def lotto(n: Int, max: Int): List[Int] = {
    if (max < 0) Nil
    else randomSelect(n, List.range(1, (max + 1)))
  }
}
