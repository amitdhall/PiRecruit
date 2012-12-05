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
	
	int id;
	Date closingDate;
	Date openingDate;
	Employee createdByEmp;
	String projectName;
	UtilEnum.reqStatus reqStatus;

	//TODO : why is this thing called vacancySet?
//	the name is now changed to setOfVacancySet. So as user can get the meaning by reading name.
	public Set <VacancySet> setOfVacancySet = new HashSet<VacancySet>();
	
	public void Requisition(){
		
	}
    //TODO : Is this the constructor that would be used always? Hibernate would require a default constructor.
//	Above we now have a default constructor and below thr is a method for intializing the values.   
	public void initReq(int id, Date closingDate,Date openingDate, Employee createdByEmp,String projectName, UtilEnum.reqStatus reqStatus){
//		vacancySet = new HashSet<VacancySet>();
		this.id = id;
		this.closingDate = closingDate;
		this.createdByEmp = createdByEmp;
		this.openingDate = openingDate;
		this.projectName = projectName;
		this.reqStatus = reqStatus;
	}
    
    //TODO: Description or discription? What is description? Give it a proper name?
//	It is now called as JobDescription.
    //TODO: What does the below method do? adds a description template to a requisition?
//	It will save the job templates. It will be done soon
    //TODO: If this is initiatlization of the requisition from the template should this not be rewritten as a chained
//	please elaborate the above said.
    //TODO: constructor?

	/**
	 * 
	 * @param description
	 */
	public void addDescriptionTemplate(JobDescription description){

	}


    //TODO: These method names are very confusing? Does the requistion apply for a job? WHy do we have a method called
    //applyForJob in the Requisition class? Should this be instead called - processApplication?
	
//	Sir I think apply for job should be there in the Candidate.
//	and processApplication should be here in Requisition so that for a particular requisition we can find out the applications came in.


	/**
	 * 
	 * @param Candidate
	 * @param VacancySet
	 */
	public boolean applyForJob(Candidate Candidate,VacancySet VacancySet){
		return false;
	}


	/**
     * TODO: Correct the javadocs
     * I like the flow here :-)   HM.openRequisition -->req.createVacancySet
     *
     */
	public VacancySet createVacancySet(VacancySetDTO vacancySetDTO){
		VacancySet vacancySet = new VacancySet(vacancySetDTO);
		this.setOfVacancySet.add(vacancySet);
		return vacancySet;
	}

	/**
	 * 
	 * @param Application
	 * @param applicationStatus
	 */
	public void changeApplicationStatus(Application application, UtilEnum.applicationStatus applicationStatus){

	}

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
	public void deleteDescriptionTemplate(JobDescription description){

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
	public void editDescriptionTemplate(JobDescription description){

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
		
		return "Req "+ id;
	}
}//end Requisition