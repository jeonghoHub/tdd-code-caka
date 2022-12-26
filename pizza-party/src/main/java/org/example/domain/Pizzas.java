package org.example.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Pizzas {
    private final List<Pizza> pizzas;
    public Pizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }
    public static Pizzas init(int pizzaCount, int piece) {
        List<Pizza> pizzas = IntStream.rangeClosed(1, pizzaCount)
                .mapToObj(pizza -> new Pizza(piece))
                .collect(Collectors.toList());
        return new Pizzas(pizzas);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizzas pizzas1)) return false;
        return pizzas.equals(pizzas1.pizzas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzas);
    }
}
