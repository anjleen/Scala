import java.io._

object Files{
    def main(args: Array[String]): Unit={
        val writer = new PrintWriter(new File("test.txt"))

        writer.println("Hello Scala")
        writer.println("VIT Bhopal")
        writer.close()
    }
}