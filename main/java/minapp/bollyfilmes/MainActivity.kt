package minapp.bollyfilmes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = list_filmes
        list.adapter = FilmesAdapter(filmes(), this)
        val layoutManager = LinearLayoutManager(this)
        list.layoutManager = layoutManager
    }

    private fun filmes(): List<ItemFilme> {

        val listaFilmes: ArrayList<ItemFilme> = ArrayList()
        listaFilmes.add(ItemFilme("Homem Aranha", "Filme de Herói, picado por uma aranha", "17/07/2010", 3.1F))
        listaFilmes.add(ItemFilme("Homem Cobra", "Filme de Herói, picado por uma cobra", "27/04/2012", 3.9F))
        listaFilmes.add(ItemFilme("Homem Cão", "Filme de Herói, picado por um cão", "11/03/2013", 5F))
        listaFilmes.add(ItemFilme("Homem Gato", "Filme de Herói, picado por uma gato", "15/10/2005", 2F))
        listaFilmes.add(ItemFilme("Homem Crocodilo", "Filme de Herói, picado por uma crocodilo", "01/08/2018", 3.5F))
        listaFilmes.add(ItemFilme("Homem Passaro", "Filme de Herói, picado por uma passaro", "12/02/2000", 3F))
        listaFilmes.add(ItemFilme("Homem Tatu", "Filme de Herói, picado por uma tatu", "27/02/1996", 4.5F))

        return listaFilmes
    }
}
