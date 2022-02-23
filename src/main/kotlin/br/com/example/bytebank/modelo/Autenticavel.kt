package br.com.example.bytebank.modelo

interface Autenticavel {

    fun autentica(senha: Int): Boolean

}