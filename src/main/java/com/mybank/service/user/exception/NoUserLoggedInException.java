package com.mybank.service.user.exception;

import javax.transaction.SystemException;

/**
 * The exception indicates that current user cannot be obtained.
 *
 * @author Vlad Fefelov
 */
public class NoUserLoggedInException extends SystemException {

    public NoUserLoggedInException() {
        super("No user is currently logged in to the system!");
    }

}
