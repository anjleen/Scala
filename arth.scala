object operators{
    def main(args : Array[String])={
        val a = 10
        val b = 3
        
        val sum = a+b
        val diff = a-b
        val product = a*b
        val quotient = a/b
        val remainder = a%b

        println(s"Sum: $sum")
        println(s"Difference: $diff")
        println(s"Product: $product")
        println(s"Quotient: $quotient")
        println(s"Remainder: $remainder")
    }
}