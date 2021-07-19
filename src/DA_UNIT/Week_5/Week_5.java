package DA_UNIT.Week_5;

public class Week_5 {
    public static void main(String[] args) {
        // Section For Doctor Class:
        // name, age, medicalField, employer, qualification, residency,
        // YearsOfExperience
        Doctor Surgeon = new Doctor("female", "Torres", 45, "Surgery", "Hospital", "M.D. and MCAT", true, 15);
        Surgeon.getinfo();

        Doctor Cardiologist = new Doctor("male", "Boyle", 35, "Cardiology", "Armed Services", "M.D., MCAT and D.O.",
                true, 12);
        Cardiologist.getinfo();

        Doctor Dentist = new Doctor("male", "Archer", 30, "Orthodontics", "Private Practice", "DAT, DDS and DMD", false,
                7);
        Dentist.getinfo();

        Doctor Podiatrist = new Doctor("female", "Nalini", 29, "Dermatology", "Community Health Clinic",
                "MCAT, GRE and DPM", true, 9);
        Podiatrist.getinfo();

        Doctor Pharmacist = new Doctor("female", "Rainbow", 36, "Psychopharmacotherapy", "Pharmaceutical company",
                "PCAT and Pharm.D.", false, 11);
        Pharmacist.getinfo();

        // Section for the SoftwareEngineer Class
        //
        SoftwareEngineer engineer = new SoftwareEngineer();
        engineer.introduction();
        // newName, newAge, newHeight, newWeight, newSpecialization, newRole,
        // newCompany, newSalary, newLevel
        engineer.setFeatures("jamie", 21, "web", "Front-end", "Microsoft", "$100,000", "5");
        engineer.introduction();
        engineer.getinfo();

        Human engineer_2 = new SoftwareEngineer();
        ((SoftwareEngineer) engineer_2).setFeatures("Karen", 29, "Mobile", "IOS", "Netflix", "$258,962", "K7");
        ((SoftwareEngineer) engineer_2).getinfo();
        engineer_2.getinfo();
        engineer_2.introduction();

        SoftwareEngineer engineer_3 = new SoftwareEngineer("Jonathan", 72, "DevOps", "SRE");
        engineer_3.introduction();
        engineer_3.getinfos();
    }
}
