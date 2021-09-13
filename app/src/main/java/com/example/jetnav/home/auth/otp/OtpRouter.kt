package com.example.jetnav.home.auth.otp

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.jetnav.R


interface OtpRouter {
    fun routeBack()
    fun routeMain()
    fun routeToBeforeOtp()
    fun routeToProfileNav()
}

class OtpRouterImpl(
    private val fragment: Fragment
) : OtpRouter {

    override fun routeBack() {
        fragment.findNavController().navigateUp()
    }

    override fun routeMain() {
        fragment.findNavController().navigate(R.id.action_global_homeFragment)
    }

    override fun routeToBeforeOtp() {
        fragment.findNavController().navigate(R.id.action_otpFragment_to_beforeOtpFragment2)
    }

    override fun routeToProfileNav() {
        fragment.findNavController().navigate(R.id.action_global_to_profile_nav2)
    }
}