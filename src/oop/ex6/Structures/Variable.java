package oop.ex6.structures;

public class Variable {

    private String name;
    private String type;
    private String value;
    private boolean isFinal;

    public Variable(boolean isFinal, String name, String type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
        this.isFinal = isFinal;
    }

    @Override
    public String toString() {
        return name;
    }
}
