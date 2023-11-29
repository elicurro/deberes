package uoc.ds.pr.model;

import uoc.ds.pr.CTTCompaniesJobs;

import java.time.LocalDate;
import java.util.Comparator;


public class Worker implements Comparable<Worker>{

    public static final Comparator<String> CMP = new Comparator<String>() {
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };
    private String id;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private CTTCompaniesJobs.Qualification qualification;

    public Worker(String id, String name, String surname, LocalDate dateOfBirth, CTTCompaniesJobs.Qualification qualification) {
        this.setId(id);
        this.setName(name);
        this.setSurname(surname);
        this.setDateOfBirth(dateOfBirth);
        this.setQualification(qualification);
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void setQualification(CTTCompaniesJobs.Qualification qualification) {
        this.qualification = qualification;
    }
    public boolean is(String workerId) {
        return id.equals(workerId);
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public CTTCompaniesJobs.Qualification getQualification() {
        return qualification;
    }


    public int getWorkingDays() {
        return 0;
    }

    @Override
    public int compareTo(Worker o) {
        //return 0;
        return getId().compareTo(o.getId());
    }
}
