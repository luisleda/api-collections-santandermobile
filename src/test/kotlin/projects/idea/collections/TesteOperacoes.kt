package projects.idea.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2750.5, 5840.1)

    for (salario in salarios) {
        println(salario)
    }

    println("----------------")
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média salarios: ${salarios.average()}")


    val salariosMaiorQue2500 = salarios.filter { it > 2500
    }
    println("----------------")
    salariosMaiorQue2500.forEach { println(it) }
}