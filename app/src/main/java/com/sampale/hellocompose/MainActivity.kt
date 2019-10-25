package com.sampale.hellocompose

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.ui.core.Text
import androidx.ui.core.setContent
import androidx.ui.core.sp
import androidx.ui.graphics.Color
import androidx.ui.layout.Center
import androidx.ui.material.MaterialTheme
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Hello("World")
            }
        }
    }
}

@Composable
fun Hello(name: String) {
   Center {
       Text("Hello $name!", style = TextStyle(color = Color.Black, fontSize = 18.sp))
   }
}

@Preview
@Composable
fun DefaultPreview() {
    MaterialTheme {
        Hello("World")
    }
}
