package PRACTICEPERF

import scala.annotation.tailrec

object Main{

  def process(data: Array[String]): Int = {

    @tailrec
    def loop(inputData: Array[String], acct: Int): Int = {
      if(inputData.isEmpty) acct
      else{
        if(inputData.head.toInt >= 10) loop(inputData.tail, acct+1)
        else loop(inputData.tail, acct)
      }
    }

    loop(data, 0)
  }

  def main(args: Array[String]): Unit = {

    // read input
    val data: Array[String] = scala.io.StdIn.readLine().split(" ")

    // print result
    println(process(data))

  }
}