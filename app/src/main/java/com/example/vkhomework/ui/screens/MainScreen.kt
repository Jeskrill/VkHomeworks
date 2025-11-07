package com.example.vkhomework.ui.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import com.example.vkhomework.GridViewModel
import com.example.vkhomework.R
import com.example.vkhomework.ui.AppDimens
import com.example.vkhomework.ui.Constants
import com.example.vkhomework.ui.components.SquareBox
import com.example.vkhomework.ui.theme.BlueGradient
import com.example.vkhomework.ui.theme.LightGray
import com.example.vkhomework.ui.theme.RedGradient

@Composable
fun MainScreen(viewModel: GridViewModel) {
    val squares = viewModel.squaresList
    val configuration = LocalConfiguration.current
    val columns = remember(configuration.orientation) {
        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT)
            Constants.PORTRAIT_COLUMNS else Constants.LANDSCAPE_COLUMNS
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(AppDimens.paddingLarge)
    ) {
        LazyVerticalGrid(
            columns = GridCells.Fixed(columns),
            modifier = Modifier.weight(1f)
        ) {
            items(squares.size) {
                index ->
                val backgroundColor = if (index % 2 == 0 ) RedGradient else BlueGradient
                SquareBox(index = index, backgroundColor = backgroundColor)
            }
        }
        Spacer(modifier = Modifier.height(AppDimens.paddingLarge))
        FloatingActionButton(
            onClick = { viewModel.addRectangle() },
            containerColor = LightGray,
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.End)
                .padding(bottom = AppDimens.paddingLarge)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.add_icon),
                contentDescription = "Add",
                modifier = Modifier.Companion.size(AppDimens.iconSize)
            )
        }
    }
}





