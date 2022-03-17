package ru.javarush.mazikov.cryptoanalizer.commands;

import ru.javarush.mazikov.cryptoanalizer.entity.Result;
import ru.javarush.mazikov.cryptoanalizer.entity.ResultCode;

public class Encoder implements Action {
    @Override
    public Result execute(String[] parameters) {
        //TODO something
        return new Result("All right", ResultCode.OK);
    }
}
