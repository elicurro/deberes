package uoc.ds.pr;



import edu.uoc.ds.adt.sequential.StackArrayImpl;
import edu.uoc.ds.traversal.Iterator;
import uoc.ds.pr.exceptions.*;
import uoc.ds.pr.model.*;
import java.time.LocalDate;
import edu.uoc.ds.adt.sequential.Stack;

public class CTTCompaniesJobsImpl implements CTTCompaniesJobs {


    private Worker[] workers;
    private int numWorkers;

    private Company[] companies;
    private int numCompanies;

    //private Request[] requests;
    private Request[] requests;
    private int numJobOffers;
    private int numPendingRequests;
    private int numTotalRequests;
    private int numRejectedRequests;
    private Qualification minQualification;

    /*public CTTCompaniesJobsImpl() {
        workers = new Worker[W];
        numWorkers = 0;
        companies = new Company[C];
        numCompanies = 0;
        numJobOffers = 0;
        //requests = new Request[R];
        requests = new StackArrayImpl<Request>();
        numTotalRequests= 0;
        numPendingRequests= 0;

        numRejectedRequests= 0;
    }*/
    public CTTCompaniesJobsImpl() {
        workers = new Worker[0];
        companies = new Company[0];
        requests = new Request[0];
    }

    @Override
    public String getJobOfferId() {
        return null;
    }

    @Override
    public LocalDate getStartDate() {
        return null;
    }

    @Override
    public LocalDate getEndDate() {
        return null;
    }

    @Override
    public int getWorkingDays() {
        return 0;
    }

    /*@Override
    public void addWorker(String id, String name, String surname, LocalDate dateOfBirth, Qualification qualification) {
        workers[workers.length-1] = new Worker(id, name, surname, dateOfBirth, qualification);
    }*/

    @Override
    public void addWorker(String id, String name, String surname, LocalDate dateOfBirth, Qualification qualification) {
        if(MAX_NUM_WORKERS > workers.length) {
            Worker[] tmpWorkers = new Worker[workers.length + 1];
            System.arraycopy(workers, 0, tmpWorkers, 0, workers.length);
            tmpWorkers[workers.length] = new Worker(id, name, surname, dateOfBirth, qualification);
            workers = tmpWorkers;
        }
    }

    @Override
    public Worker getWorker(String userId) {

        for (Worker w : workers) {
            if (w == null) {
                return null;
            } else if (w.is(userId)){
                return w;
            }
        }
        return null;
    }

    /*@Override
    public void addCompany(String id, String name, String description) {
        //companies[companies.length-1] = new Company(id, name, description);
        //System.out.println(id);
        Company company = getCompany2(id);
        if (company != null) {
            company.setName(name);
            company.setDescription(description);
        } else {
            //System.out.println(numCompanies + " "+company);
            company = new Company(id, name, description);
            companies[numCompanies]= company;
            numCompanies++;
        }
    }*/
    @Override
    public void addCompany(String id, String name, String description) {
        if(MAX_NUM_COMPANIES > companies.length) {
            Company[] tmpCompanies = new Company[companies.length + 1];
            System.arraycopy(companies, 0, tmpCompanies, 0, companies.length);
            tmpCompanies[companies.length] = new Company(id,name,description);
            companies = tmpCompanies;
        }
    }



/////////////////////////////////////////////////
    /*@Override
    public void addRequest(String id, String jobOfferId, String companyId, String description, Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) throws CompanyNotFoundException {
        Company company = getCompany2(companyId);
        if (company == null) {
            throw new CompanyNotFoundException();
        }
        requests.push(new Request(id, jobOfferId, companyId, description, minQualification, maxWorkers, startDate, endDate));
        numTotalRequests++;
    }*/

    @Override
    public void addRequest(String id, String jobOfferId, String companyId, String description, Qualification minQualification, int maxWorkers, LocalDate startDate, LocalDate endDate) throws CompanyNotFoundException {
        System.out.println("***addRequest***");
        Company company = getCompany2(companyId);
        if (company == null) {
            throw new CompanyNotFoundException();
        }
        Request[] tmpRequests = new Request[requests.length + 1];
        System.arraycopy(requests, 0, tmpRequests, 0, requests.length);
        tmpRequests[requests.length] = new Request(id,companyId, description, minQualification, maxWorkers, startDate, endDate);
        requests = tmpRequests;
        System.out.println(requests);
    }




    @Override
    public Request updateRequest(Status status, LocalDate date, String description) throws NoRequestException {
        System.out.println("***updateRequest***");
        

        return null;
    }
    ///////////////////////////////////////////////
    @Override
    public Response signUpJobOffer(String workerId, String jobOfferId) throws JobOfferNotFoundException, WorkerNotFoundException, WorkerAlreadyEnrolledException {
        return null;
    }
    @Override
    public double getPercentageRejectedRequests() {
        return 0;
    }
    @Override
    public Iterator<JobOffer> getJobOffersByCompany(String companyId) throws NOJobOffersException {
        return null;
    }
    @Override
    public Iterator<JobOffer> getAllJobOffers() throws NOJobOffersException {
        return null;
    }

    @Override
    public Iterator<JobOffer> getJobOffersByWorker(String workerId) throws NOJobOffersException {
        return null;
    }

    @Override
    public void addRating(String workerId, String jobOfferId, int value, String message) throws WorkerNotFoundException, JobOfferNotFoundException, WorkerNOEnrolledException {

    }
    @Override
    public Iterator<Rating> getRatingsByJobOffer(String jobOfferId) throws JobOfferNotFoundException, NORatingsException {
        return null;
    }

    @Override
    public Worker getMostActiveWorker() throws NoWorkerException {
        return null;
    }

    @Override
    public JobOffer getBestJobOffer() throws NOJobOffersException {
        return null;
    }


    //@Override
    public Company getCompany2(String id) {
        for (Company company : companies) {
            if (company != null && company.getId().equals(id)) {
                return company;
            }
        }
        return null;
    }
    @Override
    public Company getCompany() {
        for (Company company : companies) {
            return company;
        }
        return null;
    }

    @Override
    public JobOffer getJobOffer(String jobOfferId) {
        return null;
    }

    @Override
    public int numWorkers() {
        return workers.length;
    }
    @Override
    public int numCompanies() {
        return companies.length;
    }
    @Override
    public int numJobOffers() {
        return numJobOffers;
    }
    @Override
    public int numPendingRequests() {
        return requests.length;
    }
    @Override
    public int numTotalRequests() {
        return numTotalRequests;
    }
    @Override
    public int numRejectedRequests() {
        return numRejectedRequests;
    }
}
