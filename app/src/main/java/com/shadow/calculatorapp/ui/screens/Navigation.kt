package com.shadow.calculatorapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shadow.calculatorapp.domain.Screens
import com.shadow.calculatorapp.ui.screens.calculator.Advanced
import com.shadow.calculatorapp.ui.screens.calculator.Basic
import com.shadow.calculatorapp.ui.screens.calculator.Programmer
import com.shadow.calculatorapp.ui.theme.Orange

@Composable
fun CalculatorNavigation() {
    val navigationController = rememberNavController()
    var selected = remember {
        mutableStateOf("Basic")
    }

    Scaffold(
        topBar = {
            BottomAppBar(
                containerColor = Color.DarkGray
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    IconButton(
                        onClick = {
                            selected.value = "Basic"
                            navigationController.navigate(Screens.CalculatorBasic.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier
                            .weight(1f)
                    ) {
                        Text(
                            text = "Basic",
                            color = if (selected.value == "Basic") Orange else Color.White,
                            fontSize = 18.sp
                        )
                    }
                    IconButton(
                        onClick = {
                            selected.value = "Advanced"
                            navigationController.navigate(Screens.CalculatorAdvanced.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Advanced",
                            color = if (selected.value == "Advanced") Orange else Color.White,
                            fontSize = 18.sp
                        )
                    }

                    IconButton(
                        onClick = {
                            selected.value = "Programmer"
                            navigationController.navigate(Screens.CalculatorProgrammer.screen) {
                                popUpTo(0)
                            }
                        },
                        modifier = Modifier.weight(1f)
                    ) {
                        Text(
                            text = "Programmer",
                            color = if (selected.value == "Programmer") Orange else Color.White,
                            fontSize = 18.sp
                        )
                    }
                }
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.CalculatorBasic.screen,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(Screens.CalculatorBasic.screen) { Basic() }
            composable(Screens.CalculatorAdvanced.screen) { Advanced() }
            composable(Screens.CalculatorProgrammer.screen) { Programmer() }
        }
    }
}
