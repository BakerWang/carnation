package com.sinco.carnation.shop.model;

import com.sinco.mybatis.dal.model.BaseModel;

import java.math.BigDecimal;
import java.util.Date;

public class PredepositLog extends BaseModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**  **/
	private Long id;

	/**  **/
	private Date addTime;

	/**  **/
	private Boolean deleteStatus;

	/** 日志操作金额 **/
	private BigDecimal pdLogAmount;

	/** 操作类型，分为充值、提现、消费、兑换金币、人工操作 **/
	private String pdOpType;

	/** 预存款类型，分为可用云豆，冻结云豆 **/
	private String pdType;

	/** 余额 **/
	private BigDecimal balance;

	/** 操作管理员 **/
	private Long pdLogAdminId;

	/** 日志操作用户 **/
	private Long pdLogUserId;

	/** 对应的预存款记录 **/
	private Long predepositId;

	/** 日志信息 **/
	private String pdLogInfo;

	/** 用户角色标识 0.个人 1.供应商 2.商户 3.运营商 **/
	private Long userCode;

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Boolean getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Boolean deleteStatus) {
		this.deleteStatus = deleteStatus;
	}

	public BigDecimal getPdLogAmount() {
		return pdLogAmount;
	}

	public void setPdLogAmount(BigDecimal pdLogAmount) {
		this.pdLogAmount = pdLogAmount;
	}

	public String getPdOpType() {
		return pdOpType;
	}

	public void setPdOpType(String pdOpType) {
		this.pdOpType = pdOpType;
	}

	public String getPdType() {
		return pdType;
	}

	public void setPdType(String pdType) {
		this.pdType = pdType;
	}

	public Long getPdLogAdminId() {
		return pdLogAdminId;
	}

	public void setPdLogAdminId(Long pdLogAdminId) {
		this.pdLogAdminId = pdLogAdminId;
	}

	public Long getPdLogUserId() {
		return pdLogUserId;
	}

	public void setPdLogUserId(Long pdLogUserId) {
		this.pdLogUserId = pdLogUserId;
	}

	public Long getPredepositId() {
		return predepositId;
	}

	public void setPredepositId(Long predepositId) {
		this.predepositId = predepositId;
	}

	public String getPdLogInfo() {
		return pdLogInfo;
	}

	public void setPdLogInfo(String pdLogInfo) {
		this.pdLogInfo = pdLogInfo;
	}

	/** 用户角色标识 0.个人 1.供应商 2.商户 3.运营商 **/
	public Long getUserCode() {
		return userCode;
	}

	/** 用户角色标识 0.个人 1.供应商 2.商户 3.运营商 **/
	public void setUserCode(Long userCode) {
		this.userCode = userCode;
	}
}