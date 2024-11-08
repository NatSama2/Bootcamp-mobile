package com.example.individual5m6

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MyViewModel : ViewModel() {
    private val repository = Repository()
    private val _items = MutableLiveData<List<MyData>>()
    val items: LiveData<List<MyData>> get() = _items

    fun fetchDataFromApi() {
        viewModelScope.launch {
            val response = repository.getDataFromApi()
            if (response.isSuccessful) {
                _items.value = response.body()
                repository.saveDataToDatabase(response.body()!!)
            }
        }
    }
}