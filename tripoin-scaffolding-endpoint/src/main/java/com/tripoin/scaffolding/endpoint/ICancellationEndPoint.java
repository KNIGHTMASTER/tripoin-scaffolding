package com.tripoin.scaffolding.endpoint;

import com.tripoin.scaffolding.data.dto.ResponseData;
import com.tripoin.scaffolding.data.dto.request.RequestID;
import com.tripoin.scaffolding.endpoint.exception.EndPointException;
import com.tripoin.scaffolding.service.exception.ServiceException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * created on 10/17/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public interface ICancellationEndPoint {

    @ResponseBody
    @PutMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_CANCEL_ALL, produces = IEndPointConstant.Common.APPLICATION_JSON)
    @Transactional
    ResponseData cancelAll() throws EndPointException, ServiceException;

    @ResponseBody
    @PutMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_CANCEL_SINGLE_DATA, produces = IEndPointConstant.Common.APPLICATION_JSON)
    @Transactional
    ResponseData cancelSingleData(@RequestBody RequestID p_RequestID) throws EndPointException, ServiceException;
}
