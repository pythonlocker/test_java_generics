package test;

public class A {
    private String msg;

    public A(String input) {
        this.msg = input;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " " + msg;
    }
}

