package com.eee.client;

import com.eee.deparment.AdminDepartment;
import com.eee.deparment.HrDepartment;
import com.eee.deparment.SuperDepartment;
import com.eee.deparment.TechDepartment;

public class MailClient {

	public static void main(String[] args) {
		SuperDepartment adminDepartment = new AdminDepartment();
		HrDepartment hrDepartment = new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();

		System.out.println("Welcome to " + adminDepartment.departmentName());
		System.out.println(adminDepartment.getTodaysWork());
		System.out.println(adminDepartment.getWorkDeadline());
		System.out.println(adminDepartment.isTodayAHoliday() + "\n");
		System.out.println("Welcome to " + hrDepartment.departmentName());
		System.out.println(hrDepartment.doActivity());
		System.out.println(hrDepartment.getTodaysWork());
		System.out.println(hrDepartment.getWorkDeadline());
		System.out.println(hrDepartment.isTodayAHoliday() + "\n");
		System.out.println("Welcome to " + techDepartment.departmentName());
		System.out.println(techDepartment.getTodaysWork());
		System.out.println(techDepartment.getWorkDeadline());
		System.out.println(techDepartment.doActivity());
		System.out.println(techDepartment.isTodayAHoliday());
	}

}
