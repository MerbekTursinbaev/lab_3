package com.example.nextbutton.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.nextbutton.R
import com.example.nextbutton.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
    }
}