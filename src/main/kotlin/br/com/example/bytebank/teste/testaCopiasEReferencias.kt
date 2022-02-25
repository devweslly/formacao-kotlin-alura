package br.com.example.bytebank.teste

import br.com.example.bytebank.modelo.Cliente
import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaCopiasEReferencias() {

    val joao = Cliente(nome = "João", cpf = "", senha = 1)

    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = ContaCorrente(joao, 1002)
    contaJoao.titular.nome = "João"
    var contaMaria = ContaPoupanca(Cliente(
        nome = "Maria",
        cpf = "",
        senha = 2
    ), 1003)
    contaMaria.titular.nome = "Maria"

    println("Titular conta joao: ${contaJoao.titular}")
    println("Titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)
}