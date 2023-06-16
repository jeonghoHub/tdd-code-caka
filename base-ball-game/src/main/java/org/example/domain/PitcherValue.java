package org.example.domain;

import java.util.*;
import java.util.stream.Collectors;

public class PitcherValue {
    private final String value;

    public PitcherValue() {
        this.value = generateValue();
    }

    public String generateValue() {
        Set<Integer> values = new HashSet<>();
        while (values.size() < 3) {
            int randomValue = (int) (Math.random() * 9) + 1;
            values.add(randomValue);
        }
        return values.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PitcherValue that)) return false;
        return Objects.equals(getValue(), that.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}