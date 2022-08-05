package projects.idea.collections

fun main() {
    val times = Array<String>(3) {""}
    times[0] = "Flamengo"
    times[1] = "Liverpool"
    times[2] = "Internacionale"

    for (time in times) {
        println(time)
    }

    println("Times ordenado pelo alfabeto :")
    times.sort()
    times.forEach { println(it) }

    println("Times com ArrayOf :")
    val times2 = arrayOf("Flamengo", "Liverpool", "Roma")
    times2.sort()
    times2.forEach { println(it) }
}