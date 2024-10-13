package com.example.sprintmodulo5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sprintmodulo5.databinding.FragmentShoeListBinding

class ShoeAdapter(
    private val shoes: List<Shoe>,
    private val onClick: (Shoe) -> Unit
) : RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val binding = FragmentShoeListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ShoeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        val shoe = shoes[position]
        holder.bind(shoe)

        // Manejar clic en el botón "VER"
        holder.itemView.findViewById<Button>(R.id.viewButton).setOnClickListener {
            onClick(shoe)
        }
    }

    override fun getItemCount() = shoes.size

    inner class ShoeViewHolder(private val binding: FragmentShoeListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(shoe: Shoe) {
            // Aquí usas Glide para cargar la imagen desde la URL
            Glide.with(binding.root.context)
                .load(shoe.imageUrl) // URL de la imagen
                .into(binding.shoeImage) // El ImageView donde se cargará la imagen

            // Establecer el nombre y el precio del zapato
            binding.shoeName.text = shoe.name
            binding.shoePrice.text = "$${shoe.price}"
        }
    }
}