package com.cisc181.core;

public class PersonException extends Exception {

    Person person;

    public PersonException() {

    }

    public PersonException(String arg0) {
        super(arg0);
 
    }

    public PersonException(Throwable arg0) {
        super(arg0);
        
    }

    public PersonException(String arg0, Throwable arg1) {
        super(arg0, arg1);

    }

    public PersonException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
        super(arg0, arg1, arg2, arg3);
 
    }

}