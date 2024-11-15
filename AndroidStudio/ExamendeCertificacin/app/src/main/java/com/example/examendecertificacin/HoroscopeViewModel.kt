package com.example.examendecertificacin

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HoroscopeViewModel(private val repository: HoroscopeRepository) : ViewModel() {

    val horoscopes: LiveData<List<Horoscope>> = liveData(Dispatchers.IO) {
        emit(repository.getHoroscopes())
    }
}