package projects.idea.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2750.5, 5840.1)

    for (salario in salarios) {
        println(salario)
    }

<<<<<<< HEAD
    println("0101010101010101010101")
=======
    println("----------------")
>>>>>>> origin/master
    println("Maior salario: ${salarios.max()}")
    println("Menor salario: ${salarios.min()}")
    println("Média salarios: ${salarios.average()}")


    val salariosMaiorQue2500 = salarios.filter { it > 2500
    }
    println("----------------")
    salariosMaiorQue2500.forEach { println(it) }
<<<<<<< HEAD

    println("0101010101010101010101")
    println(salarios.count { it in 2000.0..6000.0 })

    println("0101010101010101010101")
    println(salarios.find { it == 2750.5 })
    println(salarios.find { it == 500.0 })

    println("0101010101010101010101")
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 500.0})
=======
>>>>>>> origin/master
}