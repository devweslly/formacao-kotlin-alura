package br.com.example.bytebank.teste

import br.com.example.bytebank.modelo.ContaCorrente
import br.com.example.bytebank.modelo.ContaPoupanca

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("________________________________")
    println("Saldo modelo.Conta Corrente: R$ ${contaCorrente.saldo}")
    println("Saldo modelo.Conta Poupança: R$ ${contaPoupanca.saldo}")
    println("________________________________")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo modelo.Conta Corrente após saque: R$ ${contaCorrente.saldo}")
    println("Saldo modelo.Conta Poupança após saque: R$ ${contaPoupanca.saldo}")
    println("________________________________")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo modelo.Conta Corrente após transferência para Poupança: R$ ${contaCorrente.saldo}")
    println("Saldo modelo.Conta Poupança após recebimento de transferência: R$ ${contaPoupanca.saldo}")
    println("________________________________")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo modelo.Conta Poupança após transferência para Corrente: R$ ${contaPoupanca.saldo}")
    println("Saldo modelo.Conta Corrente após recebimento de transferência: R$ ${contaCorrente.saldo}")
    println("________________________________")
}