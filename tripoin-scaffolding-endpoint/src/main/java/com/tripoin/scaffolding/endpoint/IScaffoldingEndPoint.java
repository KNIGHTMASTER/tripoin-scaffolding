package com.tripoin.scaffolding.endpoint;


/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public interface IScaffoldingEndPoint<DATA> extends IInquiryEndPoint, IInquiryEndPointResponseDTOConstructor, ITransactionEndPoint<DATA, String> {

}
