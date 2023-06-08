package org.example.domain;

import java.util.Random;

public class PitcherValue {
    private int value;

    public PitcherValue() {
        this.value = generateValue();
    }

    public int generateValue() {
        while(true) {
            int randomInt = new Random().nextInt(900) + 100;
            if(isValueAvailable(randomInt)) {
                return randomInt;
            }
        }
    }

    public boolean isValueAvailable(int randomInt) {
        String randomString = String.valueOf(randomInt);
        for (int i = 0; i < randomString.length(); i++) {
            char currentChar = randomString.charAt(i);
            for(int j = i + 1; j < randomString.length(); j++) {
                if (currentChar == randomString.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getValue() {
        return value;
    }
}