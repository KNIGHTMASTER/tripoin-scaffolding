package com.tripoin.scaffolding.endpoint;

import com.tripoin.scaffolding.data.dto.ResponseData;
import com.tripoin.scaffolding.data.dto.response.GenericListResponseDTO;
import com.tripoin.scaffolding.data.dto.response.GenericSingleDATAResponseDTO;
import com.tripoin.scaffolding.endpoint.exception.EndPointException;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * created on 10/15/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
public interface IResponseConstructor<DATA> {

    GenericSingleDATAResponseDTO constructSingleFindResponse(DATA p_DATA) throws EndPointException;

    GenericSingleDATAResponseDTO constructDTOSingleFindResponse(Object p_DATA) throws EndPointException;

    GenericListResponseDTO constructListFindResponse(List<DATA> p_DATA) throws EndPointException;

    GenericListResponseDTO constructDTOListFindResponse(List<?> p_DATA) throws EndPointException;

    Page<DATA> constructPaginationResponse(Page<DATA> p_DATAPage) throws EndPointException;

    Page<?> constructDTOPaginationResponse(Page<?> p_DATAPage) throws EndPointException;

    ResponseData constructSimpleTransactionResponse(ResponseData p_ResponseData) throws EndPointException;
}
