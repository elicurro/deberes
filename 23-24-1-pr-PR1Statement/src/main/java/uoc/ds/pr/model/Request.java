package uoc.ds.pr.model;


import uoc.ds.pr.CTTCompaniesJobs;

import java.time.LocalDate;
import java.util.Date;

public class Request {

    private String id;
    private String jobOfferId;
    private String companyId;
    private String description;
    private CTTCompaniesJobs.Qualification minQualification;
    private String type;
    private int maxWorkers;
    private LocalDate startDate;
    private LocalDate endDate;
    private CTTCompaniesJobs.Status status;

    private LocalDate dateStatus;

    private String descriptionStatus;

    public Request(String id, String jobOfferId, String companyId, String description, CTTCompaniesJobs.Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.jobOfferId = jobOfferId;
        this.companyId = companyId;
        this.description = description;
        this.minQualification = minQualification;
        this.status = CTTCompaniesJobs.Status.PENDING;
        this.maxWorkers = maxWorkers;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Request(String id, String companyId, String description, CTTCompaniesJobs.Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) {
        this.id = id;

        this.companyId = companyId;
        this.description = description;
        this.minQualification = minQualification;
        this.status = CTTCompaniesJobs.Status.PENDING;
        this.maxWorkers = maxWorkers;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Request() {

    }

    /*public Request(String id, String jobOfferId, String companyId, String description, CTTCompaniesJobs.Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) {
    }*/
    public JobOffer getJobOffer(){
        System.out.println("dfsa");
        return new JobOffer();
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getJobOfferId() {
        return jobOfferId;
    }
    public void setJobOfferId(String jobOfferId) {
        this.jobOfferId = jobOfferId;
    }
    public String getCompanyId() {
        return companyId;
    }
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public CTTCompaniesJobs.Qualification getMinQualification() {
        return minQualification;
    }
    public void setMinQualification(CTTCompaniesJobs.Qualification minQualification) {
        this.minQualification = minQualification;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getMaxWorkers() {
        return maxWorkers;
    }
    public void setMaxWorkers(int maxWorkers) {
        this.maxWorkers = maxWorkers;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public LocalDate getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    /*public CTTCompaniesJobs getJobOffer() {
        return null;
    }*/

    public CTTCompaniesJobs.Status getStatus() {
        return this.status;
    }

    public void update(CTTCompaniesJobs.Status status, LocalDate date, String description) {
        this.setStatus(status);
        this.setDateStatus(date);
        this.setDescriptionStatus(description);
    }

    public boolean isEnabled() {
        return this.status == CTTCompaniesJobs.Status.ENABLED;
    }

    public LocalDate getDateStatus() {
        return dateStatus;
    }
    public void setDateStatus(LocalDate dateStatus) {
        this.dateStatus = dateStatus;
    }


    public String getDescriptionStatus() {
        return descriptionStatus;
    }
    public void setDescriptionStatus(String descriptionStatus) {
        this.descriptionStatus = descriptionStatus;
    }

    public void setStatus(CTTCompaniesJobs.Status status) {
        this.status = status;
    }




    /*public JobOffer newJobOffer() {
        Activity activity = new Activity(this.actId, this.description, this.dateAct, this.mode, this.num, this);
        this.organization.addActivity(activity);

        return activity;
    }*/
}
