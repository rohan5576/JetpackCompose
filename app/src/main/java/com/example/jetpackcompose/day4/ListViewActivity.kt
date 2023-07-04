package com.example.jetpackcompose.day4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.R

class ListViewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }

    @Preview(heightDp = 400)
    @Composable
    private fun loadRecyclerView(){
      /*  Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            getListData().map { item ->
                recycleViewData(item.image,item.title,item.description)
            }
        }*/

        LazyColumn(content = {
            items(getListData()){ item->
                recycleViewData(image = item.image,item.title,item.description)
            }
        })
    }

    @Composable
    private fun recycleViewData(image:Int, title: String, description:String){
         Card(
             modifier = Modifier.padding(10.dp)
         ) {
             Row(verticalAlignment = Alignment.CenterVertically,
             modifier = Modifier.padding(8.dp)
                 ) {
                 Image(painter = painterResource(id = image),
                     contentDescription = "", modifier = Modifier
                         .size(40.dp)
                         .padding(10.dp))
                 Column() {
                     Text(text = title,
                     style= MaterialTheme.typography.titleMedium)
                     Text(text = description, style = MaterialTheme.typography.bodyLarge
                         )
                 }
             }
         }


    }

data class ListData(val image:Int, val title:String, val description:String)

    fun getListData(): MutableList<ListData> {
        val list = mutableListOf<ListData>()
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android","Android Description 1"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android1","Android Description 2"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android2","Android Description 3"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android3","Android Description 4"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android4","Android Description 5"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android5","Android Description 6"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android6","Android Description 7"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android7","Android Description 8"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android8","Android Description 9"))
        list.add(ListData(R.drawable.baseline_3g_mobiledata_24,"Android9","Android Description 10"))
        return list
    }
}