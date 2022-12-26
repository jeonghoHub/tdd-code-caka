package domain;

import org.example.domain.Pizza;
import org.example.domain.Pizzas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class PizzasTests {
    @Test
    @DisplayName("피자 생성")
    void test() {
        final Pizzas pizzas = Pizzas.init(6, 2);
        assertThat(pizzas)
                .isEqualTo(new Pizzas(List.of(new Pizza(6), new Pizza(6))));
    }
}
