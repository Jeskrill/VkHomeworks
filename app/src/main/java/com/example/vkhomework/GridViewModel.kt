package com.example.vkhomework

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList

import androidx.lifecycle.ViewModel


class GridViewModel: ViewModel() {
    private val _squaresList = mutableStateListOf<Int>()
    val squaresList: SnapshotStateList<Int> = _squaresList

    fun addRectangle() {
        _squaresList.add(_squaresList.size)
    }
}