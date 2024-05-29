package com.example.calculatorapp.domain

sealed class CalculatorAction {
    data class Number(val number: String) : CalculatorAction()
    data class Option(val option: String) : CalculatorAction()
    object Clear : CalculatorAction()
    object Delete : CalculatorAction()
    object Calculate : CalculatorAction()
}