package com.example.jetnav.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
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
class HomeFragment : Fragment() {

    private val homeRouter by lazy {
        HomeRouterImpl(fragment = this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        view.findViewById<ComposeView>(R.id.composeContainer_home).setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Home Fragment", fontSize = 30.sp)
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = { homeRouter.routeToAuthNav() }) {
                    Text(text = "To Auth Nav")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Button(onClick = { homeRouter.routeToProfileNav() }) {
                    Text(text = "To Profile Nav")
                }
            }

        }
        return view
    }
}