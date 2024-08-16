package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable


class Recomposition : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var dataList = listOf("1","2","3")
            RecompositionScreen("Person",dataList)
        }

    }


    @Composable
    fun RecompositionScreen(name : String,
                            listData: List<String>){

          Column {
              androidx.compose.material3.Text(text = name, style = MaterialTheme.typography.bodyLarge)
              Divider()

              LazyColumn {
                  items(listData){ names->
                    ListData(name = name)
                  }
              }
          }


    }

    @Composable
    fun ListData(name:String){
        androidx.compose.material3.Text(text = name)

    }
}

