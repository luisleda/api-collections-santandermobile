package projects.idea.collections

fun main() {
    val EGMA = Empresa("EGMA", "11.308.791/0001-38", "especialização")
    val SEATI = Empresa("SEATI", "05.022.633/0001-14", "tecnologia")
    val SECTI = Empresa("SECTI", "05.572.043/0001-65", "tecnologia")

    val empresas1 = setOf(SEATI, SECTI)
    val empresas2 = setOf(EGMA)

    val resultUnion = empresas1.union(empresas2)
    resultUnion.forEach { println(it) }

    println("0101010101010101011010")
    // Para fazer a subtração de resultados comuns//
    val empresas3 = setOf(EGMA, SECTI, SEATI)
    val resultSubstract = empresas3.subtract(empresas2)
    resultSubstract.forEach { println(it) }

    println("0101010101011001010101010")

    // para pegar apenas os valores que se repetem//
    val resultIntersect = empresas3.intersect(empresas2)
    resultIntersect.forEach { println(it) }


}