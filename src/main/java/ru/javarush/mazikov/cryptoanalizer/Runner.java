package ru.javarush.mazikov.cryptoanalizer;

import ru.javarush.mazikov.cryptoanalizer.entity.Result;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) throws IOException {
        //encode text.txt encode.txt 12
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}
