package com.example.individual5m6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.individual5m6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter()
        binding.recyclerView.adapter = adapter

        viewModel.items.observe(this) { items ->
            adapter.submitList(items)
        }

        viewModel.fetchDataFromApi()
    }
}