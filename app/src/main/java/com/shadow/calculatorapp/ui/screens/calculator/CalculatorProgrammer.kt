package com.shadow.calculatorapp.ui.screens.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.shadow.calculatorapp.ui.screens.CalculatorViewModel
import com.shadow.calculatorapp.domain.CalculatorAction
import com.shadow.calculatorapp.ui.theme.LightGray
import com.shadow.calculatorapp.ui.theme.MediumGray
import com.shadow.calculatorapp.ui.theme.Orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Programmer() {
    val viewModel = viewModel<CalculatorViewModel>()
    val state = viewModel.state
    val buttonSpacing = 8.dp

    var isExpanded by remember {
        mutableStateOf(false)
    }

    var selectedConversion by remember {
        mutableStateOf("Decimal")
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGray)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            ExposedDropdownMenuBox(
                expanded = isExpanded,
                onExpandedChange = { isExpanded = it },
                modifier = Modifier
                    .width(200.dp)
            ) {
                TextField(
                    value = selectedConversion,
                    onValueChange = {},
                    readOnly = true,
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = isExpanded)
                    },
                    modifier = Modifier
                        .menuAnchor(),
                    shape = RoundedCornerShape(14.dp)
                )

                ExposedDropdownMenu(
                    expanded = isExpanded,
                    onDismissRequest = { isExpanded = false }
                ) {
                    DropdownMenuItem(
                        text = { Text(text = "Hexadecimal", color = Color.Black) },
                        onClick = {
                            selectedConversion = "Hexadecimal"
                            viewModel.onAction(CalculatorAction.Option("Hex"))
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Octal", color = Color.Black) },
                        onClick = {
                            selectedConversion = "Octal"
                            viewModel.onAction(CalculatorAction.Option("Oct"))
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Decimal", color = Color.Black) },
                        onClick = {
                            selectedConversion = "Decimal"
                            viewModel.onAction(CalculatorAction.Option("Dec"))
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Binary", color = Color.Black) },
                        onClick = {
                            selectedConversion = "Binary"
                            viewModel.onAction(CalculatorAction.Option("Bin"))
                            isExpanded = false
                        }
                    )
                    DropdownMenuItem(
                        text = { Text(text = "Operation", color = Color.Black) },
                        onClick = {
                            selectedConversion = "Operation"
                            viewModel.onAction(CalculatorAction.Option("Ope"))
                            isExpanded = false
                        }
                    )
                }
            }

            Text(
                text = state.number,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth(),
                fontSize = 40.sp,
                fontWeight = FontWeight.Light,
                color = Color.White
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),
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
                    symbol = ">>",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number(">>"))
                    }
                )
                EditButton(
                    symbol = "<<",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("<<"))
                    }
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                EditButton(
                    symbol = "C",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("C"))
                    }
                )
                EditButton(
                    symbol = "D",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("D"))
                    }
                )
                EditButton(
                    symbol = "E",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("E"))
                    }
                )
                EditButton(
                    symbol = "F",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("F"))
                    }
                )
                EditButton(
                    symbol = "AND",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("∧"))
                    }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
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
                    symbol = "A",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("A"))
                    }
                )
                EditButton(
                    symbol = "B",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("B"))
                    }
                )
                EditButton(
                    symbol = "OR",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("∨"))
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
                    symbol = "NOT",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        viewModel.onAction(CalculatorAction.Number("¬"))
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