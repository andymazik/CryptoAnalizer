package ru.javarush.mazikov.cryptoanalizer.controller;

import ru.javarush.mazikov.cryptoanalizer.commands.Action;
import ru.javarush.mazikov.cryptoanalizer.entity.Result;

public class MainController {
    public Result doAction(String actionName, String[] parameters) {
        //action == encode
        //parameters == [text.txt, encode.txt, 12]
        Action action = Actions.find(actionName);
        Result result = action.execute(parameters);
        return result;
    }
}
