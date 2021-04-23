package com.company;

public class Exception extends java.lang.Exception {

    private final String code;

    public Exception(String code) {
        super();
        this.code = code;
    }

    public Exception(String message, String code) {
        super(message);
        this.code = code;
    }

    public Exception(Throwable cause, String code) {
        super(cause);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

