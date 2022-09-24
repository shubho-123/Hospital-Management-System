package coreproject;

public class Patient
{
	String patientId, patientName, disease, sex, admitStatus,doctorName;
    int age;
	public Patient(String patientId, String patientName, String disease, String sex, String admitStatus, int age,String doctorName) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.disease = disease;
		this.sex = sex;
		this.admitStatus = admitStatus;
		this.age = age;
		this.doctorName=doctorName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAdmitStatus() {
		return admitStatus;
	}
	public void setAdmitStatus(String admitStatus) {
		this.admitStatus = admitStatus;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getdoctorName() {
		return doctorName;
	}
	public void setdoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", disease=" + disease + ", sex="
				+ sex + ", admitStatus=" + admitStatus + ", age=" + age + "]";
	}
    
}