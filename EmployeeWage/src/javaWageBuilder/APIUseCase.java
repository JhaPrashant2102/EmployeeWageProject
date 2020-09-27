/**
 * 
 */
package javaWageBuilder;

/**
 * @author prashant
 *
 */
public interface APIUseCase {
	
	//declaring some function to be used by builder class
	public void addCompanyEmpWage(String company, int empRateHour, int maxWorkingDays, int maxWorkingHours);
	public void calculateWage();
}
