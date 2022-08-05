package projects.idea.collections

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
