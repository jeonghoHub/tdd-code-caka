package org.example.domain;

import java.util.Objects;

public class Piece {
    private int pieces;
    public Piece(final int pieces) {
        if(pieces <= 0) {
            throw new IllegalArgumentException("피자 조각 개수는 0개 이상이여야 합니다.");
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
        Piece pizza = (Piece) o;
        return pieces == pizza.pieces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pieces);
    }
}
