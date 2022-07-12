import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource

internal class VaildationTest {
    @ParameterizedTest
    @NullAndEmptySource
    fun 유효성검증_통과못하면_예외발생(str: String?) {
        assertThrows(IllegalArgumentException::class.java) {
            Vaildation.from(str);
        }
    }

}