package projects.idea.collections

fun main() {
    val EGMA = Empresa("EGMA", "11.308.791/0001-38", "especialização")
    val SEATI = Empresa("SEATI", "05.022.633/0001-14", "tecnologia")
    val SECTI = Empresa("SECTI", "05.572.043/0001-65", "tecnologia")

    val repositorio = Repositorio<Empresa>()

    repositorio.create(EGMA.nome, EGMA)
    repositorio.create(SEATI.nome, SEATI)
    repositorio.create(SECTI.nome, SECTI)

    println(repositorio.findById(EGMA.nome))

    println("100110011010101010101")
    repositorio.findAll().forEach { println(it) }

    println("100110011010101010101")
    repositorio.remove(EGMA.nome)
    repositorio.findAll().forEach { println(it) }
}