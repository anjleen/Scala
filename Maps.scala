object Mapsdemo {
    def main(args: Array[String]): Unit={

        val fruitPrices: Map[String, Double] = 
            Map("Apples" -> 2.5, "Oranges" -> 1.0, "Banana" -> 1.2)

        val applePrice: Double = fruitPrices("Apples")
        print(applePrice)
    }
}