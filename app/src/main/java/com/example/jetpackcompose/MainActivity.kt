package com.example.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.tweetsyapp.R
import com.example.tweetsyapp.TweetActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            startActivity(Intent(this, TweetActivity::class.java))
    }
}
    /*@Preview(name = "SampleApp", device = "spec:width=1080px,height=2340px,dpi=440,isRound=true",
        showBackground = true, showSystemUi = true, backgroundColor = 0xFF673AB7,
        uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL
    )
    @Composable
    fun sampleText(text:String){
        // Text is used to print the text.
        Text(text)
    }*/

    @Composable
    fun useTextResources(){
        Text(
            text = "Let's start Jetpack Compose.,",
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Italic,
            color = Color.Green)
    }

    @Composable
    fun useImageResources(){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Dummy Image",
            colorFilter = ColorFilter.tint(Color.Red),
            contentScale = ContentScale.Crop
            )
    }

    @Composable
    fun useButtonResources(){
        val context = LocalContext.current
        Button(onClick = {

        }, enabled =true,
        colors = ButtonDefaults.buttonColors(containerColor = Color.Green,)) {
            Text(text = "TweetsyApp")
           /* Image(painter = painterResource(id = R.drawable.baseline_3g_mobiledata_24),
                contentDescription = "Button content")*/
        }
    }

    @Composable
    fun useTextFieldResources(){
        val state = remember{mutableStateOf("")}
        TextField(value = state.value,
            onValueChange ={ state.value =it},
        label = {
            Text(text = "Enter Data")
        })
    }


    @Composable
    fun TextFieldWithIcons() {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        return OutlinedTextField(
            value = text,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "emailIcon") },
            //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                text = it
            },
            label = { Text(text = "Email address") },
            placeholder = { Text(text = "Enter your e-mail") },
        )
    }

    @Composable
    private fun useColumnComposable(){
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment =Alignment.CenterHorizontally ) {
            Text(text = "First Item")
            Text(text = "Second Item")
        }
    }
    @Composable
    private fun useRowComposable(){
        Row(horizontalArrangement = Arrangement.Start,
            verticalAlignment =Alignment.CenterVertically ) {
            Text(text = "First Item")
            Text(text = "Second Item")
        }
    }


    @Composable
    private fun useBoxComposable(){
        Box() {
            Image(painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Button content")
           Text(text = "Box")
        }
    }
    

    @Composable
    private  fun useModifiersComposable(){
        Column {
            Row(Modifier.background(Color.Gray)) {
                Text(text = "Modifiers One", Modifier.padding(10.dp))
                Text(text = "Modifiers two", Modifier.padding(10.dp))
            }
            Text(text = "Modifiers Three", color = Color.Cyan,
                modifier = Modifier
                    .padding(Dp(10f))
                    .clip(RoundedCornerShape(25.dp))
                    .background(Color.Blue)
                    .padding(Dp(15f))
                )
        }
    }


    @Preview
    @Composable
    fun WeightModifier(){
        Row() {
            Column(
                Modifier.weight(1f).background(Color.Red)){
                Text(text = "Weight = 1", color = Color.White)
            }
            Column(
                Modifier.weight(1f).background(Color.Blue)){
                Text(text = "Weight = 1", color = Color.White)
            }
            Column(
                Modifier.weight(2f).background(Color.Green)
            ) {
                Text(text = "Weight = 2")
            }

        }
    }

}