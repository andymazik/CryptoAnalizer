package ru.javarush.mazikov.cryptoanalizer.commands;

import ru.javarush.mazikov.cryptoanalizer.entity.Result;
import ru.javarush.mazikov.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO something
        return new Result("BruteForce complete", ResultCode.OK);
    }
}
