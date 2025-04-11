package kiama.com.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_screen(navController: NavController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)
    ){
        Text("Intent Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Call",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Sms",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Share",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Dail",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Camera",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Email",
                fontSize = 30.sp,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedButton(onClick = {/*TODO*/},
                modifier = Modifier.width(200.dp),
            colors = ButtonDefaults.buttonColors(Color.Black),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text("Stk",
                fontSize = 30.sp,
                color = Color.Red)
        }

    }
}

@Preview
@Composable
private fun Intent_Screen(){
    Intent_screen(rememberNavController())
}