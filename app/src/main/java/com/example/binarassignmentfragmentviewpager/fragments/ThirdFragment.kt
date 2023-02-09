package com.example.binarassignmentfragmentviewpager.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.binarassignmentfragmentviewpager.databinding.FragmentThirdBinding
import com.example.binarassignmentfragmentviewpager.utilities.loadImageUrl

class ThirdFragment : Fragment() {

    private var _binding : FragmentThirdBinding? = null
    private val binding : FragmentThirdBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imgThird.loadImageUrl(IMG_URL)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object{
        private const val IMG_URL =
            "https://www.simplilearn.com/ice9/free_resources_article_thumb/How_to_Become_an_Android_Developer.jpg"
    }
}