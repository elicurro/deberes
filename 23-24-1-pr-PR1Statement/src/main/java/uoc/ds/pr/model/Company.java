package uoc.ds.pr.model;


public class Company {

    private String id;
    private String name;
    private  String description;

    public Company(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Company() {

    }

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }


}
