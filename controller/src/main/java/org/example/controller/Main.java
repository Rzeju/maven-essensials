package org.example.controller;

public class Main {
    public static void main(String[] args) {
        PersonController personController = PersonController.getInstance();
        personController.findById(2);
    }
}
