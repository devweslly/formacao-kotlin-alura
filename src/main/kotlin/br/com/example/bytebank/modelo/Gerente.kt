package br.com.example.bytebank.modelo

import br.com.example.bytebank.modelo.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
){

    override val bonificacao: Double
        get() {
            return salario
        }
}