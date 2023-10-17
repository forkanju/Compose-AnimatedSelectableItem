package com.example.compose_animatedselectableitem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.compose_animatedselectableitem.ui.theme.ComposeAnimatedSelectableItemTheme

@ExperimentalFoundationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeAnimatedSelectableItemTheme {
                var selected by remember { mutableStateOf(false) }
                var selected2 by remember { mutableStateOf(false) }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(80.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    SelectableItem(
                        selected = selected,
                        title = "Md Forkan",
                        onClick = {
                            selected = !selected
                        }
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    SelectableItem(
                        selected = selected2,
                        title = "Md Forkan",
                        subtitle = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.standard dummy text ever since the 1500s",

                        onClick = {
                            selected2 = !selected2
                        })
                }
            }
        }
    }
}

