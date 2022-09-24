package coreproject;

public class Doctor {
	String  doctorId,doctorName, Specialist, appoint, qualification;
	 int doctorRoomNo;
	 
	public Doctor(String doctorId, String doctorName, String Specialist, String appoint, String qualification,
			int doctorRoomNo) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.Specialist = Specialist;
		this.appoint = appoint;
		this.qualification = qualification;
		this.doctorRoomNo = doctorRoomNo;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialist() {
		return Specialist;
	}
	public void setzSpecialist(String Specialist) {
		this.Specialist = Specialist;
	}
	public String getAppoint() {
		return appoint;
	}
	public void setAppoint(String appoint) {
		this.appoint = appoint;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getDoctorRoom() {
		return doctorRoomNo;
	}
	public void setDoctorRoomNo(int doctorRoomNo) {
		this.doctorRoomNo = doctorRoomNo;
	}
	@Override
	public String toString() {
		return  doctorId + "  \t" + doctorName + " \t" + Specialist + " \t " + appoint
				+ "\t" + qualification + " \t\t   " + doctorRoomNo;
	}
}