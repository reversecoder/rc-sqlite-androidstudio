package com.reversecoder.sqlite.exception;

public class SQLiteSuperNotCalledException extends RuntimeException {
    @Override
    public String getMessage() {
        return "SQLite subclasses should call super()! please call super() on this subclass";
    }
}
