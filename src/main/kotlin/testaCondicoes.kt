fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é Positiva")
    } else if (saldo == 0.0) {
        println("Conta é Neutra")
    } else {
        println("Conta é Negativa")
    }

    when {
        saldo > 0.0 -> {
            println("Conta é Positiva")
        }
        saldo == 0.0 -> {
            println("Conta é Neutra")
        }
        else -> {
            println("Conta é Negativa")
        }
    }

    when {
        saldo > 0.0 -> println("Conta é Positiva")
        saldo == 0.0 -> println("Conta é Neutra")
        else -> println("Conta é Negativa")
    }
}