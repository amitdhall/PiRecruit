package in.bluepi.pirecruit.user.employee;

import in.bluepi.pirecruit.requisition.Requisition;
import in.bluepi.pirecruit.requisition.RequisitionRepository;
import in.bluepi.pirecruit.requisition.VacancySet;
import in.bluepi.pirecruit.requisition.VacancySetDTO;
import in.bluepi.pirecruit.util.UtilEnum;
import in.bluepi.pirecruit.util.UtilEnum.reqStatus;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Amin
 * @version 1.0
 * @created 21-Nov-2012 12:36:13 PM
 */
public class HM extends Employee {
	
//	Requisition req[] = new Requisition[5];
     Requisition req=null;
     Set<Requisition> reqSet=new HashSet<Requisition>();

	public HM(){
		wrap();
	}

	private void wrap() {
		RequisitionRepository reqRepo = new RequisitionRepository();
		Employee emp = new Employee();
		Date closingDate = new Date("31/01/2013");
		Date openingDate = new Date("01/01/2013");
		
//		for(int i=0;i<1;i++)
		req=reqRepo.createReq(1, closingDate,openingDate,emp,"PWC",UtilEnum.reqStatus.PENDING);
	}

	public void finalize() throws Throwable {
		super.finalize();
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
	public void openRequisition(){
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
		vacancySetDTO.setOtherDetails("Candidate is reponsible for everything :-p ");
		 req.createVacancySet(vacancySetDTO);
	}
	public void showJobTempelate(){

	}
	public static void main(String[] args) {
		HM hm = new HM();
		hm.openRequisition();
//		System.out.println("req "+hm.req);
//		System.out.println("hi"+hm.Req);
		System.out.println(hm.req);
	}
}//end HM