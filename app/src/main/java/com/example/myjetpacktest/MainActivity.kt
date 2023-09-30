package com.example.myjetpacktest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.myjetpacktest.ui.theme.MyJetpackTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyJetpackTestTheme {
                // A surface container using the 'background' color from the theme
                DiceRoller()
            }
        }
    }
}


