package com.example.dessertclicker

import com.example.dessertclicker.data.Datasource.dessertList

data class DessertUiState(
    val currentDessertIndex: Int = 0,
    val dessertsSold: Int = 0,
    val revenue: Int = 0,
    val currentDessertPrice: Int = dessertList[0].price,
    val currentDessertImageId: Int = dessertList[0].imageId
)
