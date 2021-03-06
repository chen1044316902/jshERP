package com.jsh.erp.datasource.entities;

import java.util.Date;

public class Log {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.userID
     *
     * @mbggenerated
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.operation
     *
     * @mbggenerated
     */
    private String operation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.clientIP
     *
     * @mbggenerated
     */
    private String clientip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.createtime
     *
     * @mbggenerated
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.status
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.contentdetails
     *
     * @mbggenerated
     */
    private String contentdetails;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column jsh_log.tenant_id
     *
     * @mbggenerated
     */
    private Long tenantId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.id
     *
     * @return the value of jsh_log.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.id
     *
     * @param id the value for jsh_log.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.userID
     *
     * @return the value of jsh_log.userID
     *
     * @mbggenerated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.userID
     *
     * @param userid the value for jsh_log.userID
     *
     * @mbggenerated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.operation
     *
     * @return the value of jsh_log.operation
     *
     * @mbggenerated
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.operation
     *
     * @param operation the value for jsh_log.operation
     *
     * @mbggenerated
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.clientIP
     *
     * @return the value of jsh_log.clientIP
     *
     * @mbggenerated
     */
    public String getClientip() {
        return clientip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.clientIP
     *
     * @param clientip the value for jsh_log.clientIP
     *
     * @mbggenerated
     */
    public void setClientip(String clientip) {
        this.clientip = clientip == null ? null : clientip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.createtime
     *
     * @return the value of jsh_log.createtime
     *
     * @mbggenerated
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.createtime
     *
     * @param createtime the value for jsh_log.createtime
     *
     * @mbggenerated
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.status
     *
     * @return the value of jsh_log.status
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.status
     *
     * @param status the value for jsh_log.status
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.contentdetails
     *
     * @return the value of jsh_log.contentdetails
     *
     * @mbggenerated
     */
    public String getContentdetails() {
        return contentdetails;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.contentdetails
     *
     * @param contentdetails the value for jsh_log.contentdetails
     *
     * @mbggenerated
     */
    public void setContentdetails(String contentdetails) {
        this.contentdetails = contentdetails == null ? null : contentdetails.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.remark
     *
     * @return the value of jsh_log.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.remark
     *
     * @param remark the value for jsh_log.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column jsh_log.tenant_id
     *
     * @return the value of jsh_log.tenant_id
     *
     * @mbggenerated
     */
    public Long getTenantId() {
        return tenantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column jsh_log.tenant_id
     *
     * @param tenantId the value for jsh_log.tenant_id
     *
     * @mbggenerated
     */
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }
}