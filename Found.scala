object Demo3 extends App {
    var i = 0
    var foundIt = false
    val arg  = Array("Anjleen",".scala")
    while (i < arg.length-1 && !foundIt) {
        if (arg(i).startsWith("-")) {
            i = i+1
        } else if (arg(i).endsWith(".scala")) {
            foundIt = true
        } else {
            i = i + 1
        }
    }
    println("If found ? "+foundIt)
}