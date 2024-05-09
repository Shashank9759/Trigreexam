package com.studies.trigrexamassignment.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.studies.trigrexamassignment.R
import com.studies.trigrexamassignment.UI.Adapters.ViewPagerAdapter
import com.studies.trigrexamassignment.UI.Adapters.foodAdapter
import com.studies.trigrexamassignment.UI.Models.foodModel1
import com.studies.trigrexamassignment.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
   lateinit var binding:FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(inflater,container,false)
        val list= listOf<foodModel1>(foodModel1(R.drawable.food,"Pizza"),
            foodModel1(R.drawable.food,"Pizza"),
            foodModel1(R.drawable.food,"Burger"),
            foodModel1(R.drawable.food,"Chicken"),
            foodModel1(R.drawable.food,"Dosa"),
            foodModel1(R.drawable.food,"Egg"),
            foodModel1(R.drawable.food,"Gulab Jamun"),foodModel1(R.drawable.food,"Cheese"),
            foodModel1(R.drawable.food,"Maggie"),
            foodModel1(R.drawable.food,"Tea"),
            )
  val adapter= foodAdapter(requireContext(),list)
        binding.foodRV.adapter=adapter


        val viewPager = binding.viewPager
        viewPager.adapter = ViewPagerAdapter(requireActivity())

        val tabLayout = binding.tabLayout


        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            when (position) {
                0 -> tab.text = "Recommended"
                1 -> tab.text = "Popular"
            }
        }.attach()
        return binding.root
    }


}