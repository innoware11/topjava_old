package ru.javawebinar.topjava.model;

public class BaseEntity {
    protected Integer id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNew() {
        return this.id == null;

    }
}
