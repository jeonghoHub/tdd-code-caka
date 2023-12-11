package org.example.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pizzas {
    private final List<Pizza> pizzas;
    public Pizzas(final List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    public static Pizzas init(final int piece, final int pizzaCount) {
        final List<Pizza> pizzas = IntStream.range(0, pizzaCount)
                .mapToObj(pizza -> new Pizza(piece))
                .toList();
        return new Pizzas(pizzas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizzas pizzas1 = (Pizzas) o;
        return Objects.equals(pizzas, pizzas1.pizzas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzas);
    }
}
