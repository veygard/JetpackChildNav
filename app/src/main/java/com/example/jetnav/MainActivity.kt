package com.example.jetnav

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.fragment.NavHostFragment
import com.example.jetnav.ui.theme.JetNavTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        startNavigation()
    }
    private fun startNavigation() {
        if (intent.hasExtra(DESTINATION)) {
            val destination = intent.getIntExtra(DESTINATION, -1)
            if (destination != -1) {
                val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
                val navController = navHostFragment.navController
                val navInflater = navController.navInflater
                val graph = navInflater.inflate(destination)
                val startDestination = intent.getIntExtra(START_DESTINATION, -1)
                if (startDestination != -1) {
                    graph.startDestination = startDestination
                }
                graph.let { navController.graph = it }
            }
        }else{
            setContentView(R.layout.activity_main)
        }
    }

    companion object {
        private const val DESTINATION = "destination"
        private const val START_DESTINATION = "start_destination"

        fun start(
            context: Context,
            destinationGraph: Int? = null,
            startDestination: Int? = null
        ) {
            val intent = Intent(context, MainActivity::class.java)
            intent.putExtra(DESTINATION, destinationGraph)
            intent.putExtra(START_DESTINATION, startDestination)
            context.startActivity(intent)
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetNavTheme {
        Greeting("Android")
    }
}