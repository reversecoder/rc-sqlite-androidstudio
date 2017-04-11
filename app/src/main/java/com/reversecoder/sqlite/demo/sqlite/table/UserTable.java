package com.reversecoder.sqlite.demo.sqlite.table;

import com.reversecoder.sqlite.engine.SQLite;

public class UserTable extends SQLite {

    public String name;

    public UserTable() {
        super();

        setSubclassInstance(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
