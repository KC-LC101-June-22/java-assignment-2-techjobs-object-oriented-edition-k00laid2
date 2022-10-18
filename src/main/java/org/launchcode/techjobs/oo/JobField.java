package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    // similar fields
    private int id;
    private static int nextId = 1;
    private String value;


    // similar constructors
    public JobField() {
        id = nextId;
        nextId++;
    }
    public JobField(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField that = (JobField) o;
        return id == that.getId();
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        if (value != null && !value.isEmpty()){
            return value;
        } else return "Data not available";
    }

    public void setValue(String value) {
        this.value = value;
    }
}
