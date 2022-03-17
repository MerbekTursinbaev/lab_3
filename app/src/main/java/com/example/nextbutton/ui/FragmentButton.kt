package com.example.nextbutton.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.nextbutton.R
import com.example.nextbutton.databinding.FragmentButtonBinding

class FragmentButton:Fragment(R.layout.fragment_button) {

    private lateinit var binding: FragmentButtonBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentButtonBinding.bind(view)

        binding.apply {
            firstButton.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentButton_to_firstFragment)
            }
            secondButton.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentButton_to_secondFragment)
            }
            thirdButton.setOnClickListener {
                findNavController().navigate(R.id.action_fragmentButton_to_mainFragment)
            }
        }
    }
}