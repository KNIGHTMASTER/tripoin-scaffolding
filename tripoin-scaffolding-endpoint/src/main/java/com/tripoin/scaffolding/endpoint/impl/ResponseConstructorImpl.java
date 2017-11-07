package com.tripoin.scaffolding.endpoint.impl;

import com.tripoin.scaffolding.data.constant.EResponseCode;
import com.tripoin.scaffolding.data.dto.ResponseData;
import com.tripoin.scaffolding.data.dto.response.GenericListResponseDTO;
import com.tripoin.scaffolding.data.dto.response.GenericSingleDATAResponseDTO;
import com.tripoin.scaffolding.endpoint.IResponseConstructor;
import com.tripoin.scaffolding.endpoint.exception.EndPointException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created on 10/15/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 */
@Service
public class ResponseConstructorImpl<DATA> implements IResponseConstructor<DATA> {

    private static Logger LOGGER = LoggerFactory.getLogger(ResponseConstructorImpl.class);

    @Override
    public GenericSingleDATAResponseDTO constructSingleFindResponse(DATA p_DATA) throws EndPointException {
        GenericSingleDATAResponseDTO response = new GenericSingleDATAResponseDTO();
        response.setResponseData(new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg()));
        try{
            if (p_DATA == null){
                LOGGER.info("Data Not Found");
            }
            response.setContent(p_DATA);
            response.setResponseData(new ResponseData(EResponseCode.RC_SUCCESS.getResponseCode(), (EResponseCode.RC_SUCCESS.getResponseMsg())));
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EndPoint", e);
        }
        return response;
    }

    @Override
    public GenericSingleDATAResponseDTO constructDTOSingleFindResponse(Object p_DATA) throws EndPointException {
        GenericSingleDATAResponseDTO response = new GenericSingleDATAResponseDTO();
        response.setResponseData(new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg()));
        try{
            if (p_DATA == null){
                LOGGER.info("Data Not Found");
            }
            response.setContent(p_DATA);
            response.setResponseData(new ResponseData(EResponseCode.RC_SUCCESS.getResponseCode(), (EResponseCode.RC_SUCCESS.getResponseMsg())));
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
        }
        return response;
    }

    @Override
    public GenericListResponseDTO constructListFindResponse(List<DATA> p_DATA) throws EndPointException {
        GenericListResponseDTO responseDTO = new GenericListResponseDTO();
        responseDTO.setResponseData(new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg()));
        try{
            if (p_DATA.size() > 0){
                responseDTO.setContent(p_DATA);
                responseDTO.setResponseData(new ResponseData(EResponseCode.RC_SUCCESS.getResponseCode(), (EResponseCode.RC_SUCCESS.getResponseMsg())));
            }else{
            	responseDTO.setResponseData(new ResponseData(EResponseCode.RC_DATA_IS_EMPTY.getResponseCode(), (EResponseCode.RC_DATA_IS_EMPTY.getResponseMsg())));
                LOGGER.info("Data Not Found");
            }
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
        }
        return responseDTO;
    }

    @Override
    public GenericListResponseDTO constructDTOListFindResponse(List<?> p_DATA) throws EndPointException {
        List<?> response;
        GenericListResponseDTO responseDTO = new GenericListResponseDTO();
        responseDTO.setResponseData(new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg()));
        try{
            if (p_DATA.size() > 0){
                response = p_DATA;
                responseDTO.setContent(response);
                responseDTO.setResponseData(new ResponseData(EResponseCode.RC_SUCCESS.getResponseCode(), (EResponseCode.RC_SUCCESS.getResponseMsg())));
            }else{
            	responseDTO.setResponseData(new ResponseData(EResponseCode.RC_DATA_IS_EMPTY.getResponseCode(), (EResponseCode.RC_DATA_IS_EMPTY.getResponseMsg())));
                LOGGER.info("Data Not Found");
            }
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
        }
        return responseDTO;
    }

    @Override
    public Page<DATA> constructPaginationResponse(Page<DATA> p_DATAPage) {
        try{
            if (p_DATAPage == null){
                LOGGER.info("Data Not Found");
            }
            return p_DATAPage;
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
            return null;
        }
    }

    @Override
    public Page<?> constructDTOPaginationResponse(Page<?> p_DATAPage) throws EndPointException {
        try{
            if (p_DATAPage == null){
                LOGGER.info("Data Not Found");
            }
            return p_DATAPage;
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
            return null;
        }
    }

    @Override
    public ResponseData constructSimpleTransactionResponse(ResponseData p_ResponseData) {
        try{
            if (p_ResponseData == null){
                LOGGER.info("Data Not Found");
            }
            return p_ResponseData;
        } catch (Exception e) {
            LOGGER.error("Error Scaffolding EnPoint {}", e);
            return new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg());
        }
    }
}
