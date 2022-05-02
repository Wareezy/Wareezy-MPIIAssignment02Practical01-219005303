package za.ac.cput.mp2.mpiiassignment02practical01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import za.ac.cput.mp2.mpiiassignment02practical01.ui.theme.MPIIAssignment02Practical01Theme
import za.ac.cput.mp2.mpiiassignment02practical01.ui.theme.MainNavigationScreen
import za.ac.cput.mp2.mpiiassignment02practical01.ui.theme.SetupNavigationGraph

class MainActivity : ComponentActivity() {
  private lateinit var navController: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MPIIAssignment02Practical01Theme {
              navController= rememberNavController()
                SetupNavigationGraph(navController = navController)
            }
        }
    }
}

@Composable
fun GetScaffold(){
    /*this piece of code is responsible for the Top Bar as well as displaying the MainContents Text*/
    Scaffold(
        topBar = {TopAppBar(
            title = {Text(
                "MPIIAssignment02Practical01",
                color = Color.White)},
            backgroundColor = Color(0xFF000000)) },
        content = {MainContent()},
        backgroundColor = Color(0xFAA094FF)
    )
}
@Composable
/*This is where the text will be displayed */
fun MainContent(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement= Arrangement.Top,
        horizontalAlignment= Alignment.CenterHorizontally

    ){    Box(
        Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .height(150.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Color(0xFFDDE2FF)),
        contentAlignment = Alignment.Center
    ){
        Text(text="Welcome to my Jetpack Compose Journey", fontSize = 19.sp)
    }

    }
    /*Displays the text within the Gray Box*/


}
@Composable
/*this is where the ALERT DIALOG FUNCTION CONTINUES*/
fun AlertDialog(
)
{

    val openDialog=remember{mutableStateOf(false)}
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement=Arrangement.Center,
        horizontalAlignment=Alignment.CenterHorizontally

    ){
        Button(onClick = { openDialog.value = true },
            modifier=Modifier.size(width = 200.dp,height=60.dp),
            colors= ButtonDefaults.buttonColors(backgroundColor = Color.Black))
        {
            Icon(imageVector = Icons.Filled.Info,
                contentDescription = "",
                tint = Color.White
            )
            /*Space the icon from the button*/
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(text="Info",style= TextStyle(Color.White), fontSize = 25.sp)
        }

    }
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = { openDialog.value = false },
            title = {
                Text(text = "Alert Dialog", fontWeight = FontWeight.Bold, fontSize = 16.sp)

            },
            text = {
                Text(text = "I am really enjoying Electives.I enjoy coding and creating new programs using jetpack compose as it is really simple and fun. Kotlin is a really interesting language and i cant wait to learn more about it in the future", fontSize = 18.sp)
            },
            /*in below line we are displaying*/
            /*our confirm button*/
            confirmButton = {
                TextButton(onClick = {
                    openDialog.value=false
                }){
                    Text(text = "Close", style = TextStyle(Color.White))
                }

            },
            /*below line is use to add background color to our alert dialog*/
            backgroundColor = Color.Black,
            /*below line is use to add content color for our alert dialog*/
            contentColor = Color.White


        )}}
@Composable
fun StartJourneyButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 200.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Button(
            //Coding to select the screen that the page needs to navigate to
            onClick = {navController.navigate(route=MainNavigationScreen.Journey.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.PlayArrow,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Start Journey", style = TextStyle(Color.White)
            )
        }
    }
}