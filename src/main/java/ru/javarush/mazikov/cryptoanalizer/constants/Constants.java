package ru.javarush.mazikov.cryptoanalizer.constants;

public class Constants {
    private static final String RUS = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String ENG = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SIGNS = "!?@#$%^&*()_+-=[]{}|;:'/ ";
    private static final String ALPHABET = RUS + ENG + RUS.toLowerCase() + ENG.toLowerCase() + DIGITS + SIGNS;

    public static final char[] ABC = ALPHABET.toCharArray();
}
