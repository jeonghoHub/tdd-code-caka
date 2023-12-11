package application;

import domain.Rectangle;
import io.Input;
import io.Output;

import java.io.IOException;

public class Game {
    private Input input;
    private Output output;
    public Game(Input input, Output output) {
        this.input = input;
        this.output = output;
    }
    public Rectangle start() throws IOException {
        return input.enter();
    }
    public void print(Rectangle rectangle) {
        output.printSquareFeetAndSquareMeter(rectangle);
    }
}
