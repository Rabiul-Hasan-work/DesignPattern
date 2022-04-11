package com.codewithnaim.mementopattern;

public class Main {
    public static void main(String[] arg) {
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        editor.setContent("c");
        editor.undo();
    }
}
