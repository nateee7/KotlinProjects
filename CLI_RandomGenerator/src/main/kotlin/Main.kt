import kotlin.random.Random
fun main(args: Array<String>) {
    var sep: String; var minInt: Int; var maxInt: Int; var amount: Int
    var result = ""

    println("Random values generator\tv0.1\n\n")
    print("Set minimum value: ")
    minInt = readln().toInt()
    print("\n\nSet maximum exclusive value: ")
    maxInt = readln().toInt()
    print("\nSet amount: ")
    amount = readln().toInt()
    print("\nWrite down separator: ")
    sep = readln()

    for (i in 0..amount) {
        result += (Random.nextInt(minInt, maxInt).toString() + sep)
    }
    result = result.substringBeforeLast(sep)
    println("\n\n" + result)

}