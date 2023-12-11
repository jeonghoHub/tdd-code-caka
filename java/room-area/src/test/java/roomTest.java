import domain.Rectangle;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
public class roomTest {
    @Test
    void 제곱피트는_가로와_세로를_곱한값과_같다(){
        //given
        int length = 10;
        int width = 15;
        //when
        Rectangle squareFee = new Rectangle(length, width);
        //then
        assertThat(squareFee.squareFeetCalculator()).isEqualTo(10 * 15);
    }

    @Test
    void 제곱미터는_제곱피트_곱하기_타겟과_같다(){
        //given
        int length = 10;
        int width = 15;
        double target = 0.009290304;
        //when
        Rectangle squareFee = new Rectangle(length, width);
        //then
        assertThat(squareFee.squareMeterCalculator()).isEqualTo(squareFee.squareFeetCalculator() * target);
    }
}
