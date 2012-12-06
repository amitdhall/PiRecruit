package in.bluepi.pirecruit.requisition;

import java.util.Set;

/**
 * @author TOSHIBA
 * @version 1.0
 * @created 21-Nov-2012 12:35:06 PM
 */
public class JobDescription {

	private String description;
	private Set<String> keySkill;
	private String otherDetails;

	public JobDescription(VacancySetDTO vacancySetDTO){
		this.description = vacancySetDTO.getDescription();
		this.keySkill = vacancySetDTO.getKeySkill();
		this.otherDetails = vacancySetDTO.getOtherDetails();
	}

}//end Description