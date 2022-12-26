package domain;

import org.example.domain.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

public class PizzaTests {
    @ParameterizedTest
    @ValueSource(ints = {-1, 0})
    @DisplayName("피자 조각 개수는 양수여야 합니다..")
    void test(int pieces) {
        assertThatThrownBy(() -> new Pizza(pieces))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("피자 조각 개수는 양수여야 합니다.");
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 7})
    @DisplayName("피자 조각 개수는 짝수이어야 합니다.")
    void test1(int pieces) {
        assertThatThrownBy(() -> new Pizza(pieces))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("피자 조각 개수는 짝수여야 합니다.");
    }
}

