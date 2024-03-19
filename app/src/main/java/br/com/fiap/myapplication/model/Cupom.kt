package br.com.fiap.myapplication.model

data class Cupom(
    val id: Long = 0,
    val empresa: String,
    val desconto: String,
    val categoria: String
)