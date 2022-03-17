package com.example.nextbutton.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.nextbutton.R
import com.example.nextbutton.databinding.FragmnetFirstBinding

class FirstFragment: Fragment(R.layout.fragmnet_first) {

    private lateinit var binding: FragmnetFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmnetFirstBinding.bind(view)
    }
}