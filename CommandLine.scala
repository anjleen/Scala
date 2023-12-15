import java.io._
import scala.io.StdIn as read
object Demo {
    def main(args: Array[String]): Unit={
        println("Please enter the input")
        val line = read.readLine("Enter a line of text: ")
        println(s"You entered: $line")
    }
}