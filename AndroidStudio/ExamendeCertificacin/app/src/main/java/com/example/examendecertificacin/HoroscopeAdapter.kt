package com.example.examendecertificacin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.examendecertificacin.databinding.ItemHoroscopeBinding

class HoroscopeAdapter(private val onItemClick: (String) -> Unit) : ListAdapter<Horoscope, HoroscopeAdapter.HoroscopeViewHolder>(HoroscopeDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        val binding = ItemHoroscopeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HoroscopeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
        val horoscope = getItem(position)
        holder.bind(horoscope)
    }

    inner class HoroscopeViewHolder(private val binding: ItemHoroscopeBinding) : androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root) {
        fun bind(horoscope: Horoscope) {
            binding.horoscopeName.text = horoscope.name
            Glide.with(binding.root.context)
                .load(horoscope.imageUrl)
                .into(binding.horoscopeImage)

            binding.root.setOnClickListener {
                onItemClick(horoscope.id)
            }
        }
    }

    class HoroscopeDiffCallback : DiffUtil.ItemCallback<Horoscope>() {
        override fun areItemsTheSame(oldItem: Horoscope, newItem: Horoscope): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Horoscope, newItem: Horoscope): Boolean {
            return oldItem == newItem
        }
    }
}