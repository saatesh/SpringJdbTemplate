package com.sisco;

public class Employee {
	int eid;
	String ename;
	double esal;
	String elocation;
	
	
	
	@Override
	public String toString() {
		return "[eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", elocation=" + elocation + "]";
	}
	public Employee(int eid, String ename, double esal, String elocation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.elocation = elocation;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getElocation() {
		return elocation;
	}
	public void setElocation(String elocation) {
		this.elocation = elocation;
	}
	
	

}
