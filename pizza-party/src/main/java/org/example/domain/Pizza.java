package org.example.domain;

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
}
