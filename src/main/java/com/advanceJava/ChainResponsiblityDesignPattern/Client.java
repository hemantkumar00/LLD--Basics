package com.advanceJava.ChainResponsiblityDesignPattern;

public class Client {
    static void main() {
        LogProcessor logProcessor = new DebugLogProcessor(new InfoLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.ERROR, "exception happens");
        logProcessor.log(LogProcessor.INFO, "info happens");
        logProcessor.log(LogProcessor.DEBUG, "debug happens");
    }
}
