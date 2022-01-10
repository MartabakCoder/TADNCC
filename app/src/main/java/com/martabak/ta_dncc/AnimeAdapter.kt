package com.martabak.ta_dncc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnimeAdapter(val animeList: Array<String>,val animeDesc: Array<String>,val animeImage: IntArray ) :
    RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    // Describes an item view and its place within the RecyclerView
    class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_view, parent, false)

        return AnimeViewHolder(view)
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return animeList.size
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.itemTitle.text = animeList[position]
        holder.itemDetail.text = animeDesc[position]
        holder.itemImage.setImageResource(animeImage[position])
    }
}
