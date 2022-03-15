package com.example.nextbutton.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.example.nextbutton.R
import com.example.nextbutton.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    var text: MutableList<String> = mutableListOf()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        val top = "Joqar"
        text.add(top)
        val start = "Shep"
        text.add(start)
        val end = "Ón"
        text.add(end)
        val bottom = "Tómen"
        text.add(bottom)

        binding.buttonTop.text = top
        binding.buttonStart.text = start
        binding.buttonEnd.text = end
        binding.buttonBottom.text = bottom

        randomButton()
        resetButton()

    }

    private fun randomButton() {
        binding.buttonCenter.text = text.random()
        binding.apply {
            binding.buttonCenter.setOnClickListener {
                when {
                    buttonCenter.text.toString() == buttonTop.text.toString() -> {
                        buttonCenter.isVisible = false
                        buttonTop.isVisible = true
                    }
                    buttonCenter.text.toString() == buttonStart.text.toString() -> {
                        buttonCenter.isVisible = false
                        buttonStart.isVisible = true
                    }
                    buttonCenter.text.toString() == buttonEnd.text.toString() -> {
                        buttonCenter.isVisible = false
                        buttonEnd.isVisible = true
                    }
                    buttonCenter.text.toString() == buttonBottom.text.toString() -> {
                        buttonCenter.isVisible = false
                        buttonBottom.isVisible = true
                    }
                }
            }
        }
    }

    private fun resetButton() {
        binding.btnReset.setOnClickListener {
            randomButton()
        }
    }

}