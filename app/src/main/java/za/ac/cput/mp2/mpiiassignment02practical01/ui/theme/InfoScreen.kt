package za.ac.cput.mp2.mpiiassignment02practical01.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import za.ac.cput.mp2.mpiiassignment02practical01.MainContent

@Composable
fun GetScaffold2(){
    /*this piece of code is responsible for the Top Bar as well as displaying the MainContents Text*/
    Scaffold(
        topBar = {
            TopAppBar(
            title = {Text(
                "MPIIAssignment03Practical02",
                color = Color.White)},
            backgroundColor = Color(0xFF000000)) },
        content = { },
        backgroundColor = Color(0xFAA094FF)
    )
}
@Composable
fun FullNameText() {

    Text(

        text = "FullName: Warren Jaftha",

//this piece of code below displays the color of the text that will be displayed
        style = TextStyle(Color.Black) ,

        modifier = Modifier

            .padding(16.dp)
            .padding(vertical = 50.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color(0xFFDDE2FF))
            .wrapContentSize(Alignment.Center)
/*this modifier code is responsible for defining the
background on which the text is displayed on
the background
    */

    )


}

@Composable
fun CourseText() {
    Text(

        text = "Course:Application Development",


        style = TextStyle(Color.Black),
        modifier = Modifier

            .padding(vertical = 170.dp)
            .padding(horizontal = 15.dp)
            .width(380.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color(0xFFDDE2FF))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun DepartmentText() {
    Text(
        text = "Department: Information and Communications Technology",

        style = TextStyle(Color.Black),
        modifier = Modifier

            .padding(vertical = 274.dp)
            .padding(horizontal = 14.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color(0xFFDDE2FF))
            .wrapContentSize(Alignment.Center)
    )
}
@Composable
fun StudentNumberText() {
    Text(
        text = "Student Number: 219005303",

        style = TextStyle(Color.Black),
        modifier = Modifier

            .padding(horizontal = 14.dp)
            .padding(vertical = 100.dp)
            .padding(top = 278.dp)
            .width(381.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .height(100.dp)
            .background(Color(0xFFDDE2FF))
            .wrapContentSize(Alignment.Center),






        )

}
@Composable
fun CourseButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp),

//determines the position of the "Course Modules"//
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    )
    {
        Button(
            onClick = {navController.navigate(route=MainNavigationScreen.Module.route)},
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.Notifications ,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Course Modules", style = TextStyle(Color.White))
        }
    }
}
@Composable
fun BackButton(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 50.dp)
            .padding(horizontal = 10.dp),


        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    )
    {
        Button(
            onClick = {navController.popBackStack()},//the popBackStack function is to help us get back to the welcome page
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)
        )
        {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = "",
                tint = Color.White
            )
            // Creating a space between the icon and the text of the button
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            // Text of the button
            Text(text = "Back", style = TextStyle(Color.White)
            )
        }
    }
}
