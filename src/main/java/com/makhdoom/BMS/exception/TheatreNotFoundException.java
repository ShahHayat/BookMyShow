package com.makhdoom.BMS.exception;

public class TheatreNotFoundException extends RuntimeException {

    public TheatreNotFoundException() {
        super();
    }

    public TheatreNotFoundException(String message) {
        super(message);
    }

    public TheatreNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TheatreNotFoundException(Throwable cause) {
        super(cause);
    }

    protected TheatreNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
