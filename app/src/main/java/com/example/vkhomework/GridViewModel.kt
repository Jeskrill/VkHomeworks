package com.example.vkhomework

import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel


class GridViewModel: ViewModel() {
    private val _squaresList = mutableStateListOf<Int>()
    val squaresList: List<Int> get() = _squaresList
    private val _removedQueue: ArrayDeque<Int> = ArrayDeque()
    val removedQueue: ArrayDeque<Int> = _removedQueue

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