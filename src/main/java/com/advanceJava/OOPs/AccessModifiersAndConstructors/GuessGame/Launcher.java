package com.advanceJava.OOPs.AccessModifiersAndConstructors.GuessGame;

public class Launcher {
    static void main() {
        Game firstGame = new Game("one", "two", "three");
        firstGame.launchGame();
    }
}
