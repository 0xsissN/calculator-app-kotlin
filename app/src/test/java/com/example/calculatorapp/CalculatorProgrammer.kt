package com.example.calculatorapp

import com.example.calculatorapp.data.programmerCalculator
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorProgrammer {
    @Test
    fun test1() {
        val input = "1101101011"
        val option = "Bin"
        val expectedOutput = "Hex 36B\n\nOct 1553\n\nDec 875.0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test2() {
        val input = "1024"
        val option = "Dec"
        val expectedOutput = "Hex 400\n\nOct 2000\n\nBin 10000000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test3() {
        val input = "1750"
        val option = "Oct"
        val expectedOutput = "Hex 3E8\n\nDec 1000.0\n\nBin 1111101000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test4() {
        val input = "3E8"
        val option = "Hex"
        val expectedOutput = "Oct 1750\n\nDec 1000.0\n\nBin 1111101000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test5() {
        val input = "10110110101"
        val option = "Bin"
        val expectedOutput = "Hex 5B5\n\nOct 2665\n\nDec 1461.0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test6() {
        val input = "2048"
        val option = "Dec"
        val expectedOutput = "Hex 800\n\nOct 4000\n\nBin 100000000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test7() {
        val input = "2750"
        val option = "Oct"
        val expectedOutput = "Hex 5E8\n\nDec 1512.0\n\nBin 10111101000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test8() {
        val input = "7D0"
        val option = "Hex"
        val expectedOutput = "Oct 3720\n\nDec 2000.0\n\nBin 11111010000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test9() {
        val input = "1110101101"
        val option = "Bin"
        val expectedOutput = "Hex 3AD\n\nOct 1655\n\nDec 941.0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test10() {
        val input = "4096"
        val option = "Dec"
        val expectedOutput = "Hex 1000\n\nOct 10000\n\nBin 1000000000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test11() {
        val input = "6750"
        val option = "Oct"
        val expectedOutput = "Hex DE8\n\nDec 3560.0\n\nBin 110111101000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test12() {
        val input = "FA0"
        val option = "Hex"
        val expectedOutput = "Oct 7640\n\nDec 4000.0\n\nBin 111110100000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test13() {
        val input = "1100110101"
        val option = "Bin"
        val expectedOutput = "Hex 335\n\nOct 1465\n\nDec 821.0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test14() {
        val input = "8192"
        val option = "Dec"
        val expectedOutput = "Hex 2000\n\nOct 20000\n\nBin 10000000000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test15() {
        val input = "1F40"
        val option = "Hex"
        val expectedOutput = "Oct 17500\n\nDec 8000.0\n\nBin 1111101000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test16() {
        val input = "16384"
        val option = "Dec"
        val expectedOutput = "Hex 4000\n\nOct 40000\n\nBin 100000000000000"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test17() {
        val input = "A"
        val option = "Bin"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test18() {
        val input = "0101"
        val option = "Bin"
        val expectedOutput = "Hex 5\n\nOct 5\n\nDec 5.0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test19() {
        val input = "3>>1>>1"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test20() {
        val input = "1>>7"
        val option = "Oct"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test21() {
        val input = "9<<2"
        val option = "Bin"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test22() {
        val input = "A∧2"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test23() {
        val input = "1∧2"
        val option = "Ope"
        val expectedOutput = "0"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test24() {
        val input = "1∨3"
        val option = "Ope"
        val expectedOutput = "3"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test25() {
        val input = "F∨F"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test26() {
        val input = "¬23"
        val option = "Ope"
        val expectedOutput = "-24"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test27() {
        val input = "¬¬1"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test28() {
        val input = "3∧∧2"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test29() {
        val input = "9<<2"
        val option = "Ope"
        val expectedOutput = "36"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test30() {
        val input = "8>>3"
        val option = "Ope"
        val expectedOutput = "1"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test31() {
        val input = "10>>>1"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test32() {
        val input = "10<>3"
        val option = "Ope"
        val expectedOutput = "Error"
        val output = programmerCalculator(input, option)
        assertEquals(expectedOutput, output)
    }
}