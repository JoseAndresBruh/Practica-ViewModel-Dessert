package com.example.dessertclicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.Composable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DessertClickerApp()
        }
    }
}

@Composable
fun DessertClickerApp(viewModel: DessertViewModel = viewModel()) {
    // AQUI SE OBSERVA EL ESTADO DEL VIEWMODEL
    val uiState by viewModel.uiState.collectAsState()

    DessertClickerScreen(
        revenue = uiState.revenue,
        dessertsSold = uiState.dessertsSold,
        dessertImageId = uiState.currentDessertImageId,
        onDessertClicked = { viewModel.onDessertClicked() }
    )
}
