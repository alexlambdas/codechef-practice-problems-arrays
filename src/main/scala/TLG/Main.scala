package TLG

import scala.annotation.tailrec

object Main{

  def main(args: Array[String]): Unit = {

    def process(tests: Int): List[Int] = {
      @tailrec
      def loop(test: Int, acctPrayer1: Int, acctPrayer2: Int, acctResult: List[Int]): List[Int] = {
        if(test == 0) acctResult
        else {
          val score: Array[String] = scala.io.StdIn.readLine().split(" ")
          val acctP1 = acctPrayer1 + score.apply(0).toInt
          val acctP2 = acctPrayer2 + score.apply(1).toInt
          if((acctP1 >= acctP2) && (acctP1 - acctP2) > acctResult.apply(1)) loop(test-1, acctP1, acctP2, List(1, acctP1 - acctP2))
          else if((acctP2 > acctP1) && (acctP2 - acctP1) > acctResult.apply(1)) loop(test-1, acctP1, acctP2, List(2, acctP2 - acctP1))
          else loop(test-1, acctP1, acctP2, acctResult)
        }
      }
      loop(tests, 0, 0, List(1,0))
    }

    // read tests
    val tests: Int = scala.io.StdIn.readLine.trim.toInt
    val result: List[Int] = process(tests)

    // print result
    println(result.apply(0) + " " + result.apply(1))
  }
}