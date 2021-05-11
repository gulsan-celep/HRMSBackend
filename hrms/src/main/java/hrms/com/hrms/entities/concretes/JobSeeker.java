package hrms.com.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="JobSeekers")
public class JobSeeker {
	
	@Id
	@GeneratedValue
	@Column(name="userId")
	private int userId;
	
	@Column(name="positionId")
	private int positionId;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="nationalityIdentity")
	private int nationalityIdentity;
	
	@Column(name="birthOfYear")
	private String birthOfYear;
	
	public JobSeeker() {}
	
	public JobSeeker(int userId, int positionId, String firstName, String lastName, int nationalityIdentity,
			String birthOfYear) {
		super();
		this.userId = userId;
		this.positionId = positionId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
		this.birthOfYear = birthOfYear;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(int nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}

	public String getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(String birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
	
	
}
