package com.geeksforgeeks.circularbutton

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent(){
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "GFG | Circular Button",
                color = Color.White)},
            backgroundColor = Color(0xff0f9d58)
        ) },
        content = { MyContent()}
    )
}

@Composable
fun MyContent(){
    val mContext = LocalContext.current
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {

        OutlinedButton(onClick = { Toast.makeText(mContext, "This is a Circular Button with a + Icon", Toast.LENGTH_LONG).show()},
            modifier= Modifier.size(100.dp),
            shape = CircleShape,
            border= BorderStroke(5.dp, Color(0XFF0F9D58)),
            contentPadding = PaddingValues(0.dp),
            colors = ButtonDefaults.outlinedButtonColors(contentColor =  Color.Blue)
        ) {
            Icon(Icons.Default.Add ,contentDescription = "content description", tint=Color(0XFF0F9D58))
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}