package com.advanceJava.DesignPatterns.Creational.Singleton;

import javax.xml.crypto.Data;

public class Database {

    // simple Singleton
//    private static final Database instance = new Database();
//    private Database() {
//    }
//    public static Database getInstance() {
//        return instance;
//    }

    // lazy initialization

//    private static Database instance = null;
//    private Database() {
//    }
//    public static Database getInstance() {
//        if (instance == null) {
//            instance = new Database();
//        }
//        return instance;
//    }

    // Thread-safe singleton

//    private static Database instance;
//    private Database() {}
//
//    public static synchronized Database getInstance() {
//        if (instance == null) {
//            instance = new Database();
//        }
//        return instance;
//    }

    // Double-checked locking

    private static Database instance;
    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
}
