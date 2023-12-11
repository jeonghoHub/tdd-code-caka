import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.*
import java.util.stream.Stream

internal class CalculationMaterialExtractorTest {

    @ParameterizedTest
    @MethodSource("operatorExpressionProvider")
    fun 연산자분리(value: Vaildator, expected: Queue<Char>) {
        //given
        val expression = value.get()
        //when
        val operator: Queue<Char> = CalculationMaterialExtractor.operatorExtraction(expression)
        //then
        Assertions.assertThat(operator).isEqualTo(expected)
    }
    @ParameterizedTest
    @MethodSource("operandExpressionProvider")
    fun 피연산자분리(value: Vaildator, expected: Queue<Double>) {
        //given
        val expression = value.get()
        //when
        val operand: Queue<Double> = CalculationMaterialExtractor.operandExtraction(expression)
        //then
        Assertions.assertThat(operand).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun operatorExpressionProvider() = listOf (
                Arguments { arrayOf(Vaildator.from("1+5-10"), LinkedList(listOf('+','-')))},
                Arguments { arrayOf(Vaildator.from("1+5-10*30"), LinkedList(listOf('+','-','*')))},
            )

        @JvmStatic
        fun operandExpressionProvider() = listOf (
                Arguments { arrayOf(Vaildator.from("1+5-10"), LinkedList(listOf(1.0,5.0,10.0)))},
                Arguments { arrayOf(Vaildator.from("1+5-10*30"), LinkedList(listOf(1.0,5.0,10.0,30.0)))},
        )
    }
}
