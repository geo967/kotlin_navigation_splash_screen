package com.example.navigation_splashscreen_kotlin.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigation_splashscreen_kotlin.R
import com.example.navigation_splashscreen_kotlin.onboarding.screens.FirstScreen
import com.example.navigation_splashscreen_kotlin.onboarding.screens.SecondScreen
import com.example.navigation_splashscreen_kotlin.onboarding.screens.ThirdFragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_view_pager, container, false)
        val fragmentList= arrayListOf<Fragment>(
            FirstScreen(),SecondScreen(),ThirdFragment()
        )
        val adapter=ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        view.viewPager.adapter=adapter
        return view
    }

}