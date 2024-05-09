package com.studies.trigrexamassignment.UI.Adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.studies.trigrexamassignment.UI.Fragments.PopularFragment
import com.studies.trigrexamassignment.UI.Fragments.RecommendedFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2 // Number of fragments
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> RecommendedFragment()
            1 -> PopularFragment()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}
