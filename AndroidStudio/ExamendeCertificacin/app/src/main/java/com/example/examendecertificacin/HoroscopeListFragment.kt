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

        val apiService = ApiService.create()
        val database = HoroscopeDatabase.getInstance(requireContext())

        val repository = HoroscopeRepository(apiService, database)

        viewModel = ViewModelProvider(
            this,
            object : ViewModelProvider.Factory {
                override fun <T : ViewModel> create(modelClass: Class<T>): T {
                    return HoroscopeViewModel(repository) as T
                }
            }
        ).get(HoroscopeViewModel::class.java)

        binding.horoscopeRecyclerView.layoutManager = LinearLayoutManager(context)
        val adapter = HoroscopeAdapter { horoscopeId ->

            val action = HoroscopeListFragmentDirections.actionHoroscopeListFragmentToHoroscopeDetailFragment(horoscopeId)
            findNavController().navigate(action)
        }
        binding.horoscopeRecyclerView.adapter = adapter

        viewModel.horoscopes.observe(viewLifecycleOwner, { horoscopes ->
            adapter.submitList(horoscopes)
        })

        return binding.root
    }
}