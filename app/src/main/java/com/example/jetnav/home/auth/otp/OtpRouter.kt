package com.example.jetnav.home.auth.otp

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface OtpRouter {
    fun routeBack()
    fun routeMain()
    fun routeToBeforeOtp()
    fun routeToProfileNav()
    fun routeToProfileTwo()
}

class OtpRouterImpl(
    private val fragment: Fragment
) : OtpRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeMain() {
        val navController = fragment.findNavController()
        navController.setGraph(R.navigation.nav_root)
        navController.navigate(R.id.action_global_home)
    }

    override fun routeToBeforeOtp() {
        fragment.findNavController().navigate(R.id.action_otpFragment_to_beforeOtpFragment2)
    }

    override fun routeToProfileNav() {
        fragment.findNavController().navigate(R.id.action_global_to_profile_nav2)
    }

    override fun routeToProfileTwo() {
        val navController = fragment.findNavController()
        navController.setGraph(R.navigation.nav_profile)
        navController.navigate(R.id.action_global_profileTwoFragment)
    }
}