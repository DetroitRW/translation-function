fun main(args: Array<String>) {

fun display(text: String) {
    print(text)
}
fun displayln(text: String) {
    println(text)
}
fun promtDouble(text: String) : Int {
    val reader = Scanner(System.`in`)
    display(text)
    return reader.nextInt()
fun binary (n: Int): String {
    return if (n != 0) binary(n / 2) + n % 2 else { "" }
}