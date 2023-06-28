package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text(text = "Let's start Jetpack Compose.")
    }
}
   /* @Preview(name = "SampleApp", device = "spec:width=1080px,height=2340px,dpi=440,isRound=true",
        showBackground = true, showSystemUi = true, backgroundColor = 0xFF673AB7,
        uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
    )
    @Composable
    fun sampleText(text:String){
        // Text is used to print the text.
        Text(text)
    }*/

  @Preview(showBackground = true, widthDp = 100, heightDp = 100)
    @Composable
    fun useTextResources(){
        Text(
            text = "Let's start Jetpack Compose.,",
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            color = Color.Green)
    }

    @Preview(widthDp = 200, heightDp = 300)
    @Composable
    fun useImageResources(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Dummy Image",
            colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
            )
    }

}