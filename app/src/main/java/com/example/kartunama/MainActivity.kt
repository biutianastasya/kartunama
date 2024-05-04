package com.example.kartunama

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kartunama.ui.theme.KartuNamaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KartuNamaTheme {
                // A surface container using the 'background' color from the theme
                Column {
                    HomePagePreview()
                    }
                }
            }
        }
    }


@Composable
fun CardName(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "CardImg")
        Text(
            text = "Biuti Anastasya",
            style = TextStyle(
                fontSize = 30.sp
            )
        )
        Text(
            text = "Software Engineer",
            color = Color(0xFF000631a))
    }
}

@Composable
fun CardInfo() {
    Column {

        Row {
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "+62 813-8797-9321")
        }
        Row {
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Default.Share, contentDescription = "Share")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "@Biutianastasya")
        }
        Row {
            Spacer(modifier = Modifier.width(20.dp))
            Icon(imageVector = Icons.Default.Email, contentDescription = "Mail")
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "biutianastasya@gmail.com")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF89d99e))

    ) {
        CardName()
        Spacer(modifier = Modifier.height(20.dp))
        CardInfo()
    }
}