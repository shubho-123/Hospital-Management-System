package coreproject;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorDetails {
	String  doctorId,doctorName, Specialist, Timings, doctorQualification,sp;
	 int doctorRoomNo,flag=0,sNo;
	 Scanner sc = new Scanner(System.in);
	 Scanner sc1 = new Scanner(System.in);
	 ArrayList<Doctor> list = new ArrayList<Doctor>();
	
	 
	 public DoctorDetails() {
		super();
		list.add(new Doctor("101","Dr.Ghanendra","ENT", "5PM-10PM", "MBBS,MD",  1));
		list.add(new Doctor("102","Dr.Vikram","Physician","10AM-4PM", "MBBS,MD",  2));
		list.add(new Doctor("103","Dr.Rekha","Surgeon","5PM-10PM", "MBBS,MS",  3));
		list.add(new Doctor("104","Dr.Pramod","Skin","10AM-4PM", "MBBS,MD",  4));
	}
	 
	public static void InvalidID(int i)throws InvalidIDException{
	 	 
		 if(i==0)
		 {
			 throw new InvalidIDException("id is not valid");
		 }else
		 {
			 System.out.println("\nSearched results");
		 }	 
	 }
	 
	public void Doctor() {
		int ch;
        System.out.println("1.Add New Entry\n2.Existing Doctors List\n3.Search Doctor ID\n4.Edit Details\n5.Delete the doctor details"
        		+ "\n6.Search by Specialist");
		ch=sc1.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter ID :");
			doctorId=sc.nextLine();
			System.out.println("Enter Name :");
			doctorName=sc.nextLine();
			System.out.println("Enter Specialist in :");
			Specialist=sc.nextLine();
			System.out.println("Enter Timings :");
			Timings=sc.nextLine();
			System.out.println("Enter Qualification :");
			doctorQualification=sc.nextLine();
			System.out.println("Enter Room No :");
			doctorRoomNo=sc1.nextInt();
			list.add(new Doctor(doctorId,doctorName,Specialist,Timings,doctorQualification,doctorRoomNo));
			System.out.println("Data Successfully Entered");
			break;
		case 2:
			sNo=0;
			 System.out.println("--------------------------------------------------------------------------------------------------");
				System.out.format("%3s%5s%20s%15s%12s%20s%14s\n","S.No","id","Name","Specialist","Timing","Qualification","Room No.");
				System.out.println("--------------------------------------------------------------------------------------------------");
				for(Doctor doctor : list) {
					
					sNo++;
					System.out.format("%3d%6s%20s%15s%12s%20s%12d\n",sNo,doctor.getDoctorId()
							,doctor.getDoctorName(),doctor.getSpecialist()
							,doctor.getAppoint(),doctor.getQualification()
							,doctor.getDoctorRoom());
					
				}
			break;
		case 3:
			System.out.println("Enter Doctor Id:");
			int doctorsId=sc1.nextInt();
			int i=0;
			for(Doctor doctor : list) {
				int j=Integer.parseInt(doctor.getDoctorId());
				if(doctorsId==j)
				{
					i=1;
					System.out.println("--------------------------------------------------------------------------------------------------");
					System.out.format("%5s%20s%15s%12s%20s%14s\n","id","Name","Specialist","Timing","Qualification","Room No.");
					System.out.println("--------------------------------------------------------------------------------------------------");
					
					System.out.format("%5s%20s%15s%12s%20s%12d\n",doctor.getDoctorId()
							,doctor.getDoctorName(),doctor.getSpecialist()
							,doctor.getAppoint(),doctor.getQualification()
							,doctor.getDoctorRoom());
				} 
			}
			try {	 
          	InvalidID(i);
          }
          catch(InvalidIDException e) {
  			// TODO Auto-generated catch block
  			System.out.println(e);
  		}
			break;
		case 4:
			 System.out.println("Enter S.No :");
				sNo=sc1.nextInt();
				sNo--;
				System.out.println("Enter ID :");
				doctorId=sc.nextLine();
				System.out.println("Enter Name :");
				doctorName=sc.nextLine();
				System.out.println("Enter Specilist in :");
				Specialist=sc.nextLine();
				System.out.println("Enter Timings :");
				Timings=sc.nextLine();
				System.out.println("Enter Qualification :");
				doctorQualification=sc.nextLine();
				System.out.println("Enter Room No :");
				doctorRoomNo=sc1.nextInt();
				list.set(sNo,new Doctor(doctorId,doctorName,Specialist,Timings,doctorQualification,doctorRoomNo));
				System.out.println("Data Modified Successfully");
			break;
		case 5:
			 System.out.println("Enter S.No :");
				sNo=sc1.nextInt();
				sNo--;
				list.remove(sNo);
				System.out.println("Removed Successfully");
				break;
				
		case 6:
			System.out.println("Choice the Specialist");
			System.out.println("1.Ortho\n"
							  +"2.Eye\n"
							  +"3.Surgeon\n"
							  +"4.ENT\n"
							  +"5.Physician");
			ch=sc1.nextInt();
			 switch(ch) {
			 
			 case 1:
				 sp="Ortho";
				 break;
			 case 2:
				 sp="Eye";
				 break;
			 case 3:
				 sp="Surgeon";
				 break;
			 case 4:
				 sp="ENT";
				 break;
			 case 5:
				 sp="Physician";
				 break;
			 }
			 System.out.println("--------------------------------------------------------------------------------------------------");
				System.out.format("%3s%5s%20s%15s%12s%20s%14s\n","S.No","id","Name","Specialist","Timing","Qualification","Room No.");
				System.out.println("--------------------------------------------------------------------------------------------------");
				sNo=0;
			 for(Doctor doctor : list) {
					if(doctor.getSpecialist().equals(sp))
					{
						flag=1;
						sNo++;
						System.out.format("%3d%6s%20s%15s%12s%20s%12d\n",sNo,doctor.getDoctorId()
								,doctor.getDoctorName(),doctor.getSpecialist()
								,doctor.getAppoint(),doctor.getQualification()
								,doctor.getDoctorRoom());
					} 
				}
			 if(flag==0)
			 {
				 System.out.println("No Doctors are avaliable");
			 }
			break;
		}
		
	}
}