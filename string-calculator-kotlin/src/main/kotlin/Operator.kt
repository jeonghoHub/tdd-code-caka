import java.util.DoubleSummaryStatistics
import java.util.function.DoubleBinaryOperator
import java.util.stream.Stream

//interface

enum class Operator(private val operator: Char,private val doubleBinaryOperator: DoubleBinaryOperator ) {
    PLUS('+', {left, right -> left + right} ),
    MINUS('-', {left, right -> left - right} ),
    DIVISION('/', {left, right -> left / right} ),
    MULTIPLY('*', {left, right -> left * right} );

    companion object {
        fun findByOperator(param: Char): Operator {
            return values()
                .firstOrNull { it.operator == param }
                ?: throw IllegalArgumentException("존재하지 않는 연산자 입니다.")

        }
    }

    fun apply(left: Double, right: Double): Double {
        if(right == 0.0) throw ArithmeticException("0으로는 나눌 수 없습니다")
        return doubleBinaryOperator.applyAsDouble(left, right)
    }
}