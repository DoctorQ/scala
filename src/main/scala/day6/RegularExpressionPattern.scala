package day6

import scala.util.matching.Regex

/**
  * Created by doctorq on 2017/6/10.
  * 正则表达式模式
  */
class RegularExpressionPattern {

}

object RegularExpressionPattern {

  def main(args: Array[String]): Unit = {
    val numberPattern: Regex = "[0-9]".r

    numberPattern.findFirstMatchIn("awesomepassword123") match {
      case Some(_) => println("Password OK")
      case None => println("Password must contain a number")
    }
    val keyValPattern: Regex = "([0-9a-zA-Z-#() ]+): ([0-9a-zA-Z-#() ]+)".r
    val input: String =
      """background-color: #A03300;
        |background-image: url(img/header100.png);
        |background-position: top center;
        |background-repeat: repeat-x;
        |background-size: 2160px 108px;
        |margin: 0;
        |height: 108px;
        |width: 100%;""".stripMargin

    for (patternMatch <- keyValPattern.findAllMatchIn(input))
      println(s"key: ${patternMatch.group(1)} value: ${patternMatch.group(2)}")

  }
}
