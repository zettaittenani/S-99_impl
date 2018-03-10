object P06 {
  def isPalindrome(list: List[Int]): Boolean = {
    // the model answer: list == list.reverse

    var ret: Boolean = true
    var l: List[Int] = list

    while(l.length > 1) {
      ret = ret && (l.head == l.last)
      l = l.tail.init
    }

    ret
  }
}
