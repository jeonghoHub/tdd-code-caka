import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.ValueSource
import java.util.stream.Stream

internal class OperatorTest {

    @ParameterizedTest
    @MethodSource("findByOperator")
    fun 입력값이_사칙연산자값이면_상수값반환(operator: Char, expected: Operator) {
        //given
        //when
        val enumOperator = Operator.findByOperator(operator)
        //then
        assertThat(enumOperator).isEqualTo(expected)
    }

    @ParameterizedTest
    @ValueSource(chars = ['a','b','c','@'])
    fun 입력값이_사칙연산자값이_아니라면_예외(wrongOperator: Char) {
        assertThrows<IllegalArgumentException> {
            Operator.findByOperator(wrongOperator)
        }
    }

    companion object {
        @JvmStatic
        fun findByOperator(): Stream<Arguments> {
            return Stream.of(
                arguments('+', Operator.PLUS),
                arguments('-', Operator.MINUS),
                arguments('*', Operator.MULTIPLY),
                arguments('/', Operator.DIVISION)
            );
        }
    }
}