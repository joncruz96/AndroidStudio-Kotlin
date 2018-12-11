package minapp.bollyfilmes

import java.net.URI

class ItemFilme {

    val id: String = ""
    val titulo: String
    val descricao: String
    val dataLancamento: String
    val imagem: URI? = null
    val avaliacao: Float

    constructor(titulo: String, descricao: String, dataLancamento: String, avaliacao: Float) {
        this.titulo = titulo
        this.descricao = descricao
        this.dataLancamento = dataLancamento
        this.avaliacao = avaliacao
    }



}