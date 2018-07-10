package example

// a long string contains `${`
// have to split it to two strings
private val str = """
$""" + """{
""".trim()

fun main(args: Array<String>) {
    println(str)
}

