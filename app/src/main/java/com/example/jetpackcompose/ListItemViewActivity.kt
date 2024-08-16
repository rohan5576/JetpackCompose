package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tweetsyapp.R

class ListItemViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

     @Preview(showSystemUi = true)
     @Composable
     private fun listViewItem(){
         Column(Modifier.padding(10.dp)) {
             Row(Modifier.padding(10.dp),) {
                 Image(painter = painterResource(id = R.drawable.baseline_3g_mobiledata_24),
                     contentDescription ="" )
                 Column(Modifier.padding(5.dp)) {
                     Text(text = "Square University")
                     Text(text = "Senior Software Engineer")
                 }
             }
             Row(Modifier.padding(10.dp)) {
                 Image(painter = painterResource(id = R.drawable.baseline_3g_mobiledata_24),
                     contentDescription ="" )
                 Column(Modifier.padding(5.dp)) {
                     Text(text = "Square University")
                     Text(text = "Senior Software Engineer")
                 }
             }
             Row(Modifier.padding(10.dp)) {
                 Image(painter = painterResource(id = R.drawable.baseline_3g_mobiledata_24),
                     contentDescription ="" )
                 Column(Modifier.padding(5.dp)) {
                     Text(text = "Square University")
                     Text(text = "Senior Software Engineer")
                 }
             }
         }

     }
}