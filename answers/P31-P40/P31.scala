object S31 {
  implicit class S31Int(val src: Int) {
    def isPrime: Boolean = src match {
      case _ if (src < 2) => false
      case 2 => true
      case 3 => true
      case _ => {
        for (i <- 2 to math.sqrt(src).toInt) {
          if (src % i == 0) {
            printf("%s is dividable by %s.\n", src, i)
            return false
          }
        }
        true
      }
    }
  }
}
