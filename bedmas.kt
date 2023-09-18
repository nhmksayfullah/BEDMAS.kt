package put.your.packagename


enum class Operator {
    EXPONENTIAL, DIVIDE, MULTIPLY, ADDITION, SUBTRACTION
}
fun String.removeSpace() = this.replace(" ", "")


fun String.extractExpression(): List<Any> {
    val extractedList: MutableList<Any> = mutableListOf()
    var operand = ""

    fun extractOperand() {
        if (operand != "") {
            extractedList.add(operand)
            operand = ""
        }
    }

    for(char in this) {
        when(char) {
            '^' -> {
                extractOperand()
                extractedList.add(Operator.EXPONENTIAL)
            }
            '/' -> {
                extractOperand()
                extractedList.add(Operator.DIVIDE)
            }
            '*' -> {
                extractOperand()
                extractedList.add(Operator.MULTIPLY)
            }
            '+' -> {
                extractOperand()
                extractedList.add(Operator.ADDITION)
            }
            '-' -> {
                extractOperand()
                extractedList.add(Operator.SUBTRACTION)
            }
            else -> {
                operand += char
            }
        }
    }
    extractOperand()
    return extractedList
}

fun List<Any>.execute(): String {

    val list = this.toMutableList()
    while (list.size > 1) {
        when {
            list.find { it == Operator.EXPONENTIAL } != null -> {
                for (item in this) {
                    if (item == Operator.EXPONENTIAL) {
                        val index = list.indexOf(item)
                        val operand1 = list[index-1].toString().toDouble()
                        val operand2 = list[index+1].toString().toInt()
                        var result = 1.0
                        for (i in 1..operand2) {
                            result *= operand1
                        }
                        list.removeAt(index-1)
                        list.removeAt(index-1)
                        list[index-1] = result
                    }
                }
            }
            list.find { it == Operator.DIVIDE } != null -> {
                for (item in this) {
                    if (item == Operator.DIVIDE) {
                        val index = list.indexOf(item)
                        val operand1 = list[index-1].toString().toDouble()
                        val operand2 = list[index+1].toString().toDouble()
                        val result = operand1 / operand2
                        list.removeAt(index-1)
                        list.removeAt(index-1)
                        list[index-1] = result
                    }
                }
            }
            list.find { it == Operator.MULTIPLY } != null -> {
                for (item in this) {
                    if (item == Operator.MULTIPLY) {
                        val index = list.indexOf(item)
                        val operand1 = list[index-1].toString().toDouble()
                        val operand2 = list[index+1].toString().toDouble()
                        val result = operand1 * operand2
                        list.removeAt(index-1)
                        list.removeAt(index-1)
                        list[index-1] = result
                    }
                }
            }
            list.find { it == Operator.ADDITION } != null -> {
                for (item in this) {
                    if (item == Operator.ADDITION) {
                        val index = list.indexOf(item)
                        val operand1 = list[index-1].toString().toDouble()
                        val operand2 = list[index+1].toString().toDouble()
                        val result = operand1 + operand2
                        list.removeAt(index-1)
                        list.removeAt(index-1)
                        list[index-1] = result
                    }
                }
            }
            list.find { it == Operator.SUBTRACTION } != null -> {
                for (item in this) {
                    if (item == Operator.SUBTRACTION) {
                        val index = list.indexOf(item)
                        val operand1 = list[index-1].toString().toDouble()
                        val operand2 = list[index+1].toString().toDouble()
                        val result = operand1 - operand2
                        list.removeAt(index-1)
                        list.removeAt(index-1)
                        list[index-1] = result
                    }
                }
            }
        }
        
    }
    return list[0].toString()
}

