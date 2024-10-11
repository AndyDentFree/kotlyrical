package test.aussie.previewablepic

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import previewablepic.composeapp.generated.resources.Res
import previewablepic.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        val greeting = remember { Greeting().greet() }
        var clickMsg by remember { mutableStateOf("Click to count") }
        var clickCount by remember { mutableStateOf(0) }

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(Res.drawable.compose_multiplatform), null)
            Text("Compose: $greeting")
            // added button so can check if breakpoints working in actions, rather than trying to breakpoint on render tree
            Button(onClick = {
                clickCount += 1
                clickMsg = "Click again, $clickCount so far"
            }) {
                Text(clickMsg)
            }
        }
    }
}