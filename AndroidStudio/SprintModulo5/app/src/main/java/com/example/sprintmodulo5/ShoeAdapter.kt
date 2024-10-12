package com.example.sprintmodulo5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ShoeAdapter(
    private val shoeList: List<Shoe>,
    private val onItemClick: (Shoe) -> Unit
) : RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {

    inner class ShoeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val shoeName: TextView = view.findViewById(R.id.shoeName)
        val shoePrice: TextView = view.findViewById(R.id.shoePrice)
        val shoeImage: ImageView = view.findViewById(R.id.shoeImage)

        fun bind(shoe: Shoe) {
            shoeName.text = shoe.name
            shoePrice.text = "$${shoe.price}"
            Glide.with(itemView.context).load(shoe.imageUrl).into(shoeImage)
            itemView.setOnClickListener { onItemClick(shoe) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fragment_shoe_list, parent, false)
        return ShoeViewHolder(view)
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.bind(shoeList[position])
    }

    override fun getItemCount(): Int = shoeList.size
}