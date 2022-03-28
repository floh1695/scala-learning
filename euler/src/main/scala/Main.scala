import euler.Euler

object Main extends App {
  val showAll = true;
  Euler.problems()
    .filter(p => showAll || p.solved)
    .map(p => p.toReportString())
    .map(r => "##############" + "\n" + r + "\n\n")
    .foreach(println)
}
