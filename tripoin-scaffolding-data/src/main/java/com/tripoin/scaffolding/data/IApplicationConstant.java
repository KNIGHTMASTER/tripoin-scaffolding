package com.tripoin.scaffolding.data;

/**
 * Created on 3/10/17.
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IApplicationConstant {

    interface onPrePersist{
        String CREATED_BY = "";
        String CREATED_ON = "";
        String CREATED_IP = "";
        String CREATED_PLATFORM = "";
    }

    interface onPreUpdate{
        String MODIFIED_BY = "";
        String MODIFIED_ON = "";
        String MODIFIED_IP = "";
        String MODIFIED_PLATFORM = "";
    }

    interface Common {
        interface GeneralValue{
            int ONE = 1;
            int ZERO = 0;
        }
    }
    
    interface Punctuation {
        String SPACE = " ";
        String COLON = ":";
        String SEMI_COLON = ";";
        String COMMA = ",";
        String QUESTION = "?";
        String UNDERSCORE = "_";
        String HYPHEN = "-";
        String SLASH = "/";
        String AT_MARK = "@";
        String EMPTY = "";
    }

}
