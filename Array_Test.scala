object Array_Test {
    def main(args: Array[String])={
        val numbers: Array[Int] = Array(1,2,3,4,5)
        val names: Array[String] = Array("Alice", "Bob", "Charlie")

        val num1: Int = numbers(0)
        val num2: Int = numbers(1)
        val num3: Int = numbers(2)
        val num4: Int = numbers(3)
        val num5: Int = numbers(4)
    

        numbers(1) = 55
        numbers(3) = 666
        println(numbers(1))

        val length: Int = numbers.length
        println(length)

        for (num <- numbers) {
            println(num)
        }
        for (name <- names) {
            println(name)
        }

        val sum: Int = numbers.sum
        val max: Int = numbers.max
        val min: Int = numbers.min
        println("Min is : "+min)
        println("Max is : "+max)
        println("Sum is : "+sum)


        val array1: Array[Int] = Array(34,74,98)
        val array2: Array[Int] = Array(81,36,27)
        val concatenatedArray: Array[Int] = array1 ++ array2

        for (c <- concatenatedArray) {
            println(c)
        }
    }
}
