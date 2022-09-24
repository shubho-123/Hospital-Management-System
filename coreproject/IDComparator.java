package coreproject;

import java.util.Comparator;


public class IDComparator implements Comparator<DoctorDetails> {

	@Override
	public int compare(DoctorDetails Id1, DoctorDetails Id2) {
		// TODO Auto-generated method stub
		
		return Id2.doctorId.compareTo(Id1.doctorId);
	}
	

}