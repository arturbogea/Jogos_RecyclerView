package com.arturbogea.jogos_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class JogosAdapter(private val lista: List<DadosJogos>) : Adapter<JogosAdapter.JogosViewHolder>() {

    inner class JogosViewHolder(val itemView: View) : ViewHolder(itemView){
        val imagemJogo: ImageView = itemView.findViewById(R.id.imagem_jogo)
        val textJogo: TextView = itemView.findViewById(R.id.text_jogo)
        val textConsole: TextView = itemView.findViewById(R.id.text_console)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogosViewHolder {
        var layoutInflater = LayoutInflater.from(parent.context)
        val itemView = layoutInflater.inflate(R.layout.lista_jogos, parent, false)
        return JogosViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: JogosViewHolder, position: Int) {
        val jogosListagem = lista[position]
        holder.imagemJogo.setImageDrawable(jogosListagem.imagemJogos)
        holder.textJogo.text = jogosListagem.titulo
        holder.textConsole.text = jogosListagem.console
    }

    override fun getItemCount(): Int {
        return lista.size
    }


}

private fun ImageView.setImageDrawable(imagemJogos: Int) {
    setImageResource(imagemJogos)
}
