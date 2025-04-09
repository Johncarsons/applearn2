package kiama.com.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kiama.com.ui.theme.screens.calc.Calculator_screen
import kiama.com.ui.theme.screens.home.HomeScreen
import kiama.com.ui.theme.screens.intent.Intent_screen
import kiama.com.ui.theme.screens.web.Web_screen

@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String = ROUTE_HOME) {
    NavHost(
        navController = navController ,
        modifier = modifier,
        startDestination = startDestination){
        composable (ROUTE_HOME){
            HomeScreen(navController)}
        composable (ROUTE_CALC){
            Calculator_screen(navController)
        }
        composable (ROUTE_INTENT){
            Intent_screen(navController)
        }
        composable (ROUTE_WEB){
            Web_screen(navController)
        }

    }


}
