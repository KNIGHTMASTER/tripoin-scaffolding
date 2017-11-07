package com.tripoin.scaffolding.data.dto.response;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * 
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 *
 */
@XmlRootElement
public class MasterResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -889033211964744624L;
	private String code;
	private String name;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MasterDataResponse{" +
				"code='" + code + '\'' +
				", name='" + name + '\'' +
				'}';
	}
}
