package in.bluepi.pirecruit.user.employee;

import in.bluepi.pirecruit.requisition.Application;
import in.bluepi.pirecruit.requisition.JobDescription;
import in.bluepi.pirecruit.requisition.Requisition;
import in.bluepi.pirecruit.requisition.RequisitionRepository;
import in.bluepi.pirecruit.requisition.VacancySet;
import in.bluepi.pirecruit.requisition.VacancySetDTO;
import in.bluepi.pirecruit.util.Object2ObjectConversion;
import in.bluepi.pirecruit.util.UtilEnum;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Amin
 * @version 1.0
 * @created 21-Nov-2012 12:36:13 PM
 */
public class HiringManager extends Employee {

	//	Requisition req[] = new Requisition[5];
	Requisition req;
	Set<Requisition> reqSet = new HashSet<Requisition>();
	RequisitionRepository reqRepo = new RequisitionRepository();

	public HiringManager(){
		wrap();
	}

	private void wrap() {
		
		Employee emp = new Employee();
		Date closingDate = new Date("31/01/2013");
		Date openingDate = new Date("01/01/2013");

		//		for(int i=0;i<1;i++)
		req=reqRepo.createReq(1, closingDate,openingDate,emp,"PWC",UtilEnum.reqStatus.PENDING);
	}

	/**
	 * 
	 * @param vacancySet
	 * @param interviewer
	 */
	public void assignInterviewer(VacancySet vacancySet, Interviewer interviewer){

	}


	/**
	 * 
	 * @param vacancySet
	 */
	public void openRequisition(VacancySetDTO vacancySetDTO){
		//		VacancySetDTO vacancySetDTO = new VacancySetDTO();
		//		vacancySetDTO.setDesignation("Java Developer");
		//		vacancySetDTO.setDescription("you shud knw java");
		//		Set<String> skillSet = new HashSet<String>();
		//		skillSet.add("Core Java");
		//		skillSet.add("Spring");
		//		vacancySetDTO.setKeySkill(skillSet);
		//		vacancySetDTO.setLocation("Gurgaon");
		//		vacancySetDTO.setMaxExp(5);
		//		vacancySetDTO.setMinExp(3);
		//		vacancySetDTO.setMaxSal("8LPA");
		//		vacancySetDTO.setMinSal("5LPA");
		//		vacancySetDTO.setNoOfVacancy(3);
		//		vacancySetDTO.setOtherDetails("Candidate is reponsible for developing & maintaing the application.");
		req.createVacancySet(vacancySetDTO);
	}
	public void changeApplicationStatus(){
		for(VacancySet vacancySet:req.setOfVacancySet){
			Set<Application> applicationSet = req.viewApplications(vacancySet);
			for(Application application : applicationSet){
				//				condition or by viewing the feedback of application he can make his/her decision
				if(true){
					req.changeApplicationStatus(application, UtilEnum.applicationStatus.SELECTED);
				}
			}
		}
	}

	public void setApplicationPriority(){
		for(VacancySet vacancySet:req.setOfVacancySet){
			Set<Application> applicationSet = req.viewApplications(UtilEnum.applicationStatus.SHORTLISTED);
			for(Application application : applicationSet){
				//				some algo will be used to prioritize shortlisted cadidates. which will help the HM to visually do it.
				//				like some clouring or pick n drop facility.
				application.setPriority(0);
			}
		}
	}

	public void saveAsJobTemplate(VacancySetDTO vacancySetDTO){
		JobDescription jobDescription = new JobDescription(vacancySetDTO);
		req.saveJobDescriptionAsTemplate(jobDescription);
	}

//	Not completed
	VacancySetDTO showJobDescriptionsSavedAsTemplate(){
		Set<JobDescription> jobDescriptions = req.showJobDescriptionsFromTemplate();
		Iterator<JobDescription> itr = jobDescriptions.iterator();
		JobDescription jobDescription = null;
		while(itr.hasNext())
		{
			//			selected will be added to VacancySetDTO
			if(true){
				jobDescription = itr.next();
				break;
			}
		}
		VacancySetDTO vacancySetDTO = new VacancySetDTO();
			Object2ObjectConversion.JobDescription2VacancySetDTO(vacancySetDTO,jobDescription);
		
		return vacancySetDTO;
	}

	public void showJobTempelate(){

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
		vacancySetDTO.setOtherDetails("Candidate is reponsible for developing & maintaing the application.");

		HiringManager hiringManager = new HiringManager();
		hiringManager.openRequisition(vacancySetDTO);
		hiringManager.changeApplicationStatus();
		hiringManager.setApplicationPriority();
	}
}//end HM