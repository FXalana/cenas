package org.academiadecodigo.bootcamp11.exceptions;

/**
 * Created by codecadet on 04/10/17.
 */
public class NotEnoughtPermissionsException extends FileException {

    public NotEnoughtPermissionsException() {
    }

    public NotEnoughtPermissionsException(String message) {
        super(message);
    }
}
