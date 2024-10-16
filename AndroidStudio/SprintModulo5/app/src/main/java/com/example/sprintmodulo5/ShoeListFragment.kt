package com.example.sprintmodulo5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sprintmodulo5.databinding.FragmentShoeListBinding

class ShoeListFragment : Fragment() {

    private var _binding: FragmentShoeListBinding? = null
    private val binding get() = _binding!!

    private lateinit var shoeAdapter: ShoeAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        // Inicializar ViewBinding
        _binding = FragmentShoeListBinding.inflate(inflater, container, false)

        // Inicializar el RecyclerView
        binding.recyclerView.layoutManager = LinearLayoutManager(context)

        // Obtener la lista de zapatos
        val shoeList = getShoeList()

        // Inicializar el adaptador con la lista y la acción de clic
        shoeAdapter = ShoeAdapter(shoeList) { shoe ->
            openShoeDetailFragment(shoe)
        }
        binding.recyclerView.adapter = shoeAdapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Limpiar el binding para evitar fugas de memoria
    }

    // Función que navega al fragmento de detalle del zapato
    private fun openShoeDetailFragment(shoe: Shoe) {
        // Navegar pasando el objeto shoe completo
        val action = ShoeListFragmentDirections.actionShoeListFragmentToShoeDetailFragment(shoe)
        findNavController().navigate(action)
    }

    // Lista de productos (zapatos)
    private fun getShoeList(): List<Shoe> {
        return listOf(
            Shoe("Zapatilla Pikachu", "https://nyplovers.cl/wp-content/uploads/2023/04/Zapatillas-pikachu-pokemon-anime-nyplovers-naruto-dragon-ball-one-piece-demon-slayer-kimetsu-no-yaiba-otaku-02.png", 99.99),
            Shoe("Zapatilla Charmander", "https://nyplovers.cl/wp-content/uploads/2023/07/charmander-zapatillaspokemonanimeregaloninospikachupokemongo-nyplovers-01-600x600.jpg", 79.99),
            Shoe("Zapatilla Gengar", "https://ae01.alicdn.com/kf/S6be690fc57764bdb871778318fa3a49a2.jpg_960x960.jpg", 149.99),
            Shoe("Zapatilla Bulbasaur", "https://home.ripley.cl/store/Attachment/WOP/D312/2000391957042/2000391957042-1.jpg", 129.99),
            Shoe("Zapatilla Squirtle", "https://home.ripley.cl/store/Attachment/WOP/D312/2000391957592/2000391957592_2.jpg", 109.99)
        )
    }
}