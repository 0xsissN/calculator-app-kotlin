package com.shadow.calculatorapp

import com.shadow.calculatorapp.data.advancedCalculator
import junit.framework.TestCase
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorBasic {
    @Test
    fun test1() {
        val input = "1*3-4"
        val expectedOutput = "-1.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test2() {
        val input = "5*0.33"
        val expectedOutput = "1.6500000000000001"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test3() {
        val input = "90/3/2"
        val expectedOutput = "15.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test4() {
        val input = "3*-45"
        val expectedOutput = "-135.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test5() {
        val input = "0.1323+0.123"
        val expectedOutput = "0.25529999999999997"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test6() {
        val input = "/890"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test7() {
        val input = "1/100000000"
        val expectedOutput = "1.0E-8"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test8() {
        val input = "1*2*3*0"
        val expectedOutput = "0.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test9() {
        val input = "1*2**"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test10() {
        val input = "1++"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test11() {
        val input = "--1"
        val expectedOutput = "1.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test12() {
        val input = "--1+100"
        val expectedOutput = "101.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test13() {
        val input = "2++4"
        val expectedOutput = "6.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test14() {
        val input = "2+-4"
        val expectedOutput = "-2.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test15() {
        val input = "234*4234/234-2345+2351235"
        val expectedOutput = "2353124.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test16() {
        val input = "9/3*3"
        val expectedOutput = "9.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test17() {
        val input = "*123/123"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test18() {
        val input = "6+2*5-3/2"
        val expectedOutput = "14.5"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test19() {
        val input = "-3+7*-2"
        val expectedOutput = "-17.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test20() {
        val input = "1000*2+3000/3-500"
        val expectedOutput = "2500.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test21() {
        val input = "+23-+2"
        val expectedOutput = "21.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test22() {
        val input = "-100000*1/10000"
        val expectedOutput = "-10.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test23() {
        val input = "1*3/1*2/3*5/19"
        val expectedOutput = "1.9"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test24() {
        val input = "1+-3*300/15"
        val expectedOutput = "-59.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test25() {
        val input = "123*-123/-123"
        val expectedOutput = "123.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test26() {
        val input = "123456789+987654321*123456789"
        val expectedOutput = "1.21932631236092048E17"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test27() {
        val input = "200000000*4/100000+345"
        val expectedOutput = "8345.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test28() {
        val input = "23+4-23+4-421-41+234-234-23+4-324+23-4+234-2+34-3+42+3-4+2"
        val expectedOutput = "-472.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test29() {
        val input = "100*100*100*100*2"
        val expectedOutput = "2.0E8"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test30() {
        val input = "0*300"
        val expectedOutput = "0.0"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test31() {
        val input = "168*168*56*13*89/100000"
        val expectedOutput = "18286.89408"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }

    @Test
    fun test32() {
        val input = "23890472834798023748-2318947902137480921734"
        val expectedOutput = "-2.295057429302683E21"
        val output = advancedCalculator(input)
        TestCase.assertEquals(expectedOutput, output)
    }
}