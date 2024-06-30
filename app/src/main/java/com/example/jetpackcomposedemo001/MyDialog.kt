package com.example.jetpackcomposedemo001

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun MyDialog (){
    val isShowDialog = remember { mutableStateOf(true) }
    androidx.compose.material3.AlertDialog(
        onDismissRequest = {  },
        confirmButton = {
            TextButton(onClick = { }) {
                Text(text = "Comfirm")
            }
        },
        dismissButton = {
            TextButton(onClick = { }) {
                Text(text = "Dismiss")
            }
        },
        title = { Text(text = "My Lotto") },
        text = { Text(text = "You won $10000000000")}
    )
    Button(onClick = { isShowDialog.value = true}) {
        Text(text = "Show dialog")

    }



}