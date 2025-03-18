package tech.mariomass.kmpcurso.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mariomass.kmpcurso.Greeting

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
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
        }
    }
}

@Composable
fun GreetingView(modifier: Modifier, text: String) {
    Text(
        modifier = modifier,
        text = text,
        color = Color.Red,
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
