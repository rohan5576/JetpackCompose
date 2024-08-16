package com.example.tweetsyapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.tweetsyapp.screens.CategoryScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TweetActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            CategoryScreen()
        }
    }

}