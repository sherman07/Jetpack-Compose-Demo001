package com.example.jetpackcomposedemo001.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposedemo001.R

@Composable
fun HomeScreen(navController: NavController) {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = stringResource(R.string.home_screen_text))

                Spacer(modifier = Modifier.height(120.dp))

                Image(painter = painterResource(id = R.drawable.baseline_1k_plus_24) ,
                    contentDescription = stringResource(R.string.one_image),
                    modifier = Modifier
                        .size(100.dp)
                        .clickable
                        { navController.navigate(route = RouteType.SECOND_SCREEN.value) })

                Text(text = stringResource(R.string.icon_text))

                Spacer(modifier = Modifier.height(120.dp))

                Button(
                    onClick = {navController.navigate(RouteType.SECOND_SCREEN.value)},
                    modifier = Modifier.background(color = Color.Blue),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
                ) {
                    Text(text = stringResource(R.string.click_me_text))
                }
            }
        }

    }



@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(rememberNavController())
}