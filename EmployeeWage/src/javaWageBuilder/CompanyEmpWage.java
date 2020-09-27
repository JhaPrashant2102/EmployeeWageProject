
package javaWageBuilder;
import java.util.*;

public class CompanyEmpWage {

	// Variables
	public final String company;
	public final int empRateHour;
	public final int maxWorkingDays;
	public final int maxWorkingHours;
	public int totalPayOfEmployee;
	
	//to store daily wages of the employee
	public ArrayList<Integer> dailyWageList;

	// Constructor
	public CompanyEmpWage(String company, int empRateHour, int maxWorkingDays, int maxWorkingHours) {
		//super();
		this.company = company;
		this.empRateHour = empRateHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.totalPayOfEmployee = 0;
		dailyWageList = new ArrayList<Integer>();
	}

	//Setter
	public void setTotalPayOfEmployee(int totalPayOfEmployee) {
		this.totalPayOfEmployee = totalPayOfEmployee;
	}
	
	//print function
	@Override
	public String toString() {
		return "total wage of employee in " + this.company + " is "+this.totalPayOfEmployee;
	}
	
	
}