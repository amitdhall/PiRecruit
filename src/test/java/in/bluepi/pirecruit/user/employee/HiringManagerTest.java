package in.bluepi.pirecruit.user.employee;

import in.bluepi.pirecruit.requisition.VacancySetDTO;

import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class HiringManagerTest {

	
	@Test
	public void HiringManager() {
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
		//		hiringManager.changeApplicationStatus();
		//		hiringManager.setApplicationPriority();
		//    throw new RuntimeException("Test not implemented");
	}
}
