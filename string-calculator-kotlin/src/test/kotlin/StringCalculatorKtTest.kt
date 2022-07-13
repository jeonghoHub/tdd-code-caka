import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments

import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource
import java.util.Arrays
import java.util.LinkedList
import java.util.Queue
import java.util.stream.Stream

internal class StringCalculatorKtTest {

    @ParameterizedTest
    @MethodSource("expressionProvider")
    fun 연산자분리(expression: Vaildation, expected: Queue<Char>) {
//        given
        val stringCalculator: StringCalculator = StringCalculator()
//        when
        val operator: Queue<Char> = stringCalculator.operatorExtraction(expression)
//        then
        assertThat(operator).isEqualTo(expected)
    }

    companion object {
        @JvmStatic
        fun expressionProvider(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(Vaildation.from("1+5-10"), LinkedList(listOf('+','-'))),
                Arguments.of(Vaildation.from("1+5-10*30"), LinkedList(listOf('+','-','*'))),
            )
        }
    }

}