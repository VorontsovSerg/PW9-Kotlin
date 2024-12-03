package com.example.pw9

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pw9.themes.MyAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting(name = "Воронцов Сергей", group = "Группа ИКБО-26-22")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, group: String) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = name,
            style = MaterialTheme.typography.h5.copy(
                color = MaterialTheme.colors.onBackground
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = group,
            style = MaterialTheme.typography.h5.copy(
                color = MaterialTheme.colors.onSurface
            )
        )
    }
}
