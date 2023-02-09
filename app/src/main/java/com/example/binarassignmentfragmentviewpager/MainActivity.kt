package com.example.binarassignmentfragmentviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.binarassignmentfragmentviewpager.adapter.ViewPagerAdapter
import com.example.binarassignmentfragmentviewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupViewPager()
    }

    private fun setupViewPager() {
        val viewPager = binding.vpTabs
        viewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
}