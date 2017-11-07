package com.tripoin.scaffolding.data.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * created on 10/18/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
public class BaseRequestDTO implements Serializable {
    private static final long serialVersionUID = 5376995166448048391L;

    private Long id;
    private String code;
    private String name;
    private String remarks;
    private Integer status;
    private String createdBy;
    private String createdIp;
    private Date createdOn;
    private String createdPlatform;
    private String modifiedBy;
    private String modifiedIp;
    private Date modifiedOn;
    private String modifiedPlatform;

    @JsonProperty("com")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("created_by")
    public String getCreatedIp() {
        return createdIp;
    }

    public void setCreatedIp(String createdIp) {
        this.createdIp = createdIp;
    }

    @JsonProperty("created_on")
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @JsonProperty("created_platform")
    public String getCreatedPlatform() {
        return createdPlatform;
    }

    public void setCreatedPlatform(String createdPlatform) {
        this.createdPlatform = createdPlatform;
    }

    @JsonProperty("modified_by")
    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @JsonProperty("modified_ip")
    public String getModifiedIp() {
        return modifiedIp;
    }

    public void setModifiedIp(String modifiedIp) {
        this.modifiedIp = modifiedIp;
    }

    @JsonProperty("modified_on")
    public Date getModifiedOn() {
        return modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @JsonProperty("modified_platform")
    public String getModifiedPlatform() {
        return modifiedPlatform;
    }

    public void setModifiedPlatform(String modifiedPlatform) {
        this.modifiedPlatform = modifiedPlatform;
    }

    @Override
    public String toString() {
        return "BaseUpdateDTO{" +
                "com=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
