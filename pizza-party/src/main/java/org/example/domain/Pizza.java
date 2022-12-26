package org.example.domain;

import java.util.Objects;

public class Pizza {
    private int pieces;
    public Pizza(int pieces) {
        if(pieces <= 0) {
            throw new IllegalArgumentException("피자 조각 개수는 양수여야 합니다.");
        }
        if(pieces % 2 != 0) {
            throw new IllegalArgumentException("피자 조각 개수는 짝수여야 합니다.");
        }
        this.pieces = pieces;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return pieces == pizza.pieces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieces);
    }
}
