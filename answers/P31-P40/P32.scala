object P32 {
  def gcd(a: Int, b: Int): Int =
    if ((a < 1) || (b < 1)) 0
    else if (a == 0) b
    else if (b == 0) a
    else {
      if (a > b) gcd(b, (a % b))
      else gcd(a, (b % a))
    }
}
