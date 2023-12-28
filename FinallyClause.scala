import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object Demo1 extends App {
  try {
    val f = new FileReader("input.txt")
  } catch {
    case ex: FileNotFoundException =>
    println(s"File not found: ${ex.getMessage}")

    case ex: IOException =>
      println(s"IO Exception: ${ex.getMessage}")
  } finally {
    println("Finally block executed")
  }
}