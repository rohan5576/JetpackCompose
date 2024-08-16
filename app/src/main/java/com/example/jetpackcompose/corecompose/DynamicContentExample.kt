package com.example.jetpackcompose.corecompose

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
val namesList: ArrayList<String> = arrayListOf("Rohan","Roshan","Aman")
class DynamicContentExample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingList(names = namesList)
        }
    }
}

@Composable
fun GreetingList(names:List<String>){
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally) {
        for (name in names){
            Greeting(name = name)
        }
        Button(onClick = { namesList.add("new name") }) {
            Text(text = "Add new Name")
        };
    }

}

@Composable
fun Greeting(name:String){
    Text(text = "Hello $name", color = Color.Cyan)
}

@Preview
@Composable
fun DefaultPreview(){
    GreetingList(names = namesList)
}