import euler.Euler

object Main extends App {
  Euler.problems()
    .filter(p => p.solved)
    .map(p => p.toReportString())
    .map(r => "##############" + "\n" + r + "\n\n")
    .foreach(println)
}
