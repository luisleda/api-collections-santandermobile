package projects.idea.collections

fun main() {
    val pair: Pair<String, Double> = Pair("Seya", 5000.0)
    val map1= mapOf(pair)

    map1.forEach{ (k, v) -> println("Chave: $k - Valor: $v") }

    val map2 = mapOf(
        "Ikki" to 7800.0,
        "Hyoga" to 6300.0
    )

    map2.forEach { (k, v) -> println("Chave: $k - Valor: $v") }

}