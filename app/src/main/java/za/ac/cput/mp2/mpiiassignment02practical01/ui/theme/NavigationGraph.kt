package za.ac.cput.mp2.mpiiassignment02practical01.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import za.ac.cput.mp2.mpiiassignment02practical01.AlertDialog
import za.ac.cput.mp2.mpiiassignment02practical01.GetScaffold
import za.ac.cput.mp2.mpiiassignment02practical01.MainContent
import za.ac.cput.mp2.mpiiassignment02practical01.StartJourneyButton

@Composable
fun SetupNavigationGraph(
    navController:NavHostController
){
    NavHost(navController = navController,
    startDestination = MainNavigationScreen.Home.route){
        composable(MainNavigationScreen.Home.route){

            MainContent()
            GetScaffold()
            AlertDialog()
            StartJourneyButton(navController = navController)
        }
        composable(MainNavigationScreen.Journey.route){
            za.ac.cput.mp2.mpiiassignment02practical01.ui.theme.GetScaffold2()
            FullNameText()
            StudentNumberText()
            CourseText()
            DepartmentText()
            CourseButton()
            BackButton(navController = navController)
        }

    }
}