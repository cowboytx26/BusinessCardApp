package com.example.businesscardapp

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

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
        val image = painterResource(R.drawable.android_logo)
        val imagePhoneNumber = painterResource(R.drawable.phone_24dp_1f1f1f)
        val imageSocial = painterResource(R.drawable.share_24dp_1f1f1f)
        val imageEmail = painterResource(R.drawable.email_24dp_1f1f1f)
        Column ()
        {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.LightGray)
                    .align(Alignment.CenterHorizontally)
            ) {
                Column ( modifier = modifier
                    .align(Alignment.BottomCenter)) {
                    Image(
                        painter = image,
                        contentDescription = "Android Logo",
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = name,
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                    Text(
                        text = title,
                        fontSize = 10.sp,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color.LightGray)
                    .align(Alignment.CenterHorizontally)
            ) {
                Column (modifier = modifier
                    .align(Alignment.BottomCenter)
                    ) {
                    Row (
                        horizontalArrangement = Arrangement.Start,
                        modifier = modifier
                    ) {
                        Image (
                            painter = imagePhoneNumber,
                            contentDescription = "Phone Image",
                            modifier = Modifier
                                .size(5.dp)
                                .align(Alignment.CenterVertically)
                        )
                        Text (
                            text = phoneNumber,
                            textAlign = TextAlign.Center,
                            fontSize = 4.sp,
                        )
                    }
                    Row (
                        horizontalArrangement = Arrangement.Start,
                        modifier = modifier
                    ) {
                        Image (
                            painter = imageSocial,
                            contentDescription = "Social Image",
                            modifier = Modifier
                                .size(5.dp)
                                .align(Alignment.CenterVertically)
                        )
                        Text (
                            text = socialID,
                            textAlign = TextAlign.Center,
                            fontSize = 4.sp,
                        )
                    }
                    Row (
                        horizontalArrangement = Arrangement.Start,
                        modifier = modifier
                    ) {
                        Image (
                            painter = imageEmail,
                            contentDescription = "Email Icon Image",
                            modifier = Modifier
                                .size(5.dp)
                                .align(Alignment.CenterVertically)
                        )
                        Text (
                            text = emailID,
                            textAlign = TextAlign.Center,
                            fontSize = 4.sp
                        )
                    }
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