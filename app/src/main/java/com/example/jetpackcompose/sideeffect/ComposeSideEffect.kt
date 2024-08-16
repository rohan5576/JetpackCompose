package com.example.jetpackcompose.sideeffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.jetpackcompose.R

class ComposeSideEffect : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContent { 
            
        }
    }
    //compose side effect is when any changes happen outside the composable function.
    
    @Composable
    fun LaunchedEffectFunction(){
       val counter = remember {
           mutableStateOf(0)
       } 
        
        LaunchedEffect(key1 = Unit) {
            
        }
        
        var text ="Counter is runnning ${counter.value}"
        Text(text = text)
    }
}