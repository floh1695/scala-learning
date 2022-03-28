object Factorial {
  def calculate(n: Int): BigInt = go(n, BigInt(1))

  @annotation.tailrec
  private def go(n: Int, total: BigInt): BigInt =
    if (n <= 0) total
    else go(n - 1, total * n)
}
