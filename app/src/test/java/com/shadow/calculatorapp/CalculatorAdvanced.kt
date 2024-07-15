package com.shadow.calculatorapp

import com.shadow.calculatorapp.data.advancedCalculator
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class CalculatorAdvanced {
    @Test
    fun test1() {
        val input = "sin-1"
        val expectedOutput = "-0.01745240643728351"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test2() {
        val input = "cos-1"
        val expectedOutput = "0.9998476951563913"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test3() {
        val input = "tan-50"
        val expectedOutput = "-1.19175359259421"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test4() {
        val input = "cosh-5"
        val expectedOutput = "74.20994852478785"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test5() {
        val input = "sinh-5"
        val expectedOutput = "-74.20321057778875"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test6() {
        val input = "tanh-5"
        val expectedOutput = "-0.9999092042625951"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test7() {
        val input = "ln10"
        val expectedOutput = "2.302585092994046"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test8() {
        val input = "ln-5"
        val expectedOutput = "1.6094379124341003"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test9() {
        val input = "-5!"
        val expectedOutput = "-120.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test10() {
        val input = "√-5"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test11() {
        val input = "√5*5"
        val expectedOutput = "11.180339887498949"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test12() {
        val input = "2^-5"
        val expectedOutput = "0.03125"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test13() {
        val input = "|*5|"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test14() {
        val input = "|1-4|"
        val expectedOutput = "3.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test15() {
        val input = "2+4!"
        val expectedOutput = "26.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test16() {
        val input = "√20+5"
        val expectedOutput = "9.47213595499958"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test17() {
        val input = "cos(√25)"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test18() {
        val input = "sin(√36)"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test19() {
        val input = "tan3/4"
        val expectedOutput = "0.0131019448207603"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test20() {
        val input = "cosh6*0"
        val expectedOutput = "0.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test21() {
        val input = "cosh"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test22() {
        val input = "√0.33"
        val expectedOutput = "0.5744562646538028"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test23() {
        val input = "|2*-100|"
        val expectedOutput = "200.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test24() {
        val input = "-sin-1"
        val expectedOutput = "0.01745240643728351"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test25() {
        val input = "-cos-1"
        val expectedOutput = "-0.9998476951563913"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test26() {
        val input = "-tan-50"
        val expectedOutput = "1.19175359259421"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test27() {
        val input = "-sinh-5"
        val expectedOutput = "74.20321057778875"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test28() {
        val input = "-ln-5"
        val expectedOutput = "-1.6094379124341003"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test29() {
        val input = "|1*3*4-5*6|"
        val expectedOutput = "18.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test30() {
        val input = "|cos-50|"
        val expectedOutput = "0.6427876096865394"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test31() {
        val input = "3√125"
        val expectedOutput = "4.999999999999999"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test32() {
        val input = "3*√365+3/cos53"
        val expectedOutput = "62.299839946995846"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test33() {
        val input = "3/0.125"
        val expectedOutput = "24.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test34() {
        val input = "1^365+76/13"
        val expectedOutput = "6.846153846153846"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test35() {
        val input = "2^√125"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test36() {
        val input = "365^2−sinh85^√336"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test37() {
        val input = "3+5*4-cosh2+sin3.14/3"
        val expectedOutput = "19.25606294553418"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test38() {
        val input = "2^3*√16-ln20"
        val expectedOutput = "29.00426772644601"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test39() {
        val input = "4!+tanh3-2^2"
        val expectedOutput = "20.99505475368673"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test40() {
        val input = "log1010"
        val expectedOutput = "1.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test41() {
        val input = "log101000+2^3*sin3.14/4"
        val expectedOutput = "3.1095518197068674"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test42() {
        val input = "2**3"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test43() {
        val input = "+-1"
        val expectedOutput = "-1.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test44() {
        val input = "2//3"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test45() {
        val input = "log103*4"
        val expectedOutput = "1.9084850188786497"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test46() {
        val input = "log1020+5^2*sin1.57/2"
        val expectedOutput = "1.6435079992606756"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test47() {
        val input = "100^100"
        val expectedOutput = "1.0E200"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test48() {
        val input = "1.0E200+5"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test49() {
        val input = "ln√25"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test50() {
        val input = "100!"
        val expectedOutput = "9.33262154439441E157"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test51() {
        val input = "0*0"
        val expectedOutput = "0.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test52() {
        val input = "cos25+sin25*tan25/cosh25*sinh25+tanh25"
        val expectedOutput = "1.90630778703665"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test53() {
        val input = "sinsin"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test54() {
        val input = "tan0.125+23*5^5"
        val expectedOutput = "71875.00218166503"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test55() {
        val input = "901+3/√25"
        val expectedOutput = "901.6"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test56() {
        val input = "2/4/8/10/tan12"
        val expectedOutput = "2.9403938184240337"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test57() {
        val input = "0/0.125"
        val expectedOutput = "0.0"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test58() {
        val input = "+!+-"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test59() {
        val input = "cos123456789-sin123456789"
        val expectedOutput = "-0.8312538757923253"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test60() {
        val input = "10!+"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test61() {
        val input = "cos8888-sin-8888*2!+3"
        val expectedOutput = "0.771025697450515"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test62() {
        val input = "^3+56-tan23"
        val expectedOutput = "Error"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test63() {
        val input = "log10331+20!-tan-23"
        val expectedOutput = "2.43290200817664E18"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }

    @Test
    fun test64() {
        val input = "10+1-2/3*4+cos5-sin6/tan7*cosh8-sinh9/tanh10*11!-|-12|*log1013+√14-15^16*ln14"
        val expectedOutput = "-1.7334406376774801E19"
        val output = advancedCalculator(input)
        assertEquals(expectedOutput, output)
    }
}