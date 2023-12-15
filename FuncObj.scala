case class Counter(value: Int = 0) {
    def increment: Counter = copy(value = value + 1)

    def decrement: Counter = copy(value = value - 1)

    def add(amount: Int): Counter = copy(value = value + amount)

    def isZero: Boolean = value == 0
}

object funcDemo {
    def main(args: Array[String])={
        val initialCounter = Counter()
        println(s"Initial Counter: $initialCounter")

        val incrementedCounter = initialCounter.increment
        println(s"Incremented Counter: $incrementedCounter")

        val decrementedCounter = initialCounter.decrement
        println(s"Decremented Counter: $decrementedCounter")

        val addCounter = initialCounter.add(1)
        println(s"Added Counter: $addCounter")

        println(s"Is the counter zero? ${initialCounter.isZero}")

    }
}