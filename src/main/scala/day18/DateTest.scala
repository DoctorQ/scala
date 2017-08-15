package day18

import java.text.SimpleDateFormat
import java.util.Date

object DateTest {


  def formatData(mill: Long) = {
    val line = new Date(mill)
    val date = new SimpleDateFormat("yyyy-MM-dd H:mm:ss")
    val dateFormated = date.format(line)
    dateFormated.toString
  }

  def main(args: Array[String]): Unit = {
    println(formatData(java.lang.System.currentTimeMillis()))
  }

}
