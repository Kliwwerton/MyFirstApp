fun main (args: Array<String>) {
    println("Pow!")

    val name = "Cormorant"
    var x = 3

    x *= 10

    print("x is $x.")

    while (x > 20) {
        x -= 1
        print("x is now $x")

    }
    for (i in 1..10) {
        x += 1
        println("x is now $x")
    }
    if (x > 20) {
        println("$x")
    }
    if (name == "Cormorant") {
        println("name is Strike")

    }
}