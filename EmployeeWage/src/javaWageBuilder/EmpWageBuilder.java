/**
 * 
 */
package javaWageBuilder;

import java.util.*;

/**
 * @author prashant
 *
 */
public class EmpWageBuilder implements APIUseCase {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> wageList;
	
	public EmpWageBuilder() {
		wageList = new LinkedList<>();
	}
	
	// overriding addCompanyEmpWage
	public void addCompanyEmpWage(String company, int empRateHour, int maxWorkingDays, int maxWorkingHours) {
		CompanyEmpWage object1 = new CompanyEmpWage(company,empRateHour,maxWorkingDays,maxWorkingHours);
		wageList.add(object1);
	}
	public void calculateWage() {
		for(int i = 0; i<wageList.size();i++) {
			CompanyEmpWage object1 =  wageList.get(i);
			object1.setTotalPayOfEmployee(this.calculateWage(object1));
			System.out.println(object1);
		}
	}
	
	//Calculate wage with return type
	public int calculateWage(CompanyEmpWage object1) {
		int empCheck, dailyHour=0,totalEmpHours=0,totalWorkingDays=0;
		while(totalEmpHours<=object1.maxWorkingHours&&totalWorkingDays<=object1.maxWorkingDays) {
			empCheck = new Random().nextInt(3);
			totalWorkingDays++;
			switch(empCheck) {
			case isFullTime:
				dailyHour = 8;
				break;
			case isPartTime:
				dailyHour = 4;
				break;
			default:
				dailyHour = 0;
				break;
			}
			totalEmpHours+=dailyHour;
			object1.dailyWageList.add(dailyHour*object1.empRateHour);
		}
		return totalEmpHours*object1.empRateHour;
		
	}
	public static void main(String args[]) {
		EmpWageBuilder master = new EmpWageBuilder();
		master.addCompanyEmpWage("Reliance",10, 20, 100);
		master.addCompanyEmpWage("Jio", 10, 22, 120);
		master.calculateWage();
	}
	
}
