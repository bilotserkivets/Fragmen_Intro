package com.example.fragmentintro

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentintro.databinding.FragmentStyleBinding


class StyleFragment : Fragment() {
    lateinit var binding: FragmentStyleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStyleBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.boldButton.setOnClickListener {
            if (binding.helloWorld.typeface?.isItalic == true) {
                binding.helloWorld.setTypeface(binding.helloWorld.typeface, Typeface.BOLD_ITALIC)
            } else {
                binding.helloWorld.setTypeface(null, Typeface.BOLD)
            }
        }

        binding.italicButton.setOnClickListener {
            if (binding.helloWorld.typeface?.isBold == true) {
                binding.helloWorld.setTypeface(binding.helloWorld.typeface, Typeface.BOLD_ITALIC)
            } else {
                binding.helloWorld.setTypeface(null, Typeface.ITALIC)
            }
        }
        binding.resetButton.setOnClickListener {
            binding.helloWorld.setTypeface(null, Typeface.NORMAL)
        }
    }

    companion object {
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = StyleFragment()
    }
}