package com.tripoin.scaffolding.endpoint.exception;

import com.tripoin.scaffolding.dao.exception.ATripoinScaffoldingException;

/**
 * Created on 11/1/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class EndPointException extends ATripoinScaffoldingException {
    public EndPointException(String p_Message) {
        super(p_Message);
    }

    public EndPointException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
}
