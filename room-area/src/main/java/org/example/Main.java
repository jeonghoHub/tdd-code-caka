package org.example;

import application.Game;
import domain.Rectangle;
import io.Input;
import io.Output;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Game game = new Game(new Input(), new Output());
        Rectangle rectangle = game.start();
        game.print(rectangle);
    }
}