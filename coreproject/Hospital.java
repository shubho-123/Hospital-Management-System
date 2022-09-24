package coreproject;

import java.util.Scanner;

public class Hospital {
		
		DoctorDetails doctorDetails;
		PatientDetails patientDetails;
	 
	public Hospital(DoctorDetails doctorDetails,PatientDetails patientDetails) {
			super();
			this.doctorDetails = doctorDetails;
			this.patientDetails=patientDetails;
		}
	public void Doctors() {
		
		doctorDetails.Doctor();
		
	}
	public void Patients() {
		patientDetails.Patient();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,s1=0;
		 Hospital hospital = new Hospital(new DoctorDetails(),new PatientDetails());
	        
		 System.out.println("\n--------------------------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        Scanner sc = new Scanner(System.in);
        do {
        	System.out.println("--------------------------------------------------------------------------------------------------");
        	 System.out.println("\n                                    MAIN MENU");
        	 System.out.println("--------------------------------------------------------------------------------------------------");
             System.out.println("1.Doctors  2. Patients ");
             System.out.println("--------------------------------------------------------------------------------------------------");
             ch = sc.nextInt();
             switch (ch)
             {
                 case 1:
                     {
                    	 do {
                       hospital.Doctors();
                       System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0 for Termination Press any key(2-9)");
                       s1=sc.nextInt();
                    	 }while(s1==1);
                         break;
                     }
                 case 2:
                 {
                	 do {
                	 hospital.Patients();
                	 System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0 for Termination Press any key(2-9)");
                     s1=sc.nextInt();
                  	 }while(s1==1);
                	 break;
                 }
             }
             }while(s1==0);
        sc.close();
	}

}