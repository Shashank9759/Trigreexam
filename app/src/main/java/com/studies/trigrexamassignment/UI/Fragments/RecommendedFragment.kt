package com.studies.trigrexamassignment.UI.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.studies.trigrexamassignment.R
import com.studies.trigrexamassignment.UI.Adapters.foodAdapter2
import com.studies.trigrexamassignment.UI.Models.foodModel2
import com.studies.trigrexamassignment.databinding.FragmentRecommendedBinding


class RecommendedFragment : Fragment() {
  lateinit var binding:FragmentRecommendedBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding=FragmentRecommendedBinding.inflate(layoutInflater,container,false)

        val list= listOf<foodModel2>(foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),
            foodModel2(R.drawable.square,"Domingo Pizza","Pizza",4.5f,"36 min"),)
        val adapter=foodAdapter2(requireContext(),list)
        binding.foodRV2.adapter=adapter
        return binding.root
    }


}