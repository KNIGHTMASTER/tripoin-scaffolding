package com.tripoin.scaffolding.data;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 */
public interface IScaffoldingConstant {
    
    interface Query{
        String APPROVED = "1";
        String CANCELLED = "0";
        String SELECT_LOV = "SELECT id, name FROM #{#entityName}";
    }
    
}
