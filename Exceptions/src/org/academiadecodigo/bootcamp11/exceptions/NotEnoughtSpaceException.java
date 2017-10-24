package org.academiadecodigo.bootcamp11.exceptions;

/**
 * Created by codecadet on 04/10/17.
 */
public class NotEnoughtSpaceException extends FileException{

    public NotEnoughtSpaceException() {
    }

    public NotEnoughtSpaceException(String message) {
        super(message);
    }
}
