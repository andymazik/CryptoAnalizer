package ru.javarush.mazikov.cryptoanalizer.commands;

import ru.javarush.mazikov.cryptoanalizer.entity.Result;

public interface Action {
    Result execute(String[] parameters);
}
