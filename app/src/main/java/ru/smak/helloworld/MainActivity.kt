package ru.smak.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import ru.smak.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            HelloWorldTheme {
                Form()
            }
        }
    }
}

@Composable
fun Form(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(value = "", onValueChange = {})
        Button(onClick = {}) {
            Text(text = "Нажми меня")
        }
        Text(text = "Пользователь ввел...")
    }
}

@Composable
@Preview
fun FormPreview(){
    HelloWorldTheme {
        Form()
    }
}