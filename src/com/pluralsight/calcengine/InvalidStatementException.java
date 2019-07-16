package com.pluralsight.calcengine;

public class InvalidStatementException extends Exception {

    public  InvalidStatementException(String reason, String statment) {
        super(reason + ": " + statment);
    }

    public  InvalidStatementException(String reason, String statment, Throwable cause) {
        super(reason + ": " + statment, cause);
    }


}
