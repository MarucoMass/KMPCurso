package tech.mariomass.kmpcurso.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mariomass.kmpcurso.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var isClicked by remember { mutableStateOf(false) }

            MyApplicationTheme {
                /*
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    */
                    Card(
                        modifier = Modifier.clickable {
                            isClicked = !isClicked
                            Log.d("Click", "$isClicked")
                        },
                        shape = RoundedCornerShape(36),
                        elevation = CardDefaults.cardElevation(10.dp),
                        border = BorderStroke(5.dp, Color.LightGray)
                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.Top
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.baseline_person_24),
                                contentDescription = "Profile"
                            )
                            GreetingView(
                                modifier = Modifier
                                    .wrapContentSize()
                                    .background(Color.Blue)
                                    .clickable {
                                        Log.d("Click", "hice click")
                                    }
                                    .padding(16.dp, 8.dp),
                                text = if (!isClicked) "Clicked" else "Click me"
                            )

                        }
                    }
               /* } */
            }
        }
    }
}

@Composable
fun GreetingView(modifier: Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text,
        color = Color.White,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,

        )
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView(
            modifier = Modifier
                .wrapContentSize()
                .background(Color.Blue)
                .clickable {
                    Log.d("Click", "hice click")
                }
                .padding(16.dp, 8.dp),
            text = "hola que tal"
        )
    }
}
