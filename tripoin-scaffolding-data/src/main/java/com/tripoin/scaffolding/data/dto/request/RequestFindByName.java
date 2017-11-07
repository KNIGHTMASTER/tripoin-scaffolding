package com.tripoin.scaffolding.data.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@XmlRootElement
public class RequestFindByName implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2523385016839756736L;

	private String name;

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "RequestByName [name=" + name + "]";
	}	
}
