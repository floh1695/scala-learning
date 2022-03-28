package fibonacci

object Fibonacci {
  def calculate(n: Int): BigInt =
    calculateGo(n, (BigInt(0), BigInt(1)))

  @annotation.tailrec
  private def calculateGo(n: Int, previous: (BigInt, BigInt)): BigInt =
    if (n <= 0) previous._1
    else calculateGo(n - 1, (previous._2, previous._1 + previous._2))


  def range(upper: Int, lower: Int = 0): List[BigInt] =
    rangeGo(upper - 1, List(0, 1).map(x => BigInt(x)))
      .drop(lower)
      .take(upper - lower + 1)

  @annotation.tailrec
  private def rangeGo(remaining: Int, values: List[BigInt]): List[BigInt] =
    if (remaining <= 0) values
    else rangeGo(remaining - 1, values :+ values.reverse.slice(0, 2).sum)

}
