package com.example.examendecertificacin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examendecertificacin.databinding.FragmentHoroscopeListBinding

class HoroscopeListFragment : Fragment() {

    private lateinit var binding: FragmentHoroscopeListBinding
    private lateinit var viewModel: HoroscopeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoroscopeListBinding.inflate(inflater, container, false)

        // Crear instancias de ApiService y HoroscopeDatabase
        val apiService = ApiService.create() // Retrofit: Crea la instancia de ApiService
        val database = HoroscopeDatabase.getInstance(requireContext()) // Room: Crea la instancia de HoroscopeDatabase

        // Instanciar el repositorio con los servicios y la base de datos
        val repository = HoroscopeRepository(apiService, database)

        // Crear una instancia del ViewModel pasando el repositorio
        viewModel = ViewModelProvider(
            this,
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return HoroscopeViewModel(repository) as T
                }
            }
        ).get(HoroscopeViewModel::class.java)

        // Configuración del RecyclerView
        binding.horoscopeRecyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = HoroscopeAdapter { horoscopeId ->
            // Navegar al detalle del horóscopo usando Navigation Component
            val action = HoroscopeListFragmentDirections.actionHoroscopeListFragmentToHoroscopeDetailFragment(horoscopeId)
            findNavController().navigate(action)
        }
        binding.horoscopeRecyclerView.adapter = adapter

        // Observar los horóscopos y actualizarlos en el RecyclerView
        viewModel.horoscopes.observe(viewLifecycleOwner, { horoscopes ->
            adapter.submitList(horoscopes)
        })

        return binding.root
    }
}