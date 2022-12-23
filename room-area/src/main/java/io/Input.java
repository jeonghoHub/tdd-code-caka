package io;

import domain.Rectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public Rectangle enter() throws IOException {
        while(true) {
            System.out.printf("What is the length of the room in feet? ");
            int length = Integer.parseInt(READER.readLine());
            System.out.printf("What is the width of the room in feet? ");
            int width = Integer.parseInt(READER.readLine());
            return new Rectangle(length, width);
        }
    }

}
