package DA_UNIT.Week_5;

public class Week_5 {
        public static void main(String[] args) {
                // Section For Doctor Class:
                // name, age, medicalField, employer, qualification, residency,
                // YearsOfExperience
                Doctor Surgeon = new Doctor("female", "Torres", 45, "Surgery", "Hospital", "M.D. and MCAT", true, 15);
                Surgeon.getinfo();

                Doctor Cardiologist = new Doctor("male", "Boyle", 35, "Cardiology", "Armed Services",
                                "M.D., MCAT and D.O.", true, 12);
                Cardiologist.getinfo();

                Doctor Dentist = new Doctor("male", "Archer", 30, "Orthodontics", "Private Practice",
                                "DAT, DDS and DMD", false, 7);
                Dentist.getinfo();

                Doctor Podiatrist = new Doctor("female", "Nalini", 29, "Dermatology", "Community Health Clinic",
                                "MCAT, GRE and DPM", true, 9);
                Podiatrist.getinfo();

                Doctor Pharmacist = new Doctor("female", "Rainbow", 36, "Psychopharmacotherapy",
                                "Pharmaceutical company", "PCAT and Pharm.D.", false, 11);
                Pharmacist.getinfo();

                // Section for the SoftwareEngineer Class
                // String gender, String name, int age, String specialization, String role,
                // String company, String salary, String level
                SoftwareEngineer WebDeveloper = new SoftwareEngineer("female", "Maya", 27, "Web DevelopMent",
                                "Front-End Engineer", "Google", "$658,962", "L7", 10);
                WebDeveloper.getinfo();
                WebDeveloper.Value();

                Human MobileDeveloper = new SoftwareEngineer();
                ((SoftwareEngineer) MobileDeveloper).setFeatures("male", "Cristiano", 32, "Apple IOS",
                                "Mobile Developer", "Apple", "$258,962", "ICT 3", 5);
                ((SoftwareEngineer) MobileDeveloper).Bio();
                ((SoftwareEngineer) MobileDeveloper).getinfo();
                ((SoftwareEngineer) MobileDeveloper).Value();

                SoftwareEngineer CloudEngineer = new SoftwareEngineer("male", "Mike", 45, "Azure Cloud",
                                "Cloud Architect", "Microsoft", "$872,650", "Partner", 15);
                CloudEngineer.getinfo();

                SoftwareEngineer TestingEngineer = new SoftwareEngineer("female", "Jasmine", 37, "Software Testing",
                                "QA Engineer", "Facebook", "$396,802", "E5", 7);
                TestingEngineer.getinfo();

                SoftwareEngineer AutomationEngineer = new SoftwareEngineer("male", "Jake Sully", 29, "AWS Cloud",
                                "DevOps Engineer", "Netflix", "$506,788", "Senior Software Engineer", 10);
                AutomationEngineer.getinfo();
        }
}
