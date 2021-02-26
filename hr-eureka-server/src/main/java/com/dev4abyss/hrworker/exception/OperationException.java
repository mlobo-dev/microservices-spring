package com.dev4abyss.hrworker.exception;

public class OperationException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public OperationException(String msg) {
        super(msg);
    }

    public OperationException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
