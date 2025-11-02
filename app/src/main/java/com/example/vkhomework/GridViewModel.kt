package com.example.vkhomework

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.graphics.Brush
import androidx.lifecycle.ViewModel
import com.example.vkhomework.ui.theme.BlueGradient
import com.example.vkhomework.ui.theme.RedGradient

class GridViewModel: ViewModel() {
    private val _rectanglesList = mutableStateListOf<Int>()
    val rectanglesList: SnapshotStateList<Int> = _rectanglesList

    fun addRectangle() {
        _rectanglesList.add(_rectanglesList.size)
    }
    fun getBackgroundColor(index: Int): Brush {
        return if (index % 2 == 0 ) RedGradient else BlueGradient
    }

}