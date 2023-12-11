import java.util.*

class CalculationMaterialExtractor {

    companion object {
        fun operatorExtraction(expressionParam: String): Queue<Char> {
            return expressionParam.replace(Regex("\\d"), "")
                .split("")
                .filter(String::isNotEmpty)
                .map(String::single)
                .toCollection(LinkedList())
        }

        fun operandExtraction(expressionParam: String): Queue<Double> {
            return expressionParam.split(Regex("\\D"))
                .map(String::toDouble)
                .toCollection(LinkedList())
        }
    }
}