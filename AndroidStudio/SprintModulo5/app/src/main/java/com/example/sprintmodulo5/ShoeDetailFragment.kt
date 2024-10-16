package com.example.sprintmodulo5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.ImageView
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

class ShoeDetailFragment : Fragment() {

    private lateinit var shoe: Shoe

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_shoe_detail, container, false)

        // Recuperar el objeto shoe del Bundle usando el método correcto
        shoe = arguments?.getParcelable("shoe") ?: Shoe("", "", 0.0)

        val shoeName: TextView = view.findViewById(R.id.shoeNameTextView)
        val shoePrice: TextView = view.findViewById(R.id.shoePriceTextView)
        val shoeImage: ImageView = view.findViewById(R.id.shoeImageView)
        val addToCartButton: Button = view.findViewById(R.id.addToCartButton)

        // Asignar los valores del objeto shoe a las vistas
        shoeName.text = shoe.name
        shoePrice.text = "$${shoe.price}"
        Glide.with(requireContext()).load(shoe.imageUrl).into(shoeImage)

        // Lógica para agregar al carrito
        addToCartButton.setOnClickListener {
            Cart.addItem(shoe)
            Toast.makeText(requireContext(), "${shoe.name} agregado al carrito", Toast.LENGTH_SHORT).show()
        }

        return view
    }

    companion object {
        fun newInstance(shoe: Shoe): ShoeDetailFragment {
            val fragment = ShoeDetailFragment()
            val args = Bundle()
            args.putParcelable("shoe", shoe)
            fragment.arguments = args
            return fragment
        }
    }
}