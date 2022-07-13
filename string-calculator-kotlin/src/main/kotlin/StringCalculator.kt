import java.util.LinkedList
import java.util.Queue

class StringCalculator() {
    fun calculate(expressionParam: Vaildation) {
//        println(expressionParam.get())
    }

    fun operatorExtractor(expressionParam: Vaildation): Queue<Char> {
        val expression = expressionParam.get() ?: error("null") //        println(operators)
        return expression.replace(Regex("\\d"), "")
            .split("")
            .filter(String::isNotEmpty)
            .map(String::single)
            .toCollection(LinkedList())
    }

//    fun operandExtractor(expressionParam: Vaildation) {
//        return expressionParam.get().split(Regex("\\D"))
//            .map {}
//
//
//    }

}

