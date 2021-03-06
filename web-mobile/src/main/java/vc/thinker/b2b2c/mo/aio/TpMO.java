package vc.thinker.b2b2c.mo.aio;


/**
 * 一体机血氧表
 * 
 * @author yuanming
 * 
 */
public class TpMO {
	private Long id;
	// 数据同步时间
	private String syncTime;
	// 用户身份证号码
	private String idCard;
	// 体温
	private String tp;
	// 脉率
	private String pr;
	// 测量的日期
	private String date;
	// 测量的时间
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

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
