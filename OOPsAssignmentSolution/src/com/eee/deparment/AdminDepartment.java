package com.eee.deparment;

public class AdminDepartment extends SuperDepartment {

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submissio";
	}

	public String getWorkDeadline() {
		return "Complete by EOD ";
	}
}
