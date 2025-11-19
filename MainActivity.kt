package com.example.eventregistrationapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eventregistrationapp.ui.theme.EventRegistrationAppTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EventRegistrationAppTheme {
                    eventRegistration()
                }
            }
        }
    }

@Composable
fun eventRegistration() {

    var category by remember { mutableStateOf("") }
    var date by remember { mutableStateOf("") }

    Text(
        text = "Event Registration App",
        fontSize = 35.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(5.dp).background(Color.Gray).fillMaxWidth().padding(5.dp)
    )

    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Tech Fest",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 10.dp)
        )

        Text(
            text = "Name: Balaji Nayak",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 4.dp)
        )

        Text(
            text = "Registration Number: 12306375",
            fontSize = 18.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Category:",
                fontSize = 18.sp
            )

            OutlinedTextField(
                value = category,
                onValueChange = { category = it },
                label = { Text("Enter Category") }
            )
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Date:",
                fontSize = 18.sp,
            )

            OutlinedTextField(
                value = date,
                onValueChange = { date = it },
                label = { Text("DD/MM/YYYY") },
                modifier = Modifier.fillMaxWidth()
            )
        }


        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Text(
                text = "Register Now",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun EvenApplicationPreview() {
    EventRegistrationAppTheme {
        eventRegistration()
    }
}