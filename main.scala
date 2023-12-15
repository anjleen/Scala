class Smartphone {
    var number: Int = 16
    var nameofcompany: String = "Apple"

    def Display()={
        println("Name of the company : " + nameofcompany);
        println("Total umber of Smartphone generation: : " + number);
    }
}

object Main {
    def main(args: Array[String])={

        var obj = new Smartphone();
        obj.Display();
    }
}