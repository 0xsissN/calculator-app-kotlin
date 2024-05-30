package com.example.calculatorapp.ui.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.calculatorapp.data.CalculatorViewModel
import com.example.calculatorapp.domain.CalculatorAction
import com.example.calculatorapp.ui.theme.LightGray
import com.example.calculatorapp.ui.theme.MediumGray
import com.example.calculatorapp.ui.theme.Orange

@Composable
fun Advanced() {
    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state
    val buttonSpacing = 8.dp
    viewModel.onAction(CalculatorAction.Option(""))

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                color = Color.White,
                maxLines = 2
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "cos",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("cos"))
                    }
                )
                EditButton(
                    symbol = "sin",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("sin"))
                    }
                )
                EditButton(
                    symbol = "tan",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("tan"))
                    }
                )
                EditButton(
                    symbol = "cosh",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("cosh"))
                    }
                )
                EditButton(
                    symbol = "sinh",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("sinh"))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Clear)
                    }
                )
                EditButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Delete)
                    }
                )
                EditButton(
                    symbol = "|",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("|"))
                    }
                )
                EditButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("/"))
                    }
                )
                EditButton(
                    symbol = "tanh",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("tanh"))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("7"))
                    }
                )
                EditButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("8"))
                    }
                )
                EditButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("9"))
                    }
                )
                EditButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("*"))
                    }
                )
                EditButton(
                    symbol = "!",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("!"))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("4"))
                    }
                )
                EditButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("5"))
                    }
                )
                EditButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("6"))
                    }
                )
                EditButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("-"))
                    }
                )
                EditButton(
                    symbol = "√",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("√"))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("1"))
                    }
                )
                EditButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("2"))
                    }
                )
                EditButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("3"))
                    }
                )
                EditButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("+"))
                    }
                )
                EditButton(
                    symbol = "^",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("^"))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("0"))
                    }
                )
                EditButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("."))
                    }
                )
                EditButton(
                    symbol = "ln",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("ln"))
                    }
                )
                EditButton(
                    symbol = "log10",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("log10"))
                    }
                )
                EditButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Calculate)
                    }
                )
            }
        }
    }
}