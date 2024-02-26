package com.example.thymeleafexample.business.entities;

public enum Type {
    PLASTIC("PLASTIC"),
    WOOD("WOOD");

    public static final Type[] ALL = {PLASTIC, WOOD};

    private final String name;

    public static Type forName(final String name) throws IllegalAccessException {
        if (name == null) {
            throw new IllegalAccessException("Name cannot be null for type");
        }
        if (name.equalsIgnoreCase("PLASTIC")) {
            return PLASTIC;
        } else if (name.equalsIgnoreCase("WOOD")) {
            return WOOD;
        }
        throw new IllegalAccessException("Name \"" + name + "\" does not correspond to any Type");
    }

    Type(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
