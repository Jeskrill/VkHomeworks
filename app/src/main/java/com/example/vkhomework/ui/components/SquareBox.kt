package com.example.vkhomework.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.example.vkhomework.ui.AppDimens

@Composable
fun SquareBox(
    index: Int,
    backgroundColor: Brush,
    onClick: () -> Unit
)

{

    Box(
        modifier = Modifier
            .aspectRatio(1f)
            .padding(AppDimens.paddingSmall)
            .background(brush = backgroundColor, shape = RoundedCornerShape(AppDimens.cornerRound))
            .clickable() {onClick()}
    ) {
        Text(
            modifier = Modifier
                .align(alignment = Alignment.Center),
            text = index.toString(),
            style = MaterialTheme.typography.bodyLarge,
            color = Color.White
        )
    }
}