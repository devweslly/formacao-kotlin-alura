package br.com.example.bytebank.teste

import br.com.example.bytebank.modelo.Analista
import br.com.example.bytebank.modelo.CalculadoraBonificacao
import br.com.example.bytebank.modelo.Diretor
import br.com.example.bytebank.modelo.Gerente

fun testaFuncionarios() {
    println("-------------------------")

    val alex = Analista(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0,
    )

    println("Nome: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: R$ ${alex.salario}")
    println("Bonificação: R$ ${alex.bonificacao}")
    println("-------------------------")

    val fran = Gerente(
        nome = "Fra",
        cpf = "222.222.222-22",
        salario = 2000.00,
        senha = 1234
    )

    println("Nome: ${fran.nome}")
    println("CPF: ${fran.cpf}")
    println("Salário: R$ ${fran.salario}")
    println("Bonificação: R$ ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    println("-------------------------")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("Nome: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: R$ ${gui.salario}")
    println("Bonificação: R$ ${gui.bonificacao}")
    println("PLR: R$ ${gui.plr}")

    if (gui.autentica(4000)) {
        println("Autenticou com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    println("-------------------------")

    val maria = Analista(
        nome = "Maria",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("Total de bonificação é R$ ${calculadora.total}")
}