package com.shadow.calculatorapp.domain

sealed class Screens(val screen: String) {
    data object CalculatorBasic : Screens("calculator-basic")
    data object CalculatorAdvanced : Screens("calculator-advanced")
    data object CalculatorProgrammer : Screens("calculator-programmer")
}