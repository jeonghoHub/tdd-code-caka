package org.example.domain;

import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Pizza {
    private final List<Piece> pieces;

    private Pizza(final List<Piece> pizzas) {
        this.pieces = pizzas;
    }

    public static Pizza init(final int piece, final int pizzaCount) {
        final List<Piece> pizzas = IntStream.range(0, pizzaCount)
                .mapToObj(pizza -> new Piece(piece))
                .toList();
        return new Pizza(pizzas);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizzas1 = (Pizza) o;
        return Objects.equals(pieces, pizzas1.pieces);
    }

    @Override
    public int hashCode()    {
        return Objects.hash(pieces);
    }
}
