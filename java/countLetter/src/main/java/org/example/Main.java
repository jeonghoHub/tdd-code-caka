package org.example;

import org.example.application.Game;
import org.example.domain.Word;
import org.example.io.Input;
import org.example.io.Output;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game(new Input(), new Output());
        Word word = game.word();
        game.print(word);
    }
}