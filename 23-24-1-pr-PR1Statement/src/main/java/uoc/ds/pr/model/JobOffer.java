package uoc.ds.pr.model;


import edu.uoc.ds.traversal.Iterator;
import uoc.ds.pr.CTTCompaniesJobs;
import java.time.LocalDate;

public class JobOffer {


    private String jobOfferId;
    private String companyId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Number workingDays;
    private Number minQualification;
    private Number numWorkers;
    private Number numSubstitutes;
    private Integer totalRating;

    public JobOffer(String jobOfferId, String companyId, LocalDate startDate, LocalDate endDate, Number workingDays, Number minQualification, Number numWorkers, Number numSubstitutes, Integer totalRating) {
        this.jobOfferId = jobOfferId;
        this.companyId = companyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workingDays = workingDays;
        this.minQualification = minQualification;
        this.numWorkers = numWorkers;
        this.numSubstitutes = numSubstitutes;
        this.totalRating = totalRating;
    }

    public JobOffer() {

    }

    public CTTCompaniesJobs.Qualification getMinQualification() {
        return null;
    }

    public int getNumWorkers() {
        return 0;
    }

    public Company getCompany(){
        return new Company();
    }

    public int getNumSubstitutes() {
        return 0;
    }

    public Iterator<Enrollment> substitutes() {
        return null;
    }

    public String getJobOfferId() {
        ;
        return this.jobOfferId;
    }

    public int getWorkingDays() {
        return 0;
    }

    public double getTotalRating() {
        return 0;
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

    public void setWorkingDays(Number workingDays) {
        this.workingDays = workingDays;
    }

    public void setMinQualification(Number minQualification) {
        this.minQualification = minQualification;
    }

    public void setNumWorkers(Number numWorkers) {
        this.numWorkers = numWorkers;
    }

    public void setNumSubstitutes(Number numSubstitutes) {
        this.numSubstitutes = numSubstitutes;
    }

    public void setTotalRating(Integer totalRating) {
        this.totalRating = totalRating;
    }
}
