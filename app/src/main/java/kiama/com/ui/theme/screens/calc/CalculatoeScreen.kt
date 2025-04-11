package kiama.com.ui.theme.screens.calc

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import java.nio.file.WatchEvent

@Composable
fun Calculator_screen(navController:NavHostController) {
    var firstnum by remember { mutableStateOf(TextFieldValue()) }
    var secnum by remember { mutableStateOf(TextFieldValue()) }
    var answer by remember { mutableStateOf("") }
    Column (verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Cyan)){

        Text("CALCULATOR",
            color = Color.Red,
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))

        Text("Answer: $answer",
            color = Color.Red,
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = firstnum,
            shape = RoundedCornerShape(20.dp),
            onValueChange = {firstnum=it},
            label = {Text(text ="Enter First no..",
                fontSize = 30.sp,)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = secnum,
            onValueChange = {secnum=it},
            shape = RoundedCornerShape(20.dp),
            label = {Text(text ="Enter First no..",
                fontSize = 30.sp)},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row ( modifier = Modifier
            .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            OutlinedButton(onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecnum=secnum.text.trim()
                if (myfirstnum.isEmpty()|| mysecnum.isEmpty()){
                    answer="Please fill in all sections"
                }else{
                    val myanswer=myfirstnum.toDouble()+mysecnum.toDouble()
                    answer=myanswer.toString()
                }
            },
//                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("+",
                    fontSize = 30.sp,
                    color = Color.Red,)
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecnum=secnum.text.trim()
                if (myfirstnum.isEmpty()|| mysecnum.isEmpty()){
                    answer="Please fill in all sections"
                }else{
                    val myanswer=myfirstnum.toDouble()-mysecnum.toDouble()
                    answer=myanswer.toString()
                }
            },
//                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("-",
                    fontSize = 30.sp,
                    color = Color.Red)
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecnum=secnum.text.trim()
                if (myfirstnum.isEmpty()|| mysecnum.isEmpty()){
                    answer="Please fill in all sections"
                }else{
                    val myanswer=myfirstnum.toDouble()/mysecnum.toDouble()
                    answer=myanswer.toString()
                }
            },
//                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("/",
                    fontSize = 30.sp,
                    color = Color.Red)
            }
            Spacer(modifier = Modifier.width(20.dp))
            OutlinedButton(onClick = {
                val myfirstnum=firstnum.text.trim()
                val mysecnum=secnum.text.trim()
                if (myfirstnum.isEmpty()|| mysecnum.isEmpty()){
                    answer="Please fill in all sections"
                }else{
                    val myanswer=myfirstnum.toDouble()+mysecnum.toDouble()
                    answer=myanswer.toString()
                }
            },
//                modifier = Modifier.width(50.dp),
                colors = ButtonDefaults.buttonColors(Color.Black),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("*",
                    fontSize = 30.sp,
                    color = Color.Red)
            }

        }

//        OutlinedButton(onClick = {/*TODO*/},
//            modifier = Modifier.width(50.dp),
//            colors = ButtonDefaults.buttonColors(Color.Green),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text("+",
//                fontSize = 30.sp,
//                color = Color.Red)
//        }
//        OutlinedButton(onClick = {/*TODO*/},
//            modifier = Modifier.width(50.dp),
//            colors = ButtonDefaults.buttonColors(Color.Green),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text("-",
//                fontSize = 30.sp,
//                color = Color.Red)
//        }
//        OutlinedButton(onClick = {/*TODO*/},
//            modifier = Modifier.width(50.dp),
//            colors = ButtonDefaults.buttonColors(Color.Green),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text("/",
//                fontSize = 30.sp,
//                color = Color.Red)
//        }
//        OutlinedButton(onClick = {/*TODO*/},
//            modifier = Modifier.width(50.dp),
//            colors = ButtonDefaults.buttonColors(Color.Green),
//            shape = RoundedCornerShape(20.dp)
//        ) {
//            Text("*",
//                fontSize = 15.sp,
//                color = Color.Red)
//        }
    }
    
}

@Preview
@Composable
private fun calctest()
{
    Calculator_screen(rememberNavController())
}