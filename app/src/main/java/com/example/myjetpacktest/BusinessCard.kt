package com.example.myjetpacktest

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xffcedece)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier.weight(1f),
                contentAlignment = Alignment.Center
            ) {
                _NameCard()
            }
            _InfoRow(icon = Icons.Rounded.Phone, value = "034234234")
            _InfoRow(icon = Icons.Rounded.Share, value = "@AndroidDev")
            _InfoRow(icon = Icons.Rounded.Email, value = "Blah@gmail.com")
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
private fun _NameCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        _AndroidLogo()
        Text(text = "Jennifier Doe", fontSize = 30.sp)
        Text(text = "Android Developer")
    }

}

@Composable
private fun _AndroidLogo() {
    Surface(
        color = Color(0xff142f40), modifier = Modifier.size(width = 100.dp, height = 100.dp)
    ) {
        val img = painterResource(id = R.drawable.android_logo)
        Image(painter = img, contentDescription = null, modifier = Modifier.padding(15.dp))
    }
}

@Composable
private fun _InfoRow(icon: ImageVector, value: String) {
    Row(
    modifier = Modifier.padding(start = 40.dp, bottom = 10.dp)
    ) {
        Box(
            modifier = Modifier.width(35.dp)
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,

            )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Box(
            modifier = Modifier.width(150.dp)
        ) {
            Text(value)
        }
    }
}