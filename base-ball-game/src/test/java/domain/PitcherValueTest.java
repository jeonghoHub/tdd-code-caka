package domain;

import org.example.domain.Pitcher;
import org.example.domain.PitcherValue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("투수의 값이")
public class PitcherValueTest {
    private PitcherValue pitcherValue;

    @BeforeEach
    void setUp() {
        pitcherValue = new PitcherValue();
    }

    @ParameterizedTest
    @ValueSource(ints = {122, 111, 929})
    void 중복_된다면_False를_반환(int target) {
        boolean valueUnavailable = pitcherValue.isValueAvailable(target);

        assertThat(valueUnavailable).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {732, 943, 123})
    void 중복이_안된다면_True를_반환(int target) {
        boolean valueUnavailable = pitcherValue.isValueAvailable(target);

        assertThat(valueUnavailable).isTrue();
    }
}
