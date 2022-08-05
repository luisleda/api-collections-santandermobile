package projects.idea.collections

fun main() {
    val EGMA = Empresa("EGMA", "11.308.791/0001-38", "especialização")
    val SEATI = Empresa("SEATI", "05.022.633/0001-14","tecnologia")
    val SECTI = Empresa("SECTI", "05.572.043/0001-65", "tecnologia")

    val empresas = listOf(EGMA, SEATI, SECTI)

    empresas.forEach { println(it) }
    println("0101010101010101")

    println(empresas.find { it.nome == "SEATI" })

    println("0101010101010101")
    empresas
        .groupBy { it.ramo }
        .forEach { println(it) }

}

data class Empresa(
    val nome: String,
    val cnpj: String,
    val ramo: String
) {
    override fun toString(): String =
        """
            Nome: $nome
            CNPJ: $cnpj
        """.trimIndent()
    }
