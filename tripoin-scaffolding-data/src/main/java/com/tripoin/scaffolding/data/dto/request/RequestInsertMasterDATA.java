package com.tripoin.scaffolding.data.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 * @param <DATA>
 * <p>
 * 		DATA should not be with ID
 * </p>
 */
public class RequestInsertMasterDATA<DATA> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1593705957645650867L;
	private ArrayList<DATA> datas;
	
	@JsonProperty("datas")
	public ArrayList<DATA> getDatas() {
		return datas;
	}
	public void setDatas(ArrayList<DATA> datas) {
		this.datas = datas;
	}
	
	

}
