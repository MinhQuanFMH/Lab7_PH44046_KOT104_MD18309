package com.example.lab7kot_ph44046

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab7kot_ph44046.Model.ViewModel.MainViewModel
import com.example.lab7kot_ph44046.ui.theme.Lab7KOT_PH44046Theme
import com.example.lab7kot_ph44046.ui.theme.Screen.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab7KOT_PH44046Theme {
                val mainViewModel: MainViewModel = viewModel()
                val moviesState =
                    mainViewModel.movies.observeAsState(initial = emptyList())
//            MovieScreen(moviesState.value)
                ScreenNavigation()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab7KOT_PH44046Theme {
        Greeting("Android")
    }
}