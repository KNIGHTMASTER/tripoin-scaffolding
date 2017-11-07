package com.tripoin.scaffolding.service.exception;

import com.tripoin.scaffolding.dao.exception.ATripoinScaffoldingException;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */

public class ServiceException extends ATripoinScaffoldingException {

    public ServiceException(String p_Message) {
        super(p_Message);
    }
    
    public ServiceException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
    
}
