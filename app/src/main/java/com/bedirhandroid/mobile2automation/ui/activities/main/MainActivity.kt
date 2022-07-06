package com.bedirhandroid.mobile2automation.ui.activities.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bedirhandroid.mobile2automation.R
import com.bedirhandroid.mobile2automation.databinding.ActivityMainBinding
import com.bedirhandroid.mobile2automation.models.NewModels
import com.bedirhandroid.mobile2automation.util.jsonToDataClassModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel : MainActivityViewModel
    private lateinit var dataModel : NewModels

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataModel = applicationContext.jsonToDataClassModel(R.raw.data)
        initBinding()
        initViewModel()
    }

    private fun initBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this@MainActivity)[MainActivityViewModel::class.java]
    }

}