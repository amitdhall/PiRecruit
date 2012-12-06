package in.bluepi.pirecruit.user.employee;

import in.bluepi.pirecruit.enums.ApplicationStatus;
import in.bluepi.pirecruit.enums.RequisitionStatus;
import in.bluepi.pirecruit.requisition.JobApplication;
import in.bluepi.pirecruit.requisition.JobDescription;
import in.bluepi.pirecruit.requisition.Requisition;
import in.bluepi.pirecruit.requisition.RequisitionRepository;
import in.bluepi.pirecruit.requisition.VacancySet;
import in.bluepi.pirecruit.requisition.VacancySetDTO;
import in.bluepi.pirecruit.util.Object2ObjectConversion;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.joda.time.DateTime;

/**
 * @author Amin
 * @version 1.0
 * @created 21-Nov-2012 12:36:13 PM
 */
public class HiringManager extends Employee {

	Requisition requisition;
	Set<Requisition> reqSet = new HashSet<Requisition>();
	RequisitionRepository reqRepo = new RequisitionRepository();

	public HiringManager() {
		// wrap();
	}

	Requisition startNewRequisition(int requisitionID, DateTime closingDate,DateTime openingDate, Employee createdByEmp,String projectName, RequisitionStatus reqStatus){
		requisition = new Requisition();
		requisition.initReq(requisitionID, closingDate, openingDate, createdByEmp, projectName, reqStatus);
		return requisition;
	}
	
	// private void wrap() {
	//
	// Employee emp = new Employee();
	// Date closingDate = new Date("31/01/2013");
	// Date openingDate = new Date("01/01/2013");
	//
	// // for(int i=0;i<1;i++)
	// requisition=reqRepo.createReq(1,
	// closingDate,openingDate,emp,"PWC",RequisitionStatus.PENDING);
	// }

	/**
	 * 
	 * @param vacancySet
	 * @param interviewer
	 */
	public void assignInterviewer(VacancySet vacancySet, Interviewer interviewer) {

	}

	/**
	 * 
	 * @param vacancySet
	 */
	public void setVacancySet(VacancySetDTO vacancySetDTO) {
		requisition.createVacancySet(vacancySetDTO);
	}

	public void changeApplicationStatus() {
		for (VacancySet vacancySet : requisition.setOfVacancySet) {
			Set<JobApplication> applicationSet = requisition
					.viewApplications(vacancySet);
			for (JobApplication application : applicationSet) {
				// condition or by viewing the feedback of application he can
				// make his/her decision
				if (true) {
					requisition.changeApplicationStatus(application,
							ApplicationStatus.SELECTED);
				}
			}
		}
	}

	public void setApplicationPriority() {
		for (VacancySet vacancySet : requisition.setOfVacancySet) {
			Set<JobApplication> applicationSet = requisition
					.viewApplications(ApplicationStatus.SHORTLISTED);
			for (JobApplication application : applicationSet) {
				// some algo will be used to prioritize shortlisted cadidates.
				// which will help the HM to visually do it.
				// like some clouring or pick n drop facility.
				application.setPriority(0);
			}
		}
	}

	public void saveAsJobTemplate(VacancySetDTO vacancySetDTO) {
		JobDescription jobDescription = new JobDescription(vacancySetDTO);
		requisition.saveJobDescriptionAsTemplate(jobDescription);
	}

	// Not completed
	VacancySetDTO showJobDescriptionsSavedAsTemplate() {
		Set<JobDescription> jobDescriptions = requisition
				.showJobDescriptionsFromTemplate();
		Iterator<JobDescription> itr = jobDescriptions.iterator();
		JobDescription jobDescription = null;
		while (itr.hasNext()) {
			// selected will be added to VacancySetDTO
			if (true) {
				jobDescription = itr.next();
				break;
			}
		}
		VacancySetDTO vacancySetDTO = new VacancySetDTO();
		Object2ObjectConversion.JobDescription2VacancySetDTO(vacancySetDTO,
				jobDescription);

		return vacancySetDTO;
	}

	public void showJobTemplate() {

	}

	public static void main(String[] args) {
		VacancySetDTO vacancySetDTO = new VacancySetDTO();
		vacancySetDTO.setDesignation("Java Developer");
		vacancySetDTO.setDescription("you shud knw java");
		Set<String> skillSet = new HashSet<String>();
		skillSet.add("Core Java");
		skillSet.add("Spring");
		vacancySetDTO.setKeySkill(skillSet);
		vacancySetDTO.setLocation("Gurgaon");
		vacancySetDTO.setMaxExp(5);
		vacancySetDTO.setMinExp(3);
		vacancySetDTO.setMaxSal("8LPA");
		vacancySetDTO.setMinSal("5LPA");
		vacancySetDTO.setNoOfVacancy(3);
		vacancySetDTO
				.setOtherDetails("Candidate is reponsible for developing & maintaing the application.");

		HiringManager hiringManager = new HiringManager();
		hiringManager.setVacancySet(vacancySetDTO);
		hiringManager.changeApplicationStatus();
		hiringManager.setApplicationPriority();
	}
}// end HM