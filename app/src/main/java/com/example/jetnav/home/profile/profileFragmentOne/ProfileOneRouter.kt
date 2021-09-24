package com.example.jetnav.home.profile.profileFragmentOne

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface ProfileOneRouter {
    fun routeBack()
    fun routeMain()
    fun routeToProfileTwo()
}

class ProfileOneRouterImpl(
    private val fragment: Fragment
) : ProfileOneRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeMain() {
        val navController = fragment.findNavController()
        navController.setGraph(R.navigation.nav_root)
        navController.navigate(R.id.action_global_home)
    }

    override fun routeToProfileTwo() {
        fragment.findNavController().navigate(R.id.action_profileOneFragment_to_profileTwoFragment)
    }
}