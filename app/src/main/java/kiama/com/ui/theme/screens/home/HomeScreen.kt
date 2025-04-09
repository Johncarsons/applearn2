package kiama.com.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kiama.com.navigation.ROUTE_CALC

@Composable
fun HomeScreen(navController:NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)){
        Text("Home Screen",
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Normal,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { navController.navigate(ROUTE_CALC)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)) {
            Text("Calculator",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)) {
            Text("Intent",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {/*TODO*/},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)) {
            Text("Web",
                fontSize = 50.sp,
                fontFamily = FontFamily.Cursive,
                color = Color.Red)
        }
    }

}
@Preview

@Composable
private fun Homeprev(){
    HomeScreen(rememberNavController())


}
