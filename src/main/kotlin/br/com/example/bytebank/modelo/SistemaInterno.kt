package br.com.example.bytebank.modelo

import br.com.example.bytebank.modelo.Autenticavel

class SistemaInterno {
    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem Vinde ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }
}