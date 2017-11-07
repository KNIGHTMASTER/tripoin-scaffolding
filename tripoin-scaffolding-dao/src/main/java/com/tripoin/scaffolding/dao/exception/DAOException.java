package com.tripoin.scaffolding.dao.exception;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 */
public class DAOException extends ATripoinScaffoldingException {

    public DAOException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
    }
    
    public DAOException(String p_Message) {
        super(p_Message);
    }
    
}
