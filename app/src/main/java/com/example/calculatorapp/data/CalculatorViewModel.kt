package com.example.calculatorapp.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.calculatorapp.domain.CalculatorAction
import com.example.calculatorapp.domain.CalculatorState
import programmerCalculator

class CalculatorViewModel : ViewModel() {
    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorAction) {
        when (action) {
            is CalculatorAction.Number -> enterNumber(action.number)
            is CalculatorAction.Option -> enterOption(action.option)
            is CalculatorAction.Clear -> state = CalculatorState()
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()
        }
    }

    private fun performDeletion() {
        when {
            state.number.isNotBlank() -> state = state.copy(
                number = state.number.dropLast(1)
            )
        }
    }

    private fun performCalculation() {
        val number = state.number
        val option = state.option
        var result: String = ""
        if (option == "")
            result = algorithmAdvanced(number)
        else
            result = algorithmProgrammer(number, option)

        state = state.copy(
            number = result
        )
    }

    private fun enterNumber(addNumber: String) {
        state = state.copy(
            number = state.number + addNumber
        )
    }

    private fun enterOption(addOption: String) {
        state = state.copy(
            option = addOption
        )
    }
}

private fun algorithmAdvanced(number: String): String {
    return advancedCalculator(number)
}

private fun algorithmProgrammer(number: String, option: String): String {
    return programmerCalculator(number, option)
}
