package za.ac.cput.mp2.mpiiassignment02practical01.ui.theme

import android.app.Activity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlin.system.exitProcess
@Composable
fun VerticalScroll(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Transparent),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

        }
    }
    LazyColumn{
        item{ Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .width(50.dp)

                .padding(10.dp, 0.dp, 305.dp, 8.dp),
            elevation = 5.dp
        )
        {

            Row(verticalAlignment = Alignment.CenterVertically)
            {

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 0.dp),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            )
            {
                Button(
                    //Using popBackstack to go back to the Welcome Screen that called the JourneyScreen
                    onClick = {navController.popBackStack()},
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
        }}

        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
               // .background(Color.Black)-> has to be put under height->to change background color
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp
            , backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(180.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "MODULES", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 140.dp)
                    )
                }
            }}


        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp,
                        backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(180.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "ADP372S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))

                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(
                        text = "Module Name: Applications Development Practice",
                        style = TextStyle(Color.Black)
                    )
                    Text(text = "Module Type: Practical", style = TextStyle(Color.Black))
                    Text(text = "Module Duration: Year-Round", style = TextStyle(Color.Black))
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))

                }
            }}

        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp,
                        backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)

                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "ADT372S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))

                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Applications Development Theory", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory and Practical", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black)) }
            }}

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "ITS362S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Information Systems 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black))
                }
            }
        }
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "PFP362S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Professional Practice 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black))
                }
            }
        }
        item{
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(10.dp, 0.dp, 10.dp, 5.dp)

                ,
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)

            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "ICE362S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))

                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: ICT Electives 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory and Practical", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Semester", style = TextStyle(Color.Black))
                }}}
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp)
                ,
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "PRP372S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project Presentation 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black))
                }
            }


        }

        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "PRT362S", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 150.dp))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Practical", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black))
                }
            }
        }
        item {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
                    .padding(10.dp, 0.dp, 10.dp, 5.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {

                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .padding(16.dp)

                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .height(160.dp)
                        .background(Color(0xFFDDE2FF))
                        .wrapContentSize(Alignment.Center)
                ) {
                    Text(text = "PRM372S ", style = TextStyle(Color.Black), modifier = Modifier.padding(horizontal = 140.dp))
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Text(text= "Module Name: Project Management 3", style = TextStyle(Color.Black))
                    Text(text= "Module Type: Theory", style = TextStyle(Color.Black))
                    Text(text= "Module Duration: Year-Round", style = TextStyle(Color.Black))
                }
            }
        }

        item {

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .width(200.dp)

                    .padding(150.dp, 0.dp, 145.dp, 35.dp),
                elevation = 5.dp,
                backgroundColor = Color(0xFAA094FF)
            )
            {
val activity=(LocalContext.current as? Activity)
                val openDialog= remember {
                    mutableStateOf(false)
                }
                Row(verticalAlignment = Alignment.CenterVertically)
                {

                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()

                        .padding(vertical = 0.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                )
                {
                    Button(
                        //Using popBackstack to go back to the Welcome Screen that called the JourneyScreen
                        onClick = {openDialog.value=true},

                        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)

                    )
                    {
                        Icon(
                            imageVector = Icons.Filled.ExitToApp,
                            contentDescription = "",
                            tint = Color.White
                        )
                        // Creating a space between the icon and the text of the button
                        Spacer(Modifier.size(ButtonDefaults.IconSpacing))
                        // Text of the button
                        Text(text = "GoodBye?", style = TextStyle(Color.White)
                        )
                    }
                }
                if(openDialog.value)
                {
                    AlertDialog(
                        onDismissRequest = {openDialog.value=false},
                    title = {Text(text = "Alert Dialog", fontWeight =FontWeight.Bold, fontSize = 16.sp)},
                        text={Text(text="Leaving Now?", fontSize = 18.sp)},
                        confirmButton = { TextButton(onClick = {openDialog.value=false}) {
                            Text(text="Close",style= TextStyle(Color.White))

                        }},
                        dismissButton = { TextButton(onClick = {activity?.finish()}) {
                            Text("Yes", style = TextStyle(Color.White))

                        }},
                        backgroundColor = Color.Black,
                        contentColor = Color.White
                        ) }}


                }
            }
        }

