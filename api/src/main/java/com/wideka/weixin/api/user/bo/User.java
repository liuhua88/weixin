package com.wideka.weixin.api.user.bo;

import com.alibaba.fastjson.annotation.JSONField;
import com.wideka.weixin.framework.bo.Err;

/**
 * 
 * @author JiakunXu
 * 
 */
public class User extends Err {

	private static final long serialVersionUID = 4716372335911707525L;

	/**
	 * 成员UserID.
	 */
	@JSONField(name = "UserId")
	private String userId;

	/**
	 * 手机设备号(由微信在安装时随机生成，删除重装会改变，升级不受影响).
	 */
	@JSONField(name = "DeviceId")
	private String deviceId;

	/**
	 * 非企业成员的标识，对当前企业号唯一.
	 */
	@JSONField(name = "OpenId")
	private String openId;

	@JSONField(name = "status")
	private int status;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}