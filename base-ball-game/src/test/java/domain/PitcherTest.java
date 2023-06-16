package domain;

import org.example.domain.Pitcher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

@DisplayName("투수가")
public class PitcherTest {

    private Pitcher pitcher;

    @BeforeEach
    void setUp() {
        pitcher = new Pitcher();
    }

    @Test
    void 생성하는_숫자는_세자리여야만_한다() {
        //given when
        var value = pitcher.getValue();
        //then
        assertThat(value.length()).isEqualTo(3);
    }

}
