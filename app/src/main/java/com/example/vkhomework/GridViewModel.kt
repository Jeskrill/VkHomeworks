package com.example.vkhomework

import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel

@Stable
class GridViewModel: ViewModel() {
    private val _squaresList = mutableStateListOf<Int>()
    val squaresList: SnapshotStateList<Int> = _squaresList
    val removedQueue: ArrayDeque<Int> = ArrayDeque()

    fun onSquareClick(item: Int) {
        val removed = _squaresList.remove(item)
        if (removed) {
            removedQueue.addLast(item)
        }
    }
    fun onAddClick() {
        if (removedQueue.isNotEmpty()) {
            val next = removedQueue.removeFirst()
            _squaresList.add(next)
        } else {
            val next = _squaresList.size
            _squaresList.add(next)
        }
    }
}