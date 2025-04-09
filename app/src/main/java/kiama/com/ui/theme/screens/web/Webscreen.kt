package kiama.com.ui.theme.screens.web

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kiama.com.ui.theme.screens.intent.Intent_screen


@Composable
fun Web_screen(navController: NavController) {

}

@Preview
@Composable
private fun web(){
    Intent_screen(rememberNavController())
}