package in.bluepi.pirecruit.user.candidate;
import in.bluepi.pirecruit.user.User;

import java.util.Date;
import java.util.Set;

/**
 * @version 1.0
 * @created 21-Nov-2012 12:35:59 PM
 */
public class Candidate extends User {

	private String alternateContact;
	private String correspondenceAddress;
	private Date dateOfBirth;
	private String emailID;
	private String firstName;
	private String gender;
	private String lastName;
	private String middleName;
	private String mobileNumber;
	private String permanantAddress;
	private Resume m_Resume;
	private Project m_Project;
	private WorkExperience m_WorkExperience;
	private Education m_Education;
	private TechnicalSkills m_TechnicalSkills;

	public Candidate(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param education
	 */
	public void addEducation(Set<Education> education){

	}

	/**
	 * 
	 * @param project
	 */
	public void addProject(Set<Project> project){

	}

	/**
	 * 
	 * @param resume
	 */
	public void addResume(Set<Resume> resume){

	}

	/**
	 * 
	 * @param technicalSkills
	 */
	public void addTechnicalSkill(Set<TechnicalSkills> technicalSkills){

	}

	/**
	 * 
	 * @param workExperience
	 */
	public void addWorkExperience(Set<WorkExperience> workExperience){

	}

	public void applyJob(){

	}

	/**
	 * 
	 * @param user
	 */
	public boolean login(User user){
		return false;
	}

	/**
	 * 
	 * @param candiate
	 */
	public void updateProfile(Candidate candiate){

	}
}//end Candidate