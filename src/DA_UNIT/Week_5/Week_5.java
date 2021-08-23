package Week_5;

import java.util.*;

public class Week_5 {
        public static void main(String[] args) {
                // Section for the Base Person Class:
                // name , age
                Person African = new Person("Cyprian Ekwensi", 60);
                African.introduction();
                African.setFeatures("Chinua Achebe", 26, 1.87, 82, "male", "Nigeria");
                African.introduction();
                African.getinfo();

                // String name, int age, double height, int weight, String gender, String
                // country
                Person European = new Person("Jack Grealish", 30, 1.83, 79, "male", "England");
                European.getinfo();

                Person Asian = new Person("Uzumaki Himawari", 22, 1.58, 63, "female", "Japan");
                Asian.getinfo();

                Person SouthAmerican = new Person("Isabela Gomez", 19, 1.62, 70, "female", "Brazil");
                SouthAmerican.getinfo();

                Person NorthAmerican = new Person("Bruce Wayne", 39, 1.66, 80, "male", "America");
                NorthAmerican.getinfo();

                // Section For Doctor Class:
                // name, age, medicalField, employer, qualification, residency,
                // YearsOfExperience
                Doctor Surgeon = new Doctor("female", "Arabella Torres", 45, "Surgery", "Hospital", "M.D. and MCAT",
                                true, 15);
                Surgeon.getinfo();

                Doctor Cardiologist = new Doctor("male", "Dernis Boyle", 35, "Cardiology", "Armed Services",
                                "M.D., MCAT and D.O.", true, 12);
                Cardiologist.getinfo();

                Doctor Dentist = new Doctor("male", "Sterling Archer", 30, "Orthodontics", "Private Practice",
                                "DAT, DDS and DMD", false, 7);
                Dentist.getinfo();

                Doctor Podiatrist = new Doctor("female", "Nalini Vishwakumar", 29, "Dermatology",
                                "Community Health Clinic", "MCAT, GRE and DPM", true, 9);
                Podiatrist.getinfo();

                Doctor Pharmacist = new Doctor("female", "Rainbow Johnson", 36, "Psychopharmacotherapy",
                                "Pharmaceutical company", "PCAT and Pharm.D.", false, 11);
                Pharmacist.getinfo();

                
                // Section for the SoftwareEngineer Class
                // String gender, String name, int age, String specialization, String role,
                // String company, String salary, String level
                SoftwareEngineer WebDeveloper = new SoftwareEngineer("female", "Maya Kricko", 27, "Web DevelopMent",
                                "Front-End Engineer", "Google", "$658,962", "L7", 10);

                Person MobileDeveloper = new SoftwareEngineer();
                ((SoftwareEngineer) MobileDeveloper).setFeatures("male", "Cristiano Ronaldo", 32, "Apple IOS",
                                "Mobile Developer", "Apple", "$258,962", "ICT 3", 5);

                SoftwareEngineer CloudEngineer = new SoftwareEngineer("male", "Mike Ross", 45, "Azure Cloud",
                                "Cloud Architect", "Microsoft", "$872,650", "Partner", 15);

                SoftwareEngineer TestingEngineer = new SoftwareEngineer("female", "Jasmine Neutron", 37,
                                "Software Testing", "QA Engineer", "Facebook", "$396,802", "E5", 7);

                SoftwareEngineer AutomationEngineer = new SoftwareEngineer("male", "Jake Sully", 29, "AWS Cloud",
                                "DevOps Engineer", "Netflix", "$506,788", "Senior Software Engineer", 10);

                // Using An ArrayList to Manipulate all created Objects
                ArrayList<Person> SWE = new ArrayList<Person>();
                SWE.add(WebDeveloper);
                SWE.add(MobileDeveloper);
                SWE.add(CloudEngineer);
                SWE.add(TestingEngineer);
                SWE.add(AutomationEngineer);
                int count = 0;
                String tab = "\t";
                for (Person item : SWE) {
                        count++;
                        System.out.printf("\n%s%s%s\n", tab.repeat(10), "Engineer ", count);
                        ((SoftwareEngineer) item).Bio();
                        item.getinfo();
                        if (count == 1 || count == 2) {
                                ((SoftwareEngineer) item).Value();
                        }
                        if (count == 5) {
                                ((SoftwareEngineer) item).testingsuper();
                        }
                }
        }
}
