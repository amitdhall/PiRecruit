package in.bluepi.pirecruit.requisition;

import in.bluepi.pirecruit.user.candidate.Candidate;
import in.bluepi.pirecruit.user.employee.Employee;
import in.bluepi.pirecruit.util.UtilEnum;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @created 21-Nov-2012 12:35:06 PM
 */
public class Requisition {
	
	int ID;
	Date closingDate;
	Date openingDate;
	Employee createdByEmp;
	String projectName;
	UtilEnum.reqStatus reqStatus;
	
	public Set <VacancySet> vacancySet1 = new HashSet<VacancySet>();
	
	

	public Requisition(int ID, Date closingDate,Date openingDate, Employee createdByEmp,String projectName, UtilEnum.reqStatus reqStatus){
//		vacancySet = new HashSet<VacancySet>();
		this.ID = ID;
		this.closingDate = closingDate;
		this.createdByEmp = createdByEmp;
		this.openingDate = openingDate;
		this.projectName = projectName;
		this.reqStatus = reqStatus;
	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param discription
	 */
	public void addDiscriptionTemplate(Description discription){

	}

	/**
	 * 
	 * @param Candidate
	 * @param VacancySet
	 */
	public boolean applyForJob(Candidate Candidate,VacancySet VacancySet){
		return false;
	}
	/**
	 * 
	 * @param Candidate
	 * @param VacancySet
	 */
	public VacancySet createVacancySet(VacancySetDTO vacancySetDTO){
		VacancySet vacancySet = new VacancySet(vacancySetDTO);
		this.vacancySet1.add(vacancySet);
		return vacancySet;
	}

//	/**
//	 * 
//	 * @param Application
//	 * @param applicationStatus
//	 */
//	public void changeApplicationStatus(Application application, UtilEnum.applicationStatus applicationStatus){
//
//	}

	/**
	 * 
	 * @param requisition
	 */
	public void closeRequsition(Requisition requisition){

	}

	/**
	 * 
	 * @param vacancySet
	 */
	public void createVacancies(VacancySet vacancySet){

	}

	/**
	 * 
	 * @param description
	 */
	public void deleteDescriptionTemplate(Description description){

	}

	/**
	 * 
	 * @param designation
	 */
	public void deleteVacancies(){

	}

	/**
	 * 
	 * @param description
	 */
	public void editDescriptionTemplate(Description description){

	}

	/**
	 * 
	 * @param vacancySet
	 */
	public Set<Application> viewApplications(VacancySet vacancySet){
		return null;
	}

	/**
	 * 
	 * @param applicationStatus
	 */
	public Set<Application> viewApplications(UtilEnum.applicationStatus applicationStatus){
		return null;
	}

	/**
	 * 
	 * @param Candidate
	 */
	public Set<Application> viewApplications(Candidate Candidate){
		return null;
	}

	/**
	 * 
	 * @param Application
	 */
	public UtilEnum.applicationStatus viewApplicationStatus(Application application){
		return null;
	}

	public <Set>Requisition viewRequisition(){
		return null;
	}

	/**
	 * 
	 * @param Req
	 */
	public Set<VacancySet> viewVacancies(Requisition Req){
		return null;
	}
	@Override
	public String toString() {
		
		return "Req "+ID;
	}
}//end Requisition