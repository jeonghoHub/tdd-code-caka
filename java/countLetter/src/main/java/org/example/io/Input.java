package org.example.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    private static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public String enterWord() throws IOException {
        String value = "";
        while(isNullorEmpty(value)) {
            System.out.println("What is the input String? ");
            value = READER.readLine();
        }
        return value;
    }

    private boolean isNullorEmpty(String value) {
        return value.isBlank();
    }

}
