/**
 * 
 */
package javaWageBuilder;

import java.util.LinkedList;

/**
 * @author prashant
 *
 */
public class EmpWageBuilder implements APIUSeCase {
	public static final int isFullTime = 1;
	public static final int isPartTime = 2;
	
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> wageList;
	
	public EmpWageBuilder() {
		wageList = new LinkedList<CompanyEmpWage>();
	}
	
	// overriding addCompanyEmpWage
	public void addCompanyEmpWage(String company, int empRateHour, int maxWorkingDays, int maxWorkingHours) {
		CompanyEmpWage object1 = new CompanyEmpWage(company,empRateHour,maxWorkingDays,maxWorkingHours);
		wageList.add(object1);
	}
	
}
