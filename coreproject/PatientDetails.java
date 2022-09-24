package coreproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PatientDetails {
	String patientId,patientName,disease,sex,admitStatus,doctorName;
    int age;
    ArrayList<Patient> list = new ArrayList<Patient>();
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    
    public PatientDetails() {
		super();
		
		list.add(new Patient("101","Ghanendra","Cancer","Male","y",30,"Dr.Rekha"));
		list.add(new Patient("102","Vikram","Cold","Male","y",23,"Dr.Ghanendra"));
		list.add(new Patient("103","Rekha","Maleriya","Female", "y",32,"Dr.Vikram"));
		list.add(new Patient("104","Pramod","Melasma","Male","y",42,"Dr.Pramod"));
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
	 
    void Patient()
    {
    	
    	System.out.println("--------------------------------------------------------------------------------------------------");
         System.out.println("                     **PATIENT SECTION**");
         System.out.println("--------------------------------------------------------------------------------------------------");
         
       
             System.out.println("1.Add New Entry\n2.Existing Patients List\n3.Search Patient Id\n4.Edit Details\n"
             					+ "5.Remove Patient details");
             int c1 = sc1.nextInt();
             switch (c1)
             {
                 case 1:
                     {
                         System.out.println("id:-");
                         patientId = sc.nextLine();
                         System.out.println("name:-");
                         patientName = sc.nextLine();
                         System.out.println("disease:-");
                         disease = sc.nextLine();
                         System.out.println("sex:-");
                         sex = sc.nextLine();
                         System.out.println("admit_status:-");
                         admitStatus = sc.nextLine();
                         System.out.println("age:-");
                         age = sc1.nextInt();
                         System.out.println("Enter Doctor Name :");
                         doctorName=sc.nextLine();
                         list.add(new Patient(patientId, patientName, disease, sex, admitStatus, age,doctorName));
                         System.out.println("Data Successfully Entered");
                         break;
                     }
                 case 2:
                     {
                    	 int sNo=0;
                         System.out.println("----------------------------------------------------------------------------------------------------");
                         System.out.format("%3s%5s%15s%15s%12s%20s%10s%17s\n","S.No","id","Name","Disease","Sex","AdmitStatus","Age","Doctor Name");
                         System.out.println("----------------------------------------------------------------------------------------------------");
                         for(Patient patient : list)
                         {
                        	 sNo++;
                         System.out.format("%3d%6s%15s%15s%14s%15s%13d%17s\n",sNo,patient.getPatientId(),patient.getPatientName()
      							,patient.getDisease(),patient.getSex()
      							,patient.getAdmitStatus(),patient.getAge(),patient.getdoctorName());
                         }
                         break;
                     }
                 case 3:
                 {
                	 System.out.println("Enter Patient Id:");
         			int patientId=sc1.nextInt();
         			int i=0,sNo=0;
         			for(Patient patient : list) {
         				int j=Integer.parseInt(patient.getPatientId());
         				if(patientId==j)
         				{
         					i=1;
         					sNo++;
         					 System.out.println("----------------------------------------------------------------------------------------------------");
                             System.out.format("%3s%5s%15s%15s%12s%20s%10s%17s\n","S.No","id","Name","Disease","Sex","AdmitStatus","Age","Doctor Name");
                             System.out.println("----------------------------------------------------------------------------------------------------");         					
                             System.out.format("%3d%6s%15s%15s%14s%15s%13d%17s\n",sNo,patient.getPatientId(),patient.getPatientName()
           							,patient.getDisease(),patient.getSex()
           							,patient.getAdmitStatus(),patient.getAge(),patient.getdoctorName());
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
         		}
                 case 4:
                 
                	 int sNo;
                	 System.out.println("Enter S.No :");
                	 sNo=sc1.nextInt();
                	 sNo--;
                	  	 System.out.println("id:-");
                         patientId = sc.nextLine();
                         System.out.println("name:-");
                         patientName = sc.nextLine();
                         System.out.println("disease:-");
                         disease = sc.nextLine();
                         System.out.println("sex:-");
                         sex = sc.nextLine();
                         System.out.println("admit_status:-");
                         admitStatus = sc.nextLine();
                         System.out.println("age:-");
                         age = sc1.nextInt();
                         System.out.println("Enter Doctor Name :");
                         doctorName=sc.nextLine();
                         list.set(sNo,new Patient(patientId, patientName, disease, sex, admitStatus, age,doctorName));
                         System.out.println("Data Modified Successfully");
                         break;
                         
                 case 5:
                	 
        			 System.out.println("Enter S.No :");
        				sNo=sc1.nextInt();
        				sNo--;
        				list.remove(sNo);
        				System.out.println("Removed Successfully");
        				break;
             }
         }
     }