package com.studies.trigrexamassignment.UI.Activities

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.studies.trigrexamassignment.R
import com.studies.trigrexamassignment.UI.Fragments.FoodFragment
import com.studies.trigrexamassignment.UI.Fragments.HomeFragment
import com.studies.trigrexamassignment.UI.Fragments.OrdersFragment
import com.studies.trigrexamassignment.UI.Fragments.SettingsFragment
import com.studies.trigrexamassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    private lateinit var bottomNavigation: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        bottomNavigation = binding.bottomNavigation
        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    loadFragment(HomeFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.food -> {
                    loadFragment(FoodFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.orders -> {
                    loadFragment(OrdersFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.settings -> {
                    loadFragment(SettingsFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                else -> false
            }
        }

        // Set default fragment
        loadFragment(HomeFragment())
    }
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}