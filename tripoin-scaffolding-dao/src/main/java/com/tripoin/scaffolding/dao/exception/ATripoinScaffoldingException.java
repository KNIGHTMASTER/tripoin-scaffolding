package com.tripoin.scaffolding.dao.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 */
public class ATripoinScaffoldingException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = -3006085274327484535L;

    private Logger logger = LoggerFactory.getLogger(ATripoinScaffoldingException.class);

    public ATripoinScaffoldingException(String p_Message) {
        this(p_Message, null);
    }

    public ATripoinScaffoldingException(String p_Message, Throwable p_Throwable) {
        super(p_Message, p_Throwable);
        if (p_Message != null && p_Throwable != null) {
            logger.info(p_Message);
            p_Throwable.printStackTrace();

        } else {
            if (p_Message != null) {
                logger.info(p_Message);
            }
            if (p_Throwable != null) {
                logger.error(p_Throwable.getMessage());
                p_Throwable.printStackTrace();
            }
        }
    }
}
