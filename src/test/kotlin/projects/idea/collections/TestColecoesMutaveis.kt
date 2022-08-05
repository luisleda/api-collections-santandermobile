package projects.idea.collections

fun main() {
    val EGMA = Empresa("EGMA", "11.308.791/0001-38", "especialização")
    val SEATI = Empresa("SEATI", "05.022.633/0001-14","tecnologia")
    val SECTI = Empresa("SECTI", "05.572.043/0001-65", "tecnologia")

    val empresas = mutableListOf(EGMA, SECTI)
    empresas.forEach { println(it) }

    println("101010101010101010101")
    empresas.add(SEATI)
    empresas.forEach { println(it) }

    println("1010101010101000110011")
    empresas.remove(EGMA)
    empresas.forEach { println(it) }

    println("----------SET---------")
    val empresaSet = mutableSetOf(EGMA)
   // empresaSet.forEach { println(it) }

    empresaSet.add(SECTI)
    empresaSet.add(SEATI)
    empresaSet.forEach { println(it) }

    println("1010101010101000110011")
    empresaSet.remove(EGMA)
    empresaSet.forEach { println(it) }

}