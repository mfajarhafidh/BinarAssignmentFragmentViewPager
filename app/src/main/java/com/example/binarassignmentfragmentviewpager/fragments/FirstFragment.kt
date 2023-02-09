package com.example.binarassignmentfragmentviewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.binarassignmentfragmentviewpager.databinding.FragmentFirstBinding
import com.example.binarassignmentfragmentviewpager.utilities.loadImageUrl

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding: FragmentFirstBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgFirst.loadImageUrl(IMG_URL)
    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }

    companion object {
        private const val IMG_URL =
            "https://w0.peakpx.com/wallpaper/194/827/HD-wallpaper-black-amoled-android-amoled-android-black-brand-technology.jpg"
    }
}