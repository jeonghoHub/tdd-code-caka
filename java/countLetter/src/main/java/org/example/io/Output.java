package org.example.io;

import org.example.domain.Word;

public class Output {
    public void printSentence(Word word) {
        System.out.println(word.getValue() + " has" + word.length() + " characters.");
    }
}
