import java.util.LinkedList
import java.util.Queue

class StringCalculator() {
    fun calculate(expressionParam: Vaildation) {
//        println(expressionParam.get())
    }

    fun operatorExtraction(expressionParam: Vaildation):Queue<Char> {
        val expression = expressionParam.get()
        val operator = expression?.replace("\\d", "")
        println(operator)
        return LinkedList()
    }

}

