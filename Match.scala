object Demo2 extends App {
    val day = "Thursday"
    val result = day match {
        case "Monday" => "Start of the Week"
        case "Tuesday" | "Wednesday" | "Thursday" => "Midweek"
        case _ => "Weekend"
    }
    println(result)
}