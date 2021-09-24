package com.example.jetnav.home.profile.profileFragmentTwo

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface ProfileTwoRouter {
    fun routeBack()
    fun routeMain()
    fun routeToProfileOne()
    fun routeToOtpFragment()
}

class ProfileTwoRouterImpl(
    private val fragment: Fragment
) : ProfileTwoRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeMain() {
        val navController = fragment.findNavController()
        navController.setGraph(R.navigation.nav_root)
        navController.navigate(R.id.action_global_home)
    }

    override fun routeToProfileOne() {
        fragment.findNavController().navigate(R.id.action_profileTwoFragment_to_profileOneFragment2)
    }


    override fun routeToOtpFragment() {
        val navController = fragment.findNavController()
        navController.setGraph(R.navigation.nav_auth)
        navController.navigate(R.id.action_global_otpFragment)
    }
}