package com.example.binarassignmentfragmentviewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.binarassignmentfragmentviewpager.databinding.FragmentSecondBinding
import com.example.binarassignmentfragmentviewpager.utilities.loadImageUrl

class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding? = null
    private val binding : FragmentSecondBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgSecond.loadImageUrl(IMG_URL)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        private const val IMG_URL =
            "https://media.product.which.co.uk/prod/images/original/gm-60632e8f-20be-4b5a-9ca6-a6a9f5d019e6-android-main.jpeg"
    }

}