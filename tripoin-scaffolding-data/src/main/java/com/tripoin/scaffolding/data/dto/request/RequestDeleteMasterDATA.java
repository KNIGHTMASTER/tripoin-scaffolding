package com.tripoin.scaffolding.data.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 */
public class RequestDeleteMasterDATA implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5685280869775238598L;	
	private ArrayList<Long> ids;

	@JsonProperty("ids")
	public ArrayList<Long> getIds() {
		return ids;
	}

	public void setIds(ArrayList<Long> ids) {
		this.ids = ids;
	}
	
	
}
