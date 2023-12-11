import org.example.domain.Word;
import org.example.io.Input;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class wordTest {
    @Test
    void 입력한_글자수를_반환한다() {
        String name = "abcde";
        Word word = new Word(name);
        assertThat(word.length()).isEqualTo(5);
    }
}
