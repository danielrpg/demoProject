package com.example.demo.command;

import com.example.demo.model.ModelBase;
import com.example.demo.model.Personal;

public class PersonalCommand extends ModelBase {

    private String firstName;
    private String lastName;
//    private String name;
//    private String image;
//    private String jobPosition;
//    private String jobCode;
//    private Boolean featured;
//    private String jobDescription;

    public PersonalCommand() {
    }

    public PersonalCommand(String firstName, String lastName, String name, String image, String jobPosition,
                           String jobCode, Boolean featured, String jobDescription) {

        this.firstName = firstName;
        this.lastName = lastName;
//        this.name = name;
//        this.image = image;
//        this.jobPosition = jobPosition;
//        this.jobCode = jobCode;
//        this.featured = featured;
//        this.jobDescription = jobDescription;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonalCommand(Personal personal) {
        setId(personal.getId());
        setVersion(personal.getVersion());
        setCreatedOn(personal.getCreatedOn());
        setUpdatedOn(personal.getUpdatedOn());
        firstName = personal.getFirstName();
        lastName = personal.getLastName();
//        for (Contract contract : employee.getContracts()) {
//            jobPosition = contract.getPosition().getName();
//            jobCode = contract.getPosition().getName();
//        }
//        featured = true;
//        image = "/assets/images/valentin.jpg"; // todo arreglo de bits
//        jobDescription = "Descripcion de job";
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }
//
//    public String getJobPosition() {
//        return jobPosition;
//    }
//
//    public void setJobPosition(String jobPosition) {
//        this.jobPosition = jobPosition;
//    }
//
//    public String getJobCode() {
//        return jobCode;
//    }
//
//    public void setJobCode(String jobCode) {
//        this.jobCode = jobCode;
//    }
//
//    public Boolean getFeatured() {
//        return featured;
//    }
//
//    public void setFeatured(Boolean featured) {
//        this.featured = featured;
//    }
//
//    public String getJobDescription() {
//        return jobDescription;
//    }
//
//    public void setJobDescription(String jobDescription) {
//        this.jobDescription = jobDescription;
//    }

    public Personal toPersonal() {
        Personal employee = new Personal();
        employee.setFirstName(getFirstName());
        employee.setLastName(getLastName());
//        employee.setId(getId());
//        employee.setVersion(getVersion());
//        employee.setCreatedOn(getCreatedOn());
//        employee.setUpdatedOn(getUpdatedOn());
        return employee;
    }
}
