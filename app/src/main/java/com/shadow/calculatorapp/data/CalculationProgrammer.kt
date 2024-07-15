import kotlin.math.pow

private var Octal = mutableMapOf<String, String>()
private var Hexadecimal = mutableMapOf<String, String>()

private fun loadData() {
    Octal["000"] = "0"
    Octal["001"] = "1"
    Octal["010"] = "2"
    Octal["011"] = "3"
    Octal["100"] = "4"
    Octal["101"] = "5"
    Octal["110"] = "6"
    Octal["111"] = "7"
    Octal["0"] = "000"
    Octal["1"] = "001"
    Octal["2"] = "010"
    Octal["3"] = "011"
    Octal["4"] = "100"
    Octal["5"] = "101"
    Octal["6"] = "110"
    Octal["7"] = "111"
    Hexadecimal["0000"] = "0"
    Hexadecimal["0001"] = "1"
    Hexadecimal["0010"] = "2"
    Hexadecimal["0011"] = "3"
    Hexadecimal["0100"] = "4"
    Hexadecimal["0101"] = "5"
    Hexadecimal["0110"] = "6"
    Hexadecimal["0111"] = "7"
    Hexadecimal["1000"] = "8"
    Hexadecimal["1001"] = "9"
    Hexadecimal["1010"] = "A"
    Hexadecimal["1011"] = "B"
    Hexadecimal["1100"] = "C"
    Hexadecimal["1101"] = "D"
    Hexadecimal["1110"] = "E"
    Hexadecimal["1111"] = "F"
    Hexadecimal["0"] = "0000"
    Hexadecimal["1"] = "0001"
    Hexadecimal["2"] = "0010"
    Hexadecimal["3"] = "0011"
    Hexadecimal["4"] = "0100"
    Hexadecimal["5"] = "0101"
    Hexadecimal["6"] = "0110"
    Hexadecimal["7"] = "0111"
    Hexadecimal["8"] = "1000"
    Hexadecimal["9"] = "1001"
    Hexadecimal["A"] = "1010"
    Hexadecimal["B"] = "1011"
    Hexadecimal["C"] = "1100"
    Hexadecimal["D"] = "1101"
    Hexadecimal["E"] = "1110"
    Hexadecimal["F"] = "1111"
}

private fun decToBin(number: String): String {
    var x = number.toLong()
    var cad: String = ""

    while (x > 0) {
        cad += (x % 2).toString()
        x /= 2
    }

    return cad.reversed()
}

private fun binToDec(number: String): String {
    var x: String = ""
    var aux: Double = 0.0
    var base: Double = 2.0
    var idx: Double = 0.0

    for (i in number.length - 1 downTo 0) {
        if (number[i] == '1')
            aux += base.pow(idx)
        idx += 1
    }

    x = aux.toString()
    return x
}

private fun octToBin(number: String): String {
    var x = number.toLong()
    var cad: String = ""

    for (i in number) {
        cad += Octal[i.toString()]
    }

    return cad
}

private fun hexToBin(number: String): String {
    var cad: String = ""

    for (i in number) {
        cad += Hexadecimal[i.toString()]
    }

    return cad
}

private fun allToOct(number: String): String {
    var aux = number
    while (aux.length % 3 != 0)
        aux = "0" + aux

    var cad: String = ""
    var idx = 0
    var ax: String = ""
    while (idx != aux.length) {
        ax = aux.substring(idx, idx + 3)
        cad += Octal[ax]
        idx += 3
    }

    return cad
}

private fun allToHex(number: String): String {
    var aux = number
    while (aux.length % 4 != 0)
        aux = "0" + aux

    var cad: String = ""
    var idx = 0
    var ax: String = ""
    while (idx != aux.length) {
        ax = aux.substring(idx, idx + 4)
        cad += Hexadecimal[ax]
        idx += 4
    }

    return cad
}

private fun operationAnd(number: String): String {
    var x: String = ""
    var c = number.count { op: Char -> op == '∧' }
    if (c > 1)
        return "Error"

    var firstNumber: String = ""
    var secondNumber: String = ""
    var change: Boolean = true
    for (i in number) {
        if (i == '∧') {
            change = false
            continue
        }

        if (change)
            firstNumber += i
        else
            secondNumber += i
    }

    var intfNumber = firstNumber.toInt()
    var intsNumber = secondNumber.toInt()

    var res = intfNumber and intsNumber
    x = res.toString()

    return x
}

private fun operationOr(number: String): String {
    var x: String = ""
    var c = number.count { op: Char -> op == '∨' }
    if (c > 1)
        return "Error"

    var firstNumber: String = ""
    var secondNumber: String = ""
    var change: Boolean = true
    for (i in number) {
        if (i == '∨') {
            change = false
            continue
        }

        if (change)
            firstNumber += i
        else
            secondNumber += i
    }

    var intfNumber = firstNumber.toInt()
    var intsNumber = secondNumber.toInt()

    var res = intfNumber or intsNumber
    x = res.toString()

    return x
}

private fun operationNot(number: String): String {
    var x: String = ""
    var c = number.count { op: Char -> op == '¬' }
    if (c > 1 || number[0] != '¬')
        return "Error"

    var firstNumber: String = ""
    for (i in 1 until number.length)
        firstNumber += number[i]

    var intfNumber = firstNumber.toInt()
    var res = intfNumber.inv()
    x = res.toString()

    return x
}

private fun operationShiftRight(number: String): String {
    var x: String = ""
    var c = number.count { op: Char -> op == '>' }
    if (c > 2)
        return "Error"

    var firstNumber: String = ""
    var secondNumber: String = ""
    var change: Boolean = true
    for (i in number) {
        if (i == '>') {
            change = false
            continue
        }

        if (change)
            firstNumber += i
        else
            secondNumber += i
    }

    var intfNumber = firstNumber.toInt()
    var intsNumber = secondNumber.toInt()

    val res = intfNumber shr intsNumber
    x = res.toString()

    return x
}

private fun operationShiftLeft(number: String): String {
    var x: String = ""
    var c = number.count { op: Char -> op == '<' }
    if (c > 2)
        return "Error"

    var firstNumber: String = ""
    var secondNumber: String = ""
    var change: Boolean = true
    for (i in number) {
        if (i == '<') {
            change = false
            continue
        }

        if (change)
            firstNumber += i
        else
            secondNumber += i
    }

    var intfNumber = firstNumber.toInt()
    var intsNumber = secondNumber.toInt()

    val res = intfNumber shl intsNumber
    x = res.toString()

    return x
}

private fun deleteZeros(number: String): String {
    var x: String = ""
    var t: Boolean = true
    for (i in number) {
        if (i == '0' && t) {
            continue
        } else {
            t = false
            x += i
        }
    }

    return x
}

private fun comprobationConversion(c1: String, c2: String, c3: String): Boolean{
    if (c1.contains("null") || c2.contains("null") || c3.contains("null"))
        return true
    else
        return false
}

private fun selectOperation(number: String): String {
    var res: String = ""
    res = when {
        ">" in number -> operationShiftRight(number)
        "<" in number -> operationShiftLeft(number)
        "∧" in number -> operationAnd(number)
        "∨" in number -> operationOr(number)
        "¬" in number -> operationNot(number)
        else -> "Error"
    }

    return res
}

fun programmerCalculator(number: String, option: String): String {
    var x: String = ""
    try {
        loadData()
        if (option == "Ope") {
            x = selectOperation(number)
        } else if (option == "Bin") {
            var aux = deleteZeros(number)
            var binHex = allToHex(aux)
            var binOct = allToOct(aux)
            var binDec = binToDec(aux)
            if (comprobationConversion(binHex, binOct, binDec))
                return "Error"
            else
                x = "Hex " + binHex + "\n\nOct " + binOct + "\n\nDec " + binDec
        } else if (option == "Hex") {
            var hexBin = hexToBin(number)
            hexBin = deleteZeros(hexBin)
            var hexOct = allToOct(hexBin)
            var hexDec = binToDec(hexBin)
            if (comprobationConversion(hexBin, hexOct, hexDec))
                return "Error"
            else
                x = "Oct " + hexOct + "\n\nDec " + hexDec + "\n\nBin " + hexBin
        } else if (option == "Dec") {
            var decBin = decToBin(number)
            decBin = deleteZeros(decBin)
            var decHex = allToHex(decBin)
            var decOct = allToOct(decBin)
            if (comprobationConversion(decBin, decHex, decOct))
                return "Error"
            else
                x = "Hex " + decHex + "\n\nOct " + decOct + "\n\nBin " + decBin
        } else if (option == "Oct") {
            var octBin = octToBin(number)
            octBin = deleteZeros(octBin)
            var octHex = allToHex(octBin)
            var octDec = binToDec(octBin)
            if (comprobationConversion(octBin, octHex, octDec))
                return "Error"
            else
                x = "Hex " + octHex + "\n\nDec " + octDec + "\n\nBin " + octBin
        }

        return x
    } catch (e: Exception) {
        return "Error"
    }
}

/*
 * Do you know who did it?
 * GOD DID
 */
