package com.example.thymeleafexample.business.entities;

public enum Feature {
    SEEDSTARTER_SPECIFIC_SUBSTRATE("SEEDSTARTER_SPECIFIC_SUBSTRATE"),
    FERTILIZER("FERTILIZER"),
    PH_CORRECTOR("PH_CORRECTOR");


    public static final Feature[] ALL = {SEEDSTARTER_SPECIFIC_SUBSTRATE, FERTILIZER, PH_CORRECTOR};


    private final String name;


    public static Feature forName(final String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null for feature");
        }
        if (name.equalsIgnoreCase("SEEDSTARTER_SPECIFIC_SUBSTRATE")) {
            return SEEDSTARTER_SPECIFIC_SUBSTRATE;
        } else if (name.equalsIgnoreCase("FERTILIZER")) {
            return FERTILIZER;
        } else if (name.equalsIgnoreCase("PH_CORRECTOR")) {
            return PH_CORRECTOR;
        }
        throw new IllegalArgumentException("Name \"" + name + "\" does not correspond to any Feature");
    }


    private Feature(final String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return getName();
    }
}
