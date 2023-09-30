package com.example.myjetpacktest

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun ComposeQuadrant() {
    Column() {
        Box(
            modifier = Modifier
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Row() {
                _TextCard(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFEADDFF)).fillMaxHeight(),
                    text = "hello one"
                )
                _TextCard(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFD0BCFF)).fillMaxHeight(),
                    text = "hello two"
                )
            }
        }
        Box(
            modifier = Modifier
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Row() {
                _TextCard(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFB69DF8)).fillMaxHeight(),
                    text = "hello three"
                )
                _TextCard(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color(0xFFF6EDFF)).fillMaxHeight(),
                    text = "hello four"
                )
            }
        }
    }
}

@Composable
private fun _TextCard(modifier: Modifier, text: String) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center

    ) {
        Text(text)
    }
}