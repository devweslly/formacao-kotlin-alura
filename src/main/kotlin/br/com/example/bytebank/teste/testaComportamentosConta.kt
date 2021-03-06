package br.com.example.bytebank.teste

import br.com.example.bytebank.modelo.Cliente
import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaComportamentosConta() {

    val alex = Cliente(nome = "Alex", cpf = "", senha = 1)

    val contaAlex = ContaCorrente(titular = alex, numero = 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente(nome = "Fran", cpf = "", senha = 2)

    val contaFran = ContaPoupanca(numero = 1001, titular = fran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("Depositando na conta do Alex: ")
    contaAlex.deposita(50.0)
    println("Saldo atualizado da conta do Alex: ${contaAlex.saldo}.")

    println("Depositando na conta do Fran: ")
    contaFran.deposita(70.0)
    println("Saldo atualizado da conta da Fran: ${contaFran.saldo}.")

    println("Sacando na conta do Alex:")
    contaAlex.saca(250.0)
    println("Saldo atualizado da conta do Alex: ${contaAlex.saldo}.")

    println("Sacando na conta da Fran:")
    contaFran.saca(100.0)
    println("Saldo atualizado da conta da Fran: ${contaFran.saldo}")

    println("Saque em excesso na conta do Alex:")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("Saque em excesso na conta da Fran:")
    contaAlex.saca(500.0)
    println(contaFran.saldo)

    println("TransferĂȘncia da conta da Fran para a conta do Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("TransferĂȘncia sucedida")
    } else {
        println("Falha na transferĂȘncia")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}