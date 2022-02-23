package br.com.example.bytebank.teste

import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente("João", 1002)
    contaJoao.titular = "João"
    var contaMaria = ContaPoupanca("Maria", 1003)
    contaMaria.titular = "Maria"

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}