package com.example.sprintmodulo5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.TextView
import android.widget.ImageView
import com.bumptech.glide.Glide

class ShoeDetailFragment : Fragment() {

    private lateinit var shoe: Shoe

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detail, container, false)

        shoe = arguments?.getParcelable("shoe") ?: Shoe("", "", 0.0)

        val shoeName: TextView = view.findViewById(R.id.shoeNameDetail)
        val shoePrice: TextView = view.findViewById(R.id.shoePriceDetail)
        val shoeImage: ImageView = view.findViewById(R.id.shoeImageDetail)

        shoeName.text = shoe.name
        shoePrice.text = "$${shoe.price}"
        Glide.with(requireContext()).load(shoe.imageUrl).into(shoeImage)

        return view
    }
}