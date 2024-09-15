package com.xerna.kotlin_course_2024.toast

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.xerna.kotlin_course_2024.toast.ui.theme.Kotlin_course_2024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Kotlin_course_2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    toastExample()
                }
            }
        }
    }
}
 @Composable
fun toastExample(){
    Column(
        modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row {
            val contex = LocalContext.current
            Button(onClick = { /*TODO*/
            Toast.makeText(contex, "This it a Toast!", Toast.LENGTH_LONG).show()
            }) {
            Text(text = "Pop Up a Toast!")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun toastExamplePreview(){
    toastExample()
}