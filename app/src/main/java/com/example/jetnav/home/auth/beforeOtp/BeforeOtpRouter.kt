package com.example.jetnav.home.auth.beforeOtp

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface BeforeOtpRouter {
    fun routeBack()
    fun routeMain()
    fun routeToOtp()
    fun routeToProfileNav()
    fun routeToProfileTwoFragment()
}

class BeforeOtpRouterImpl(
    private val fragment: Fragment
) : BeforeOtpRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeMain() {
        fragment.findNavController().navigate(R.id.action_global_homeFragment)
    }

    override fun routeToOtp() {
        fragment.findNavController().navigate(R.id.action_beforeOtpFragment_to_otpFragment)
    }

    override fun routeToProfileNav() {
        fragment.findNavController().navigate(R.id.action_global_to_profile_nav2)
    }

    override fun routeToProfileTwoFragment() {
        fragment.findNavController().navigate(R.id.action_global_profileTwoFragment)
    }
}