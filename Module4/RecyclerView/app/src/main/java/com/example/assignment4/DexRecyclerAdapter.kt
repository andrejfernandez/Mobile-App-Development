package com.example.assignment4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.assignment4.models.DexPost
import kotlinx.android.synthetic.main.layout_dex_entry.view.*

class DexRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<DexPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DexViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_dex_entry, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is DexViewHolder ->{
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(dexList: List<DexPost>){
        items = dexList
    }

    class DexViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val dexImage = itemView.dex_image
        val dexName = itemView.dex_name
        val dexType = itemView.dex_type

        fun bind(dexPost: DexPost){
            dexName.setText(dexPost.name)
            dexType.setText(dexPost.body)

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(dexPost.image)
                .into(dexImage)
        }

    }

}