import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource

internal class VaildationTest {

    @ParameterizedTest
    @ValueSource(strings = [
        "22+3-7*10/2",
        "2 + 33 - 77777 * 10 / 2",
        "2 + 312446-73223 * 170/2",
        "35317851025",
        "0",
    ])
    fun 유효성검증을_통과하면_예외가_발생하지않는다(actual: String) {
        assertThatCode {
            Vaildation.from(actual)
        }.doesNotThrowAnyException()
    }
    @ParameterizedTest
    @NullAndEmptySource
    fun 유효성검증_통과못하면_예외발생(actual: String?) {
        assertThatThrownBy {
            Vaildation.from(actual)
        }
    }
    @ParameterizedTest
    @CsvSource(
        "2 + 3 + 5:2+3+5",
        "2* 3 + 5:2*3+5",
        "2 + 3 +5/ 6-3:2+3+5/6-3"
    , delimiter = ':')
    fun get으로값_가져올시_공백이_제거되어야함(expression: String, expected: String ) {
        val value = Vaildation.from(expression)
        assertThat(value.get()).isEqualTo(expected)
    }

}