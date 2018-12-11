package minapp.bollyfilmes

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.Adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_filme.view.*

class FilmesAdapter(private  val filmes: List<ItemFilme>,
                    private  val contexto: Context): Adapter<FilmesAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val filme = filmes[position]
        holder?.let {
            it.bindView(filme)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(contexto).inflate(R.layout.item_filme, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return filmes.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(filme: ItemFilme){
            val title       = itemView.item_titulo
            val description = itemView.item_desc
            val date = itemView.item_data
            val rating = itemView.item_avaliacao
            val poster = itemView.item_poster

            title.text       = filme.titulo
            description.text = filme.descricao
            date.text        = filme.dataLancamento
            rating.rating    = filme.avaliacao
            //poster         = filme.imagem
        }
    }

}