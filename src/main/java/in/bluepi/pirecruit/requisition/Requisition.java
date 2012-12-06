package in.bluepi.pirecruit.requisition;

import in.bluepi.pirecruit.enums.ApplicationStatus;
import in.bluepi.pirecruit.enums.UtilEnum;
import in.bluepi.pirecruit.repository.requisition.VacancySetRepositiory;
import in.bluepi.pirecruit.user.candidate.Candidate;
import in.bluepi.pirecruit.user.employee.Employee;

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
	//	I think we should remove this method and place some other method which will return the list of all available Templates and the selected one will then be mapped to the vacancySetDTO.
	//TODO: If this is initiatlization of the requisition from the template should this not be rewritten as a chained
	//	please elaborate the above said.
	//TODO: constructor?

	/**
	 * 
	 * @param description
	 */
	public void addDescriptionTemplate(JobDescription description){

	}

	/**
	 * 
	 * @param description
	 */
	public void saveJobDescriptionAsTemplate(JobDescription description){

	}

	public Set<JobDescription> showJobDescriptionsFromTemplate(){
		Set<JobDescription> jobDescriptions = new HashSet<JobDescription>();
//		all the job descriptions from DB will be loaded here and returned.
		return jobDescriptions;
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
	public void changeApplicationStatus(JobApplication application, ApplicationStatus applicationStatus){

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
	public Set<JobApplication> viewApplications(long vacancySetId,ApplicationStatus applicationStatus){
		VacancySet vacancySet=new VacancySetRepositiory().getVacancySetById(vacancySetId);
		Set<JobApplication> application=null;//getApplicationByVacancyId(vacancySet)
		
		return null;
	}

	/**
	 * 
	 * @param applicationStatus
	 */
	public Set<JobApplication> viewApplications(ApplicationStatus applicationStatus){
		return null;
	}

	/**
	 * 
	 * @param Candidate
	 */
	public Set<JobApplication> viewApplications(Candidate Candidate){
		return null;
	}
	/**
	 * 
	 * @param vacancySet
	 */
	public Set<JobApplication> viewApplications(VacancySet vacancySet){
		return null;
	}

	/**
	 * 
	 * @param Application
	 */
	public ApplicationStatus viewApplicationStatus(JobApplication jobApplication){
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
}//end Requisition
