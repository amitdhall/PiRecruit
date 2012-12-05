package in.bluepi.pirecruit.requisition;

/**
 * @author TOSHIBA
 * @version 1.0
 * @created 21-Nov-2012 12:35:06 PM
 */
public class VacancySet {

	private String designation;
	private String location;
	private int minExp;
	private int maxExp;
	private String minSal;
	private String maxSal;
	private int noOfVacancy;
	private Vacancy m_Vacancy;
//	private Designation m_Designation;
	private JobDescription vacancyDescription;

	public VacancySet(){

	}

	public VacancySet(VacancySetDTO vacancySetDTO) {
		this.designation=vacancySetDTO.getDesignation();
		this.location=vacancySetDTO.getLocation();
		this.minExp=vacancySetDTO.getMinExp();
		this.maxExp=vacancySetDTO.getMaxExp();
		this.minSal=vacancySetDTO.getMinSal();
		this.maxSal=vacancySetDTO.getMaxSal();
		this.noOfVacancy=vacancySetDTO.getNoOfVacancy();
		vacancyDescription = new JobDescription(vacancySetDTO);
	}

	public void finalize() throws Throwable {

	}
}//end VacancySet