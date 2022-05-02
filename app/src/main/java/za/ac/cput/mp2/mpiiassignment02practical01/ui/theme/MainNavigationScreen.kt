package za.ac.cput.mp2.mpiiassignment02practical01.ui.theme

sealed class MainNavigationScreen(val route:String)
{
    object Home: MainNavigationScreen(route="welcome_screen")
    object Journey: MainNavigationScreen(route= "journey_screen")
}

