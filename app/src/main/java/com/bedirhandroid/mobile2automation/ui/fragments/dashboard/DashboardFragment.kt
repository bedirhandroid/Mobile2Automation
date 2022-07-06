package com.bedirhandroid.mobile2automation.ui.fragments.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.bedirhandroid.mobile2automation.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private lateinit var binding: FragmentDashboardBinding
    private lateinit var viewModel: DashboardFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentDashboardBinding.inflate(layoutInflater,container,false)
        initViewModel()
        return binding.root
    }

    private fun initViewModel() {
        viewModel = ViewModelProvider(this)[DashboardFragmentViewModel::class.java]
    }
}