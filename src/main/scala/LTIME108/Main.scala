package LTIME108

import scala.annotation.tailrec

object Main {

  def removeProblems(problems: String): Int = {
    @tailrec
    def loop(problems: Array[String], acct: Int): Int = {
      if(problems.isEmpty) acct
      else{
        if(problems.head.toInt >= 1000) loop(problems.tail, acct+1)
        else loop(problems.tail, acct)
      }
    }
    loop(problems.split(" "), 0)
  }

  def process(problems: List[String]): List[Int] = {
    @tailrec
    def loop(problems: List[String], flag: Boolean, acct: List[Int]): List[Int] = {
      if(problems.isEmpty) acct
      else {
        if(flag) loop(problems.tail, false, acct.::(removeProblems(problems.head)))
        else loop(problems.tail, true, acct)
      }
    }
    loop(problems, true, List())
  }

  def main(args: Array[String]): Unit = {

    def readInput(tests: Int)(readLine: () => String): List[String] = {
      @tailrec
      def loop(test: Int, acct: List[String]): List[String] = {
        if(test == 0) acct
        else loop(test-1, acct.::(readLine()))
      }
      loop(tests*2, List())
    }

    def printLines(data: List[Int]): Unit = {
      if(!data.isEmpty){
        println(data.head)
        printLines(data.tail)
      }
    }

    // read test cases
    val tests: Int = scala.io.StdIn.readLine.trim.toInt
    val data: List[String] = readInput(tests)(scala.io.StdIn.readLine)

    printLines(process(data))

  }
}