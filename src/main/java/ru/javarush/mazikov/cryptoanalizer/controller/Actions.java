package ru.javarush.mazikov.cryptoanalizer.controller;

import ru.javarush.mazikov.cryptoanalizer.commands.Action;
import ru.javarush.mazikov.cryptoanalizer.commands.Decoder;
import ru.javarush.mazikov.cryptoanalizer.commands.Encoder;
import ru.javarush.mazikov.cryptoanalizer.exception.AppException;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());


    private final Action action;

    Actions(Action action) {
        this.action = action;
    }

    public static Action find(String actionName) {
        try {
            Actions value = Actions.valueOf(actionName.toUpperCase());
            return value.action;
        } catch (IllegalArgumentException e) {
            throw new AppException("Can't find a command: " + actionName, e);
        }

    }
}

