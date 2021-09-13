package com.example.jetnav.home

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface HomeRouter {
    fun routeBack()
    fun routeToProfileNav()
    fun routeToAuthNav()
}

class HomeRouterImpl(
    private val fragment: Fragment
) : HomeRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeToProfileNav() {
        fragment.findNavController().navigate(R.id.action_homeFragment_to_to_profile_nav)
    }

    override fun routeToAuthNav() {
        fragment.findNavController().navigate(R.id.action_homeFragment_to_to_auth_nav)
    }
}