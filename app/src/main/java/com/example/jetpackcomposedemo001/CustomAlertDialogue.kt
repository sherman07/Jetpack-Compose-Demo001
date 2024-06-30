package com.example.jetpackcomposedemo001

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun AlertDialog(title: String, text: String) {

    val isShowDialog = remember { mutableStateOf(true) }

    if (isShowDialog.value) {
        androidx.compose.material3.AlertDialog(
            onDismissRequest = {  isShowDialog.value },
            confirmButton = {
                TextButton(onClick = { isShowDialog.value}) {
                    Text(text = "Confirm")

                }
            },
            title = {
                Text(text = title)
            },
            text = {
                Text(text = text)
            },
            dismissButton = {
                TextButton(onClick = {isShowDialog.value}) {
                    Text(text = "Dismiss")
                }
            }
        )
        Button(onClick = { isShowDialog.value = true }) {
            Text(text = "Show dialog")

        }
    }
}

///Homework:
//
//Create a dialog ,  title is “My lotto”
//
//Message:  “You win $1000000”
//
//Has 2 buttons,    “Confirm” and “Cancel”
//
//Click cancel or confirm, dismiss dialog