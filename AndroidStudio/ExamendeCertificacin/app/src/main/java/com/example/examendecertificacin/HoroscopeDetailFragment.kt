package com.example.examendecertificacin

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.examendecertificacin.databinding.FragmentHoroscopeDetailBinding

class HoroscopeDetailFragment : Fragment() {

    private lateinit var binding: FragmentHoroscopeDetailBinding
    private lateinit var viewModel: HoroscopeDetailViewModel
    private var horoscopeId: String? = null
    private lateinit var repository: HoroscopeRepository
    private lateinit var apiService: ApiService
    private lateinit var database: HoroscopeDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHoroscopeDetailBinding.inflate(inflater, container, false)

        apiService = ApiService.create()
        database = HoroscopeDatabase.getInstance(requireContext())

        repository = HoroscopeRepository(apiService, database)

        val factory = HoroscopeDetailViewModelFactory(repository)
        viewModel = ViewModelProvider(this, factory).get(HoroscopeDetailViewModel::class.java)

        horoscopeId = arguments?.getString("horoscopeId")
        horoscopeId?.let { viewModel.loadHoroscopeDetail(it) }

        viewModel.horoscopeDetail.observe(viewLifecycleOwner, { detail ->
            if (detail != null) {

                binding.horoscopeName.text = detail.name
                binding.horoscopeDescription.text = detail.dates
                binding.horoscopeDescription.append("\nElemento: ${detail.element}")
                binding.horoscopeDescription.append("\nPlaneta Regente: ${detail.rulingPlanet}")
                binding.horoscopeDescription.append("\nSímbolo: ${detail.symbol}")
                binding.horoscopeDescription.append("\nColor: ${detail.color}")
                binding.horoscopeDescription.append("\nDescripción: ${detail.description}")

                binding.horoscopeStrengths.text = "Fortalezas: ${detail.strengths?.joinToString(", ")}"
                binding.horoscopeWeaknesses.text = "Debilidades: ${detail.weaknesses?.joinToString(", ")}"
                binding.horoscopeCompatibility.text = "Compatibilidad: ${detail.compatibility?.joinToString(", ")}"

                // Carga la imagen
                Glide.with(this)
                    .load(detail.imageUrl)
                    .into(binding.horoscopeImage)

                binding.emailButton.setOnClickListener {
                    sendEmail(detail.name ?: "Nombre desconocido")
                }
            } else {
                binding.horoscopeName.text = "Detalles no disponibles"
                binding.horoscopeDescription.text = "No se pudo cargar la información del horóscopo."
            }
        })

        return binding.root
    }

    private fun sendEmail(horoscopeName: String) {
        val intent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_EMAIL, arrayOf("tuhoroscopodiario@gmail.com"))
            putExtra(Intent.EXTRA_SUBJECT, "Información sobre mi Horóscopo - $horoscopeName")
            putExtra(Intent.EXTRA_TEXT, "Solicito más información sobre mi signo $horoscopeName.")
        }
        startActivity(intent)
    }
}