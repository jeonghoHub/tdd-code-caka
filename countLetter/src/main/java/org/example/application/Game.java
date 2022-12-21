package org.example.application;

import org.example.domain.Word;
import org.example.io.Input;
import org.example.io.Output;

import java.io.IOException;

public class Game {
    private Input input;
    private Output output;
    public Game(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    public Word word() throws IOException {
        return new Word(input.enterWord());
    }

    public void print(Word word) {
        output.printSentence(word);
    }
}
