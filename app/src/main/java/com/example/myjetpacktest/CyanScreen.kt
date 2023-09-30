package com.example.myjetpacktest

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun CyanScreen() {
    return Surface(
        color = Color.Cyan,
        modifier = Modifier.fillMaxSize()
    ) {
        Greeting()
    }
}

@Composable
fun Greeting() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Surface(color = Color.Red) {
            Text(
                text = stringResource(R.string.hello_world),
                color = Color.Black,
                modifier = Modifier.padding(10.dp)
            )
        }
        Text(
            text = stringResource(R.string.this_is_second_line), color = Color.Black,
            modifier = Modifier
                .padding(10.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }
}
