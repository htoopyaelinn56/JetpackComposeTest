package com.example.myjetpacktest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun JetpackComposeTutorial() {
    Column(

    ) {
        val img = painterResource(R.drawable.bg_compose_background)
        Image(painter = img, contentDescription = null, contentScale = ContentScale.FillWidth)
        Text(
            text = stringResource(
                R.string.jetpack_compose_tutorial,
            ), fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(
                R.string.first_paragraph,
            ),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(
                R.string.second_paragraph,
            ),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }
}