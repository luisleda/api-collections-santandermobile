package projects.idea.collections

fun main() {
    val megasena = DoubleArray(3)
    megasena[0] = 10.0
    megasena[1] = 20.0
    megasena[2] = 30.0

    megasena.forEach { println(it) }


    println("---------------")
    megasena.forEachIndexed { index, premio ->
        megasena[index] = premio * 2.2
    }
    megasena.forEach { println(it) }


    println("---------------")
    val megasena2 = doubleArrayOf(72.0, 89.1, 97.5)
    megasena2.sort()
    megasena2.forEach { println(it) }
}