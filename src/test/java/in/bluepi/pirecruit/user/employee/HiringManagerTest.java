package in.bluepi.pirecruit.user.employee;

import in.bluepi.pirecruit.enums.RequisitionStatus;
import in.bluepi.pirecruit.requisition.VacancySetDTO;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.testng.annotations.Test;

public class HiringManagerTest {
	VacancySetDTO vacancySetDTO;
	Employee emp;
	DateTime openingDate;
	DateTime closingDate;
	
	@Test
	public void getVacancySetDTO(){
//		Creating VacancySetDTo
		vacancySetDTO = new VacancySetDTO();
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

//		using jodatime to set dates for the requisition
		openingDate = new DateTime();
		closingDate = new DateTime();
	}
	
	@Test
	public void getEmployee(){
//		creating employee
		emp = new Employee("Gurgaon", "IT", "Software Developer", "amit.dhall4@gmail.com", "1");
	}

	@Test
	public void HiringManager() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void assignInterviewer() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void changeApplicationStatus() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void main() {
		throw new RuntimeException("Test not implemented");
	}

	@Test(dependsOnMethods={"getVacancySetDTO","getEmployee"})
	public void setVacancySet() {
		HiringManager hiringManager = new HiringManager();
		hiringManager.startNewRequisition(1,closingDate,openingDate,emp,"PWC",RequisitionStatus.PENDING);
		hiringManager.setVacancySet(vacancySetDTO);
	}

	@Test
	public void saveAsJobTemplate() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void setApplicationPriority() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void showJobDescriptionsSavedAsTemplate() {
		throw new RuntimeException("Test not implemented");
	}

	@Test
	public void showJobTemplate() {
		throw new RuntimeException("Test not implemented");
	}
}
