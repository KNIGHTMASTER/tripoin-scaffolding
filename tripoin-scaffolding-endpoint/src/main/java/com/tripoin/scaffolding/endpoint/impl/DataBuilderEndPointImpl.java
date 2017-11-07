package com.tripoin.scaffolding.endpoint.impl;

import com.tripoin.scaffolding.data.constant.EResponseCode;
import com.tripoin.scaffolding.data.dto.ResponseData;
import com.tripoin.scaffolding.data.dto.request.PaginationDTO;
import com.tripoin.scaffolding.endpoint.IDataBuilderEndPoint;
import com.tripoin.scaffolding.endpoint.IEndPointConstant;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

/**
 * created on 10/17/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@Service
public class DataBuilderEndPointImpl implements IDataBuilderEndPoint {

    @Override
    public PageRequest buildPageRequest(PaginationDTO p_PaginationDTO) {
        return new PageRequest(
                p_PaginationDTO.getOffset(),
                p_PaginationDTO.getLimit(),
                Sort.Direction.fromString(p_PaginationDTO.getOrder()),
                p_PaginationDTO.getSort()
        );
    }

    @Override
    public PaginationDTO buildDTOPagination(int p_Limit, int p_Offset, String p_Order, String p_Sort) {
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO.setLimit(p_Limit);
        paginationDTO.setOffset(p_Offset);
        paginationDTO.setOrder(p_Order);
        paginationDTO.setSort(p_Sort);
        return paginationDTO;
    }

    @Override
    public ResponseData buildSuccessResponse() {
        return new ResponseData(EResponseCode.RC_SUCCESS.getResponseCode(), EResponseCode.RC_SUCCESS.getResponseMsg());
    }

    @Override
    public ResponseData buildFailedResponse() {
        return new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg());
    }
    
    @Override
    public ResponseData buildFailedResponse(String p_ErrorMessage) {
        return new ResponseData(EResponseCode.RC_FAILURE.getResponseCode(), EResponseCode.RC_FAILURE.getResponseMsg().concat(IEndPointConstant.Common.Punctuation.HYPHEN).concat(p_ErrorMessage));
    }
}
