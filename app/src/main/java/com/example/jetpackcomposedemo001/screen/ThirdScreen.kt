package com.example.jetpackcomposedemo001.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposedemo001.R

@Composable
fun ThirdScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Column {
            Text(text = stringResource(R.string.third_screen_text))
            Spacer(modifier = Modifier.height(10.dp))
            Button(onClick = {navController.navigateUp()}) {
                Text(text = stringResource(R.string.go_back_text))
            }
            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {navController.navigate(RouteType.HOME_SCREEN.value)}) {
                Text(text = stringResource(R.string.go_Home_text))

            }
        }

    }


}

@Preview
@Composable
fun ThirdScreenPreview() {
    HomeScreen(rememberNavController())
}