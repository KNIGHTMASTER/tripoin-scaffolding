package com.tripoin.scaffolding.endpoint;

import com.tripoin.scaffolding.data.dto.ResponseData;
import com.tripoin.scaffolding.data.dto.request.RequestDeleteById;
import com.tripoin.scaffolding.endpoint.exception.EndPointException;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * created on 10/15/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 * @param <ID>
 */
public interface ITransactionEndPoint<DATA, ID extends Serializable> extends IApprovalEndPoint, ICancellationEndPoint {

    @ResponseBody
    @PutMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_UPDATE, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData updateData(@RequestBody DATA p_DATA) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_INSERT, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData insertData(@RequestBody DATA p_DATA) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_INSERT_AND_FLUSH, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData insertAndFlushData(@RequestBody DATA p_DATA) throws EndPointException;

    @ResponseBody
    @PostMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_INSERT_COLLECTION, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData insertCollection(@RequestBody List<DATA> p_DATAs) throws EndPointException;

    @ResponseBody
    @DeleteMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_DELETE, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData delete(@RequestBody RequestDeleteById p_ID) throws EndPointException;

    @ResponseBody
    @DeleteMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_DELETE_BY_ENTITY, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData deleteByEntity(@RequestBody String p_Code) throws EndPointException;

    @ResponseBody
    @DeleteMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_DELETE_COLLECTION, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData deleteCollection(@RequestBody List<String> p_Codes) throws EndPointException;

    @ResponseBody
    @DeleteMapping(value = IEndPointConstant.PathName.PathScaffolding.PATH_DELETE_COLLECTION_BY_ID, produces = IEndPointConstant.Common.APPLICATION_JSON)
    ResponseData deleteCollectionById(@RequestBody List<ID> p_ID)  throws EndPointException;
}
