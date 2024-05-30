package com.example.calculatorapp.data

import kotlin.math.*

private fun separation(number: String): MutableList<String> {
    var i = 0
    var j = 0
    var ope = ""
    var num = ""
    var nNumber = ""
    var aNums = mutableListOf<String>()
    while (i < number.length) {
        ope = number[i].toString()
        j = i + 1
        num = ""
        if (number[j] == '|') {
            num += number[j]
            j++
            while (j < number.length) {
                if (number[j] != '|') {
                    num += number[j]
                } else {
                    num += number[j]
                    j++
                    break
                }
                j++
            }
        } else {
            while (j < number.length && number[j] != '+' && number[j] != '-' && number[j] != '*' && number[j] != '/') {
                num += number[j]
                j++
            }
        }

        nNumber = ope + num
        aNums.add(nNumber)

        i = j
    }

    return aNums
}

private fun unionBasic(nums: MutableList<String>): MutableList<String> {
    var union = mutableListOf<String>()
    var aux: String = ""
    var i = 0
    while (i < nums.size) {
        if (nums[i] == "*" && nums[i + 1][0] != '*' || nums[i] == "/" && nums[i + 1][0] != '/') {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "-") {
            aux = (nums[i + 1].toDouble() * -1).toString()
            union.add(aux)
            i++
        } else if (nums[i] == "+") {
            union.add(nums[i + 1])
            i++
        } else {
            union.add(nums[i])
        }
        i++
    }

    return union
}

private fun unionAdvanced(nums: MutableList<String>): MutableList<String> {
    var union = mutableListOf<String>()
    var aux: String = ""
    var i = 0
    while (i < nums.size) {
        if (nums[i] == "+sin" || nums[i] == "-sin") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+cos" || nums[i] == "-cos") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+tan" || nums[i] == "-tan") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+cosh" || nums[i] == "-cosh") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+sinh" || nums[i] == "-sinh") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+tanh" || nums[i] == "-tanh") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i] == "+ln" || nums[i] == "-ln") {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else if (nums[i][(nums[i].length) - 1] == '^') {
            aux = nums[i] + nums[i + 1]
            union.add(aux)
            i++
        } else {
            union.add(nums[i])
        }

        i++
    }

    return union
}

private fun solMulDiv(groupNum: String): String {
    var x: String = ""
    var firstNumber: String = ""
    var secondNumber: String = ""
    var operation: String = ""
    var optionNumber: Boolean = false
    for (i in 0 until groupNum.length) {
        if (!optionNumber && groupNum[i] != '*' && groupNum[i] != '/') {
            firstNumber += groupNum[i]
        }
        if (groupNum[i] == '*' || groupNum[i] == '/') {
            operation = groupNum[i].toString()
            optionNumber = true
        }
        if (optionNumber && groupNum[i] != '*' && groupNum[i] != '/') {
            secondNumber += groupNum[i]
        }
    }

    var resultFirstSecond: Double = 0.0
    if (operation == "*") {
        resultFirstSecond = firstNumber.toDouble() * secondNumber.toDouble()
    } else {
        resultFirstSecond = firstNumber.toDouble() / secondNumber.toDouble()
    }

    x = resultFirstSecond.toString()

    return x
}

private fun solveVector(aNums: MutableList<String>): MutableList<Double> {
    var numsDouble = mutableListOf<Double>()

    while (true) {
        var groupNums = mutableListOf<String>()
        var num = ""
        var i = 0
        var aumento: Boolean = false
        while (i < aNums.size) {
            aumento = false
            if (i + 1 < aNums.size) {
                if (aNums[i + 1][0] == '*' || aNums[i + 1][0] == '/') {
                    num = aNums[i] + aNums[i + 1]
                    aumento = true
                    groupNums.add(num)
                } else {
                    groupNums.add(aNums[i])
                }
            } else {
                groupNums.add(aNums[i])
            }

            if (aumento)
                i += 2
            else
                i++
        }

        aNums.clear()

        var resSolMulDiv: String = ""
        var nNumber: String = ""
        var operation: String = ""
        for (i in 0 until groupNums.size) {
            var ope = groupNums[i][0]
            operation = groupNums[i].substring(1, groupNums[i].length)
            if (operation.contains('*') || operation.contains('/')) {
                resSolMulDiv = solMulDiv(operation)

                if (ope == '-' && resSolMulDiv[0] == '-' || ope == '-') {
                    nNumber = (resSolMulDiv.toDouble() * -1).toString()
                } else if (resSolMulDiv[0] == '-') {
                    nNumber = resSolMulDiv
                } else {
                    nNumber = ope + resSolMulDiv
                }

                aNums.add(nNumber)
            } else {
                aNums.add(groupNums[i])
            }
        }

        var exit: Boolean = true
        for (i in 0 until aNums.size) {
            if (aNums[i][0] == '*' || aNums[i][0] == '/') {
                exit = false
                groupNums.clear()
                break
            }
        }

        if (exit) {
            break
        }
    }

    for (i in aNums) {
        numsDouble.add(i.toDouble())
    }

    return numsDouble
}

private fun comprobationNumber(number: String): Boolean {
    var x = true
    for (i in number) {
        if (i == 'E')
            return false
    }

    return x
}

private fun addSymbolString(number: String): String {
    var nNumber = ""

    if (number[0] == '-')
        nNumber = number
    else if (number[0].isDigit() || number[0].isLetter() || number[0] == '√' || number[0] == '|') {
        nNumber = '+' + number
    } else {
        nNumber = number
    }

    return nNumber
}

private fun addSymbolVector(numbers: MutableList<String>) {
    for (i in 0 until numbers.size) {
        if (numbers[i][0].isDigit()) {
            numbers[i] = "+" + numbers[i]
        }
    }
}

private fun resPow(num: String): String {
    var x: String = ""
    var number: String = ""
    var exponentiation: String = ""
    var stop: Boolean = true
    var i = 0
    while (i < num.length) {
        if (num[i] == '^') {
            stop = false
            i += 1
        }

        if (stop) {
            number += num[i]
        } else {
            exponentiation += num[i]
        }

        i += 1
    }

    var result = number.toDouble().pow(exponentiation.toDouble())
    x = result.toString()
    return x
}

private fun resRoot(num: String): String {
    var x: String = ""
    var index: String = ""
    var filing: String = ""
    var stop: Boolean = false

    for (i in 0 until num.length) {
        if (stop) {
            filing += num[i]
        } else if (num[i] != '√') {
            index += num[i]
        }

        if (num[i] == '√') {
            stop = true
        }
    }

    var result: Double = 0.0
    if (index == "") {
        result = sqrt(filing.toDouble())
    } else {
        result = filing.toDouble().pow(1.0 / index.toDouble())
    }
    x = result.toString()
    return x
}

private fun resCos(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0
    var radians: Double = 0.0

    for (i in num) {
        if (i != 'c' && i != 'o' && i != 's') {
            digit += i
        }
    }

    radians = Math.toRadians(digit.toDouble())
    result = cos(radians)
    x = result.toString()

    return x
}

private fun resSin(num: String): String {
    var x: String = ""
    var digit: String = ""
    var radians: Double = 0.0
    var result: Double = 0.0

    for (i in num) {
        if (i != 's' && i != 'i' && i != 'n') {
            digit += i
        }
    }

    radians = Math.toRadians(digit.toDouble())
    result = sin(radians)
    x = result.toString()
    return x
}

private fun resTan(num: String): String {
    var x: String = ""
    var digit: String = ""
    var radians: Double = 0.0
    var result: Double = 0.0

    for (i in num) {
        if (i != 't' && i != 'a' && i != 'n') {
            digit += i
        }
    }

    radians = Math.toRadians(digit.toDouble())
    result = tan(radians)
    x = result.toString()

    return x
}

private fun resSinH(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0

    for (i in num) {
        if (i != 's' && i != 'i' && i != 'n' && i != 'h') {
            digit += i
        }
    }

    result = sinh(digit.toDouble())
    x = result.toString()

    return x
}

private fun resCosh(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0

    for (i in num) {
        if (i != 'c' && i != 'o' && i != 's' && i != 'h') {
            digit += i
        }
    }

    result = cosh(digit.toDouble())
    x = result.toString()

    return x
}

private fun resTanH(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0

    for (i in num) {
        if (i != 't' && i != 'a' && i != 'n' && i != 'h') {
            digit += i
        }
    }

    result = tanh(digit.toDouble())
    x = result.toString()

    return x
}

private fun factorial(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 1.0

    for (i in num) {
        if (i.isDigit()) {
            digit += i
        }
    }

    for (i in 1 until digit.toInt() + 1) {
        result *= i
    }

    x = result.toString()
    return x
}

private fun resLog(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0
    var newNumber = num.substring(5, num.length)

    for (i in newNumber) {
        if (i.isDigit()) {
            digit += i
        }
    }

    result = log10(digit.toDouble())
    x = result.toString()

    return x
}

private fun resLn(num: String): String {
    var x: String = ""
    var digit: String = ""
    var result: Double = 0.0

    for (i in num) {
        if (i.isDigit()) {
            digit += i
        }
    }

    result = ln(digit.toDouble())
    x = result.toString()

    return x
}

private fun resAbs(num: String): String {
    var x: String = ""
    var result: String = ""
    var newNumber = num.substring(1, num.length - 1)
    var sNumber = addSymbolString(newNumber)
    var vectorNums = separation(sNumber)
    var unionVecAdvanced = unionAdvanced(vectorNums)

    var unionVector = unionBasic(unionVecAdvanced)
    if (unionVector[0][0] == '*' || unionVector[0][0] == '/')
        return "Error"

    var solveNum = solveOnetoOne(unionVector)
    addSymbolVector(solveNum)

    var resResult = solveVector(solveNum)
    result = solveRes(resResult)

    x = abs(result.toDouble()).toString()
    return x
}

private fun solveOnetoOne(vectorNums: MutableList<String>): MutableList<String> {
    var x = mutableListOf<String>()
    var ope: String = ""
    var num: String = ""
    var res: String = ""
    for (i in 0 until vectorNums.size) {
        ope = vectorNums[i][0].toString()
        num = vectorNums[i].substring(1, vectorNums[i].length)
        res = when {
            "|" in num -> resAbs(num)
            "sinh" in num -> resSinH(num)
            "cosh" in num -> resCosh(num)
            "tanh" in num -> resTanH(num)
            "sin" in num -> resSin(num)
            "cos" in num -> resCos(num)
            "tan" in num -> resTan(num)
            "^" in num -> resPow(num)
            "√" in num -> resRoot(num)
            "!" in num -> factorial(num)
            "log10" in num -> resLog(num)
            "ln" in num -> resLn(num)
            else -> num
        }

        if (ope == "-") {
            x.add((res.toDouble() * -1).toString())
        } else if (ope == "+") {
            x.add(res)
        } else {
            res = ope + res
            x.add(res)
        }
    }
    return x
}

private fun solveRes(resResult: MutableList<Double>): String {
    var x: Double = 0.0
    for (i in resResult) {
        x += i
    }

    var res = x.toString()
    return res
}

fun advancedCalculator(number: String): String {
    var res: String = ""
    try {
        var comprobationNum = comprobationNumber(number)
        if (!comprobationNum)
            return "Error"

        var sNumber = addSymbolString(number)
        var vectorNums = separation(sNumber)
        var unionVecAdvanced = unionAdvanced(vectorNums)
        var unionVector = unionBasic(unionVecAdvanced)
        if (unionVector[0][0] == '*' || unionVector[0][0] == '/')
            return "Error"

        var solveNum = solveOnetoOne(unionVector)
        addSymbolVector(solveNum)
        var resResult = solveVector(solveNum)
        res = solveRes(resResult)
        return res
    } catch (e: Exception) {
        return "Error"
    }
}

/*
 *  Do you know who did it?
 *  GOD DID
 */
