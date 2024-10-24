package com.dam2024m8uf1_tfinal.jmora

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HeroAdapter(private val superheroes: List<Superheroe>) : RecyclerView.Adapter<HeroAdapter.HeroHolder>() {

    class HeroHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val realNameTextView: TextView = view.findViewById(R.id.tvRealName)
        private val superheroNameTextView: TextView = view.findViewById(R.id.tvSuperhero)
        private val publisherTextView: TextView = view.findViewById(R.id.tvPublisher)
        private val superheroImageView: ImageView = view.findViewById(R.id.ivAvatar)

        fun render(superheroe: Superheroe) {
            realNameTextView.text = superheroe.realName
            superheroNameTextView.text = superheroe.name
            publisherTextView.text = superheroe.publisher
            Picasso.get().load(superheroe.urlImage).into(superheroImageView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.item_superhero_list, parent, false))
    }

    override fun getItemCount(): Int = superheroes.size

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superheroes[position])
    }
}
