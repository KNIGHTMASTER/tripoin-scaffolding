package com.tripoin.scaffolding.data.dto.request;

import java.io.Serializable;

/**
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class AuthTokenDataRequest implements Serializable {
	/**
	 *
	 *
	 */
	private static final long serialVersionUID = 341821896186353882L;
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AuthTokenDataRequest{" +
				"userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
}
