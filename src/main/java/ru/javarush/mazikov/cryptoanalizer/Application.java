package ru.javarush.mazikov.cryptoanalizer;

import ru.javarush.mazikov.cryptoanalizer.controller.MainController;
import ru.javarush.mazikov.cryptoanalizer.entity.Result;
import ru.javarush.mazikov.cryptoanalizer.exception.AppException;

import java.util.Arrays;

public class Application {
    private MainController mainController;
    public Application() {
        mainController = new MainController();
    }

    public Result run(String[] args) {
        //encode text.txt encode.txt 12
        if (args.length > 0) {
            String action = args[0]; //encode
            String[] parameters = Arrays.copyOfRange(args, 1, args.length); //parameters text.txt encode.txt 12
            return mainController.doAction(action, parameters);
        }
        throw new AppException("Ошибка в классе Application");
    }
}
