package com.tripoin.scaffolding.data.dto.response;

import com.tripoin.scaffolding.data.dto.ResponseData;

import java.io.Serializable;

/**
 * Created on 8/31/17.
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DTO>
 */
public class GenericSingleDATAResponseDTO<DTO> implements Serializable {
    /**
     *
     *
     */
    private static final long serialVersionUID = -8717118725246242430L;

    private DTO content;
    private ResponseData responseData;

    public DTO getContent() {
        return content;
    }

    public void setContent(DTO content) {
        this.content = content;
    }

    public ResponseData getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseData responseData) {
        this.responseData = responseData;
    }
}
