object Scala_Array {   
  def test(nums: Array[Int]): Array[Int] = {
    var temp1 = 0
    var temp2 = 0
    var start = 0
    var end = nums.length - 1   
    while (start < end) {
    temp1 = nums(start)
    temp2 = nums(end)
    nums(start) = temp2
    nums(end) = temp1
    start += 1
    end -= 1
     }
    nums
  }       
   def main(args: Array[String]): Unit = {
    var nums1 = Array(1,2,3,4,5,6) 
    println("Orginal array:")
    for ( x <- nums1) {
       print(s"${x}, ")        
     }           
    var result1= test(nums1)
    println("\nReversed array:")
    for ( x <- result1) {
       print(s"${x}, ")        
     }     
   }
}
