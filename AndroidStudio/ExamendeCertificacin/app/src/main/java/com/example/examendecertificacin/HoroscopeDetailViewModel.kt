package com.example.examendecertificacin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HoroscopeDetailViewModel(private val repository: HoroscopeRepository) : ViewModel() {
    private val _horoscopeDetail = MutableLiveData<HoroscopeDetail?>()
    val horoscopeDetail: LiveData<HoroscopeDetail?> get() = _horoscopeDetail

    fun loadHoroscopeDetail(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            val horoscope = repository.getHoroscopeDetail(id)
            _horoscopeDetail.postValue(horoscope)
        }
    }
}