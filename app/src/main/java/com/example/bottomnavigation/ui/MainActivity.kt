package com.example.bottomnavigation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.ActivityMainBinding
import com.example.bottomnavigation.fragment.AddFragment
import com.example.bottomnavigation.fragment.HomeFragment
import com.example.bottomnavigation.fragment.ProfileFragment
import com.example.bottomnavigation.fragment.ReelsFragment
import com.example.bottomnavigation.fragment.SearchFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        bottomNavigationView = binding.bottomNavigation

        bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bottomHome -> {
                    replaceFragment(HomeFragment())
                    true
                }
                R.id.bottomReels -> {
                    replaceFragment(ReelsFragment())
                    true
                }
                R.id.bottomSearch -> {
                    replaceFragment(SearchFragment())
                    true
                }
                R.id.bottomProfile -> {
                    replaceFragment(ProfileFragment())
                    true
                }
                R.id.bottomAdd -> {
                    replaceFragment(AddFragment())
                    true
                }
                else -> false
            }
        }
        replaceFragment(HomeFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}
