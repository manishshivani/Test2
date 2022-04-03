package Driver;

import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;


public class Main {
	
	//Main Method
	public static void main(String [] args) {
		
		//Create object of AdminDepartment class and Call AdminDepartment functions
		AdminDepartment ad=new AdminDepartment();
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");
		
		//Create object of HrDepartment class and Call HrDepartment functions
		HrDepartment hrd = new HrDepartment();
		System.out.println("Welcome to "+hrd.departmentName());
		System.out.println(hrd.doActivity());
		System.out.println(hrd.getTodaysWork());
		System.out.println(hrd.getWorkDeadline());
		System.out.println(hrd.isTodayAHoliday());
		System.out.println("\n");
		
		//Create object of TechDepartment class and Call TechDepartment functions
		TechDepartment td = new TechDepartment();
		System.out.println("Welcome to "+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());	
		System.out.println("\n");

		
	}

}
