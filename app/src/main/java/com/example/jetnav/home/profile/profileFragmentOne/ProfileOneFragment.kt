package com.example.jetnav.home.profile.profileFragmentOne

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import com.example.jetnav.R

@ExperimentalComposeUiApi
class ProfileOneFragment : Fragment() {

    private val profileOneRouter by lazy {
        ProfileOneRouterImpl(fragment = this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_profile_one, container, false)
        view.findViewById<ComposeView>(R.id.composeContainer_profile_one).setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Profile One", fontSize = 30.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
                    onClick = { profileOneRouter.routeToProfileTwo() }) {
                    Text(text = "To Profile Two Fragment")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                    onClick = { profileOneRouter.routeMain() }) {
                    Text(text = "Back to Home")
                }
            }
        }
        return view
    }

}