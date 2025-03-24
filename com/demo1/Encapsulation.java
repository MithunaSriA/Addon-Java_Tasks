
package com.demo1;
import java.util.Date;
public class Encapsulation {
	private String username;
	private String password;
	private String email;
	private String address;
	private long mobileNumber;
	private Date createAt;
	private Date updateAt;
	private boolean isActive;
	
    public String getUsername() {
    	return username;
    }
	public void setUsername(String username) {
		this.username=username;
	// this keyword is used to denote public
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber=mobileNumber;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
    public void setCreateAt(Date createAt) {
    	this.createAt=createAt;
	}
	
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt=updateAt;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive=isActive;
	}
}

