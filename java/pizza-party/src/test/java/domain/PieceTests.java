package domain;

import org.example.domain.Piece;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PieceTests {

    @ParameterizedTest
    @DisplayName("피자 조각 개수가 0 이하일 경우 예외발생")
    @ValueSource(ints = {-1, 0})
    void 피자_조각_개수가_0이하일_경우_예외_발생(int invalidPieceCount) {
        assertThatThrownBy(() -> new Piece(invalidPieceCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("피자 조각 개수는 1개 이상이어야 합니다.");
    }

    @ParameterizedTest
    @DisplayName("피자 조각 개수가 홀수일 경우 예외발생")
    @ValueSource(ints = {1, 9})
    void 피자_조각_개수가_홀수일_경우_예외_발생(int oddPieceCount) {
        assertThatThrownBy(() -> new Piece(oddPieceCount))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("피자 조각 개수는 짝수여야 합니다.");
    }
}