package com.example.jetpackcompose.day6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.R

class RememberSaveableActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    @Preview
    @Composable
    fun RememberSaveableSample() {
        var clickCount = rememberSaveable { mutableStateOf(0) }
        Column {
            Button(onClick = { clickCount.value++ }) {
                Text(text = "" + clickCount.value + " times clicked")
            }
        }
    }
}