package org.pandemorra;

import javafx.util.StringConverter;

public class DoubleStringConverter extends StringConverter<Double> {

    @Override
    public String toString(Double object) {
        return object.toString();
    }

    @Override
    public Double fromString(String string) {
        return Double.valueOf(string);
    }
}

