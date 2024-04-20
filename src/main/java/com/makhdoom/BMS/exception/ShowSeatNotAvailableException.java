package com.makhdoom.BMS.exception;

public class ShowSeatNotAvailableException extends RuntimeException {

    public ShowSeatNotAvailableException() {
        super();
    }

    public ShowSeatNotAvailableException(String message) {
        super(message);
    }

    public ShowSeatNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }

    public ShowSeatNotAvailableException(Throwable cause) {
        super(cause);
    }

    protected ShowSeatNotAvailableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
