object FactorialCalculator extends App {
    def factorial(num: Int): Int = {
        var result = 1
        var i = 1

        while (i<=num) {
            result *= i
            i += 1
        }

        result
    }

    val number = 15
    val result = factorial(number)

    println(s"Factorial of $number is $result")
}