package com.callor.student.model;

public class StudentVO {
	
	private String stNum;
	private String stName;
	private String stDep;
	private String stGrade;
	private String stGroup;
	private String stAddr;
	private String stHP;
	
	public StudentVO() {
	}
	
	public StudentVO(String stNum, String stName, String stDep, String stGrade, String stGroup, String stAddr,
			String stHP) {
		super();
		this.stNum = stNum;
		this.stName = stName;
		this.stDep = stDep;
		this.stGrade = stGrade;
		this.stGroup = stGroup;
		this.stAddr = stAddr;
		this.stHP = stHP;
	}

	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getStDep() {
		return stDep;
	}
	public void setStDep(String stDep) {
		this.stDep = stDep;
	}
	public String getStGrade() {
		return stGrade;
	}
	public void setStGrade(String stGrade) {
		this.stGrade = stGrade;
	}
	public String getStGroup() {
		return stGroup;
	}
	public void setStGroup(String stGroup) {
		this.stGroup = stGroup;
	}
	public String getStAddr() {
		return stAddr;
	}
	public void setStAddr(String stAddr) {
		this.stAddr = stAddr;
	}
	public String getStHP() {
		return stHP;
	}
	public void setStHP(String stHP) {
		this.stHP = stHP;
	}
	@Override
	public String toString() {
		return "StudentVO [stNum=" + stNum + ", stName=" + stName + ", stDep=" + stDep + ", stGrade=" + stGrade
				+ ", stGroup=" + stGroup + ", stAddr=" + stAddr + ", stHP=" + stHP + "]";
	}
	
	

}
