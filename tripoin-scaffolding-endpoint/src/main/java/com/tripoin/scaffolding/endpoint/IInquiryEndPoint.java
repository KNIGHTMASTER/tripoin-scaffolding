package com.tripoin.scaffolding.endpoint;

import com.tripoin.scaffolding.data.dto.request.*;
import com.tripoin.scaffolding.data.dto.response.GenericListResponseDTO;
import com.tripoin.scaffolding.data.dto.response.GenericSingleDATAResponseDTO;
import com.tripoin.scaffolding.endpoint.exception.EndPointException;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * created on 10/15/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface IInquiryEndPoint {

    @ResponseBody
    @GetMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_ALL, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findAll() throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_ALL_PAGINATION, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public Page<?> findPaginationAll(@RequestBody RequestPaginationAllDTO p_RequestPaginationAll) throws EndPointException;

    /*Property ID*/
    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_ID, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericSingleDATAResponseDTO findById(@RequestBody RequestFindById p_RequestFindById) throws EndPointException;

    /*Property Code*/
    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByCode(@RequestBody RequestFindByCode p_RequestFindByCode) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE_ORDER_BY_ID_ASC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByCodeOrderByIdAsc(@RequestBody RequestFindByCode p_RequestFindByCode) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE_ORDER_BY_CODE_ASC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByCodeOrderByCodeAsc(@RequestBody RequestFindByCode p_RequestFindByCode) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE_ORDER_BY_CODE_DESC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByCodeOrderByCodeDesc(@RequestBody RequestFindByCode p_RequestFindByCode) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_PAGINATION_BY_CODE_ORDER_BY_ID, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public Page<?> findPaginationByCodeOrderByIdAsc(RequestPaginationByCodeDTO p_RequestPaginationByCode) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_PAGINATION_BY_CODE_ORDER_BY_CODE, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public Page<?> findPaginationByCodeOrderByCodeAsc(RequestPaginationByCodeDTO p_RequestPaginationByCode) throws EndPointException;

    /*Property Name*/
    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_NAME, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByName(@RequestBody RequestFindByName p_RequestFindByName) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_NAME_ORDER_BY_ID_ASC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByNameOrderByIdAsc(@RequestBody RequestFindByName p_RequestFindByName) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE_ORDER_BY_NAME_ASC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByNameOrderByNameAsc(@RequestBody RequestFindByName p_RequestFindByName) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_BY_CODE_ORDER_BY_NAME_DESC, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO findByNameOrderByNameDesc(@RequestBody RequestFindByName p_RequestFindByName) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_PAGINATION_BY_NAME_ORDER_BY_ID, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public Page<?> findPaginationByNameOrderByIdAsc(@RequestBody RequestPaginationByNameDTO p_RequestPaginationByName) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_FIND_PAGINATION_BY_NAME_ORDER_BY_NAME, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public Page<?> findPaginationByNameOrderByNameAsc(@RequestBody RequestPaginationByNameDTO p_RequestPaginationByName) throws EndPointException;

    @ResponseBody
    @GetMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_SELECT_LOV, produces = IEndPointConstant.Common.APPLICATION_JSON)
    public GenericListResponseDTO selectLOV() throws EndPointException;
    
    /*@POST
    @Path(PathNameConstant.PathScaffolding.PATH_ADVANCED_PAGINATION)
    @Consumes({ MediaType.APPLICATION_JSON })
    public Response advancedPagination(RequestAdvancedPaginationDTO p_RequestAdvancedPaginationDTO) throws EndPointException;*/
}
