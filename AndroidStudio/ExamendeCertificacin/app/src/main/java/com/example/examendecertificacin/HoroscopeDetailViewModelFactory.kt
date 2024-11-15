package com.example.examendecertificacin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class HoroscopeDetailViewModelFactory(private val repository: HoroscopeRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HoroscopeDetailViewModel::class.java)) {
            return HoroscopeDetailViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}