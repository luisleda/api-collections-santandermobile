package projects.idea.collections

fun main() {
    val values = intArrayOf(1, 8, 9, 20, 5, 10)
    values.forEach {
        println(it)
    }
    println("Flamengo")
    values.sort()
    values.forEach {
        println(it)
    }
}