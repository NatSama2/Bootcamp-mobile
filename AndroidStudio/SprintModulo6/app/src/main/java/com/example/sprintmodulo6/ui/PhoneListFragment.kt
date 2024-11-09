package com.example.sprintmodulo6.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.sprintmodulo6.databinding.FragmentPhoneListBinding

class PhoneListFragment : Fragment() {
    private var _binding: FragmentPhoneListBinding? = null
    private val binding get() = _binding!!
    private val viewModel: PhoneViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPhoneListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = PhoneAdapter { phone ->
            // Navegación al detalle del teléfono
        }
        binding.recyclerView.adapter = adapter

        viewModel.phones.observe(viewLifecycleOwner) { phones ->
            adapter.submitList(phones)
        }

        viewModel.fetchPhones()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}