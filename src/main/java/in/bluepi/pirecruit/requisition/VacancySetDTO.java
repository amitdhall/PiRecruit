package in.bluepi.pirecruit.requisition;

import java.util.Set;

public class VacancySetDTO {
	private String designation;
	private String location;
	private int minExp;
	private int maxExp;
	private String minSal;
	private String maxSal;
	private int noOfVacancy;
//	private Vacancy m_Vacancy;
//	private Description m_Description;

	//	Attributes for Description
	private String description;
	private Set<String> keySkill;
	private String otherDetails;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<String> getKeySkill() {
		return keySkill;
	}
	public void setKeySkill(Set<String> keySkill) {
		this.keySkill = keySkill;
	}
	public String getOtherDetails() {
		return otherDetails;
	}
	public void setOtherDetails(String otherDetails) {
		this.otherDetails = otherDetails;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getMinExp() {
		return minExp;
	}
	public void setMinExp(int minExp) {
		this.minExp = minExp;
	}
	public int getMaxExp() {
		return maxExp;
	}
	public void setMaxExp(int maxExp) {
		this.maxExp = maxExp;
	}
	public String getMinSal() {
		return minSal;
	}
	public void setMinSal(String minSal) {
		this.minSal = minSal;
	}
	public String getMaxSal() {
		return maxSal;
	}
	public void setMaxSal(String maxSal) {
		this.maxSal = maxSal;
	}
	public int getNoOfVacancy() {
		return noOfVacancy;
	}
	public void setNoOfVacancy(int noOfVacancy) {
		this.noOfVacancy = noOfVacancy;
	}
//	public Vacancy getM_Vacancy() {
//		return m_Vacancy;
//	}
//	public void setM_Vacancy(Vacancy m_Vacancy) {
//		this.m_Vacancy = m_Vacancy;
//	}
//	public Designation getM_Designation() {
//		return m_Designation;
//	}
//	public void setM_Designation(Designation m_Designation) {
//		this.m_Designation = m_Designation;
//	}
//	public Description getM_Description() {
//		return m_Description;
//	}
//	public void setM_Description(Description m_Description) {
//		this.m_Description = m_Description;
//	}
}
