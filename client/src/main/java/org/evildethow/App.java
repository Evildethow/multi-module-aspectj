package org.evildethow;

public class App {

    public void hello(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        App app = new App();
        app.hello("world");
    }
}
