package org.example.domain;

public class Word {
    private String value;
    public Word(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
    public int length() {
        return value.length();
    }
}
