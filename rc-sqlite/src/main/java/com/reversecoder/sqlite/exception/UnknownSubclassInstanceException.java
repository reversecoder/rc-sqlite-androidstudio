package com.reversecoder.sqlite.exception;

public class UnknownSubclassInstanceException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Subclass is unknown, please set the subclass instance of this class by calling setSubclassInstance(this)";
    }
}
