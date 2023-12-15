object  Tuple {
    def main(args: Array[String]): Unit={
        val myTuple: (Int, String, Double) = (42, "Scala", 3.14)

        val FirstElement: Int = myTuple._1
        println("First Element is: "+FirstElement)

        val SecondElement: String = myTuple._2
        println("Second Element is: "+SecondElement)

        val ThirdElement: Double = myTuple._3
        println("Third Element is: "+ThirdElement)

        
   }

}