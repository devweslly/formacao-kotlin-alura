package br.com.example.bytebank.teste

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("modelo.Conta é Positiva")
    } else if (saldo == 0.0) {
        println("modelo.Conta é Neutra")
    } else {
        println("modelo.Conta é Negativa")
    }

    when {
        saldo > 0.0 -> {
            println("modelo.Conta é Positiva")
        }
        saldo == 0.0 -> {
            println("modelo.Conta é Neutra")
        }
        else -> {
            println("modelo.Conta é Negativa")
        }
    }

    when {
        saldo > 0.0 -> println("modelo.Conta é Positiva")
        saldo == 0.0 -> println("modelo.Conta é Neutra")
        else -> println("modelo.Conta é Negativa")
    }
}