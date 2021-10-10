package com.example.fragmentintro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentintro.databinding.FragmentCounterBinding

class CounterFragment : Fragment() {
lateinit var binding: FragmentCounterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCounterBinding.inflate(inflater)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.plus.setOnClickListener {
            var counterValue = binding.counter.text.toString().toInt()
            binding.counter.text = (++counterValue).toString()
        }

        binding.minus.setOnClickListener {
            var counterValue =  binding.counter.text.toString().toInt()
            if (counterValue > 0) {
                binding.counter.text = (--counterValue).toString()
            }
        }
    }

    companion object {
          @JvmStatic
        fun newInstance() =  CounterFragment()
    }
}