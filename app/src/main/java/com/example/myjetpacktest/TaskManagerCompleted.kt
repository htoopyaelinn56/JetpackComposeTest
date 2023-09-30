package com.example.myjetpacktest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskManagerCompleted() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xfffafafa)

    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val img = painterResource(id = R.drawable.ic_task_completed)
            Image(
                painter = img, contentDescription = null,
            )
            Text(
                text = stringResource(id = R.string.task_completed),
                fontWeight = FontWeight.Bold, fontSize = 24.sp
            )
            Text(text = stringResource(id = R.string.nice_work))
        }
    }
}