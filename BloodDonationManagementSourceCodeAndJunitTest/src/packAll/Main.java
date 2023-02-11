package packAll;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hospital hospital = new Hospital("Tibebe Ghion Hospital");

    while (true) {
      System.out.println("=============Welcome to blood Donation management system=========");
      System.out.println("1. Add");
      System.out.println("2. Show");
      System.out.println("3. Exit");
      System.out.print("Enter your choice: ");

      int choice = sc.nextInt();
      sc.nextLine();

      switch (choice) {
        case 1:
          System.out.println("1. Add Donor");
          System.out.println("2. Add Doctor");
          System.out.println("3. Add Receptionist");
          System.out.println("4. Add Lab Technician");
          System.out.println("5. Add Recipent");
          System.out.println("6. Add Blood test result");
          System.out.print("Enter your choice: ");
          int addChoice = sc.nextInt();
          sc.nextLine();

          switch (addChoice) {
            case 1:
            	System.out.print("Enter donor ID:");
            	String donorId = sc.nextLine();
                System.out.print("Enter donor name: ");
                String donorname = sc.nextLine();
                System.out.print("Enter Blood type: ");
                String donorbloodtype = sc.nextLine();
                System.out.print("Enter the weight of the donor (in kilograms): ");
                double weight = sc.nextDouble();
                System.out.print("Enter the age of donor: ");
                int age = sc.nextInt();
                Donor donor = new Donor(donorname, donorbloodtype, donorId,weight,age);
                hospital.addDonor(donor);
                System.out.println("Doctor added successfully.");
                break;
            case 2:
              System.out.print("Enter doctor name: ");
              String doctorName = sc.nextLine();
              Doctor doctor = new Doctor(doctorName);
              hospital.addDoctor(doctor);
              System.out.println("Doctor added successfully.");
              break;
            case 3:
              System.out.print("Enter receptionist name: ");
              String receptionistName = sc.nextLine();
              Receptionist receptionist = new Receptionist(receptionistName);
              hospital.addReceptionist(receptionist);
              System.out.println("Receptionist added successfully.");
              break;
            case 4:
              System.out.print("Enter lab technician name: ");
              String labTechnicianName = sc.nextLine();
              LabTechnician labTechnician = new LabTechnician(labTechnicianName);
              hospital.addLabTechnician(labTechnician);
              System.out.println("Lab Technician added successfully.");
              break;
            case 5:
                System.out.println("Enter recipient name:");
                String recipientName = sc.nextLine(); 
                System.out.println("Enter blood type:");
                String recipientBloodType = sc.nextLine();
                Recipient recipient = new Recipient(recipientName, recipientBloodType, hospital);
                hospital.addRecipient(recipient);
                System.out.println("Recipient added successfully");
                break;
            case 6:
            	System.out.print("Enter donor name: ");
            	String name = sc.nextLine();
            	System.out.print("Enter donor blood type: ");
            	String bloodType = sc.nextLine();
            	Donor donors = new Donor(name, bloodType);
            	System.out.print("Enter the test result: ");
                String testResult = sc.nextLine();
            	BloodTest bloodTest = new BloodTest(donors, testResult);
            	hospital.addBloodTest(bloodTest);
            	   
            default:
              System.out.println("Invalid choice.");
              break;
          }
          break;
        case 2:
          System.out.println("1. Show Donors");
          System.out.println("2. Show Doctors");
          System.out.println("3. Show Receptionists");
          System.out.println("4. Show Lab Technicians");
          System.out.println("5. Show Reciepient");
          System.out.println("6. Show Blood test result");
          System.out.print("Enter your choice: ");
          int showChoice = sc.nextInt();
          sc.nextLine();

          switch (showChoice) {
            case 1:
            	System.out.println("Donor in " + hospital.getName());
                for (Donor d : hospital.getDonor()) {
                 System.out.println("Donor Id is:"+d.getId());
                 System.out.println("Donor Name:"+d.getName());
                 System.out.println("Donor Blood type:"+d.getBloodType());
                 if (d.isEligible(d.getWeight(), d.getAge())) {
                     System.out.println("The donor is eligible to donate blood.");
                 } 
                 else {
                     System.out.println("The donor is not eligible to donate blood.");
                  }
                }
            	break;
            case 2:
              System.out.println("Doctors in " + hospital.getName());
              for (Doctor d : hospital.getDoctors()) {
                System.out.println("- " + d.getName());
              }
              break;
            case 3:
              System.out.println("Receptionists in " + hospital.getName());
              for (Receptionist r : hospital.getReceptionists()) {
                System.out.println("- " + r.getName());
              }
              break;
            case 4:
              System.out.println("Lab Technicians in " + hospital.getName());
              for (LabTechnician l : hospital.getLabTechnicians()) {
                System.out.println("- " + l.getName());
              }
              break;
            case 5:
                System.out.println("Recipient in " + hospital.getName());
                for (Recipient r : hospital.getRecipient()) {
                  System.out.println("- " + r.getName());
                }
            case 6:
            	System.out.println("Donor in " + hospital.getName());
                for (BloodTest bt : hospital.getBloodTest()) {
                 if (bt.isEligible(bt.getTestResult(),bt.getDonor())) {
                     System.out.println("The donor is eligible to donate blood.");
                 } 
                 else {
                     System.out.println("The donor is not eligible to donate blood.");
                  }
                }
            	
             default:
              System.out.println("Invalid choice.");
              break;
          }
          break;
        case 3:
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
          break;
      }
    }
  }
}
