package org.example.domain;

public class Pitcher {
    private PitcherValue pitcherValue;

    public Pitcher() {
        this.pitcherValue = new PitcherValue();
    }

    public String getValue() {
        return pitcherValue.getValue();
    }
}
