package com.tripoin.scaffolding.data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author <a href="mailto:ridla.fadilah@gmail.com">Ridla Fadilah</a>
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@MappedSuperclass
public abstract class AAuditTrail extends ABaseAuditTrail {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5401587542468260575L;

	/**
	 * Before persist data into Database
	 */
	@PrePersist
	public void onPrePersist(){
		setCreatedBy(IApplicationConstant.onPrePersist.CREATED_BY);
		setStatus(IApplicationConstant.Common.GeneralValue.ONE);
		setCreatedOn(new Date());
		setCreatedIP(IApplicationConstant.onPrePersist.CREATED_IP);
		setCreatedPlatform(IApplicationConstant.onPrePersist.CREATED_PLATFORM);
	}

	/**
	 * Before update data into db
	 */
	@PreUpdate
	public void onPreUpdate(){
		setModifiedOn(new Date());
		setModifiedBy(IApplicationConstant.onPreUpdate.MODIFIED_BY);
		setModifiedIP(IApplicationConstant.onPreUpdate.MODIFIED_IP);
		setModifiedPlatform(IApplicationConstant.onPreUpdate.MODIFIED_PLATFORM);
	}

	@Column(name="status")
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name="remarks", length=255)
	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Column(name="created_by", length=150)
	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	@Column(name="created_ip", length=150)
	public String getCreatedIP() {
		return createdIP;
	}

	public void setCreatedIP(String createdIP) {
		this.createdIP = createdIP;
	}

	@Column(name="created_on")
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Column(name="modified_on")
	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	@Column(name="created_platform")
	public String getCreatedPlatform() {
		return createdPlatform;
	}

	public void setCreatedPlatform(String createdPlatform) {
		this.createdPlatform = createdPlatform;
	}

	@Column(name="modified_by", length=150)
	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@Column(name="modified_ip", length=150)
	public String getModifiedIP() {
		return modifiedIP;
	}

	public void setModifiedIP(String modifiedIP) {
		this.modifiedIP = modifiedIP;
	}

	@Column(name="modified_platform")
	public String getModifiedPlatform() {
		return modifiedPlatform;
	}

	public void setModifiedPlatform(String modifiedPlatform) {
		this.modifiedPlatform = modifiedPlatform;
	}
	
}
