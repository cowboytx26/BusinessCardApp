package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray) {
                    Greeting(
                        name = "Brian W Wiatrek",
                        title = "IT Developer",
                        phoneNumber = "123-456-7890",
                        socialID = "@BrianWiatrek",
                        emailID = "bwiatrek@gmail.com",
                        modifier = Modifier.padding(8 . dp)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, title: String, phoneNumber: String, socialID: String, emailID: String,
             modifier: Modifier = Modifier) {
        Box {
            Box(modifier = Modifier
                .align(Alignment.TopStart)
                .zIndex(1f)
            ) {
                Column(verticalArrangement = Arrangement.Center) {
                    Text(
                        text = name,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center,
                        modifier = modifier
                    )
                    Text(
                        text = title,
                        textAlign = TextAlign.Center,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }
            }
            Box (modifier = Modifier
                .align(Alignment.BottomEnd)
                .zIndex(2f)) {
                Column(verticalArrangement = Arrangement.Bottom) {
                    Text (
                        text = phoneNumber,
                        textAlign = TextAlign.Center,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                    Text (
                        text = socialID,
                        textAlign = TextAlign.Center,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                    Text (
                        text = emailID,
                        textAlign = TextAlign.Center,
                        fontSize = 8.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.CenterHorizontally)
                    )
                }
            }
        }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Greeting("Brian W Wiatrek", title = "IT Developer", phoneNumber = "123-456-7890",
            socialID = "@BrianWiatrek", emailID = "bwiatrek@gmail.com")
    }
}