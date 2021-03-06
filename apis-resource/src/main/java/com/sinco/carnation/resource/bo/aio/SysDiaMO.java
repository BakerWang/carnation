package com.sinco.carnation.resource.bo.aio;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sinco.api.annotation.DomainMapping;
import com.sinco.api.annotation.FieldMapping;

@JsonAutoDetect(getterVisibility = Visibility.NONE)
@DomainMapping(domainName = "AioChol", desc = "一体机血氧表")
public class SysDiaMO {
	@JsonProperty("id")
	@FieldMapping(desc = "id")
	private Long id;
	@JsonProperty("syncTime")
	@FieldMapping(desc = "数据同步时间")
	private String syncTime;
	@JsonProperty("idCard")
	@FieldMapping(desc = "用户身份证号码")
	private String idCard;
	@JsonProperty("sysDia")
	@FieldMapping(desc = "收缩压/舒张压")
	private String sysDia;
	@JsonProperty("pr")
	@FieldMapping(desc = "脉率")
	private String pr;
	@JsonProperty("time")
	@FieldMapping(desc = "测量的日期和时间")
	private String time;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSyncTime() {
		return syncTime;
	}

	public void setSyncTime(String syncTime) {
		this.syncTime = syncTime;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getSysDia() {
		return sysDia;
	}

	public void setSysDia(String sysDia) {
		this.sysDia = sysDia;
	}

	public String getPr() {
		return pr;
	}

	public void setPr(String pr) {
		this.pr = pr;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
