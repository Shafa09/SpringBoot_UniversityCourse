package com.univ.model;

 

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "applicant")
public class Applicant {
    
    @Id
    @GeneratedValue
    private int applicantId;
    private String applicantName;
    private int mobileNumber;
    private String applicantDegree;
    private int applicantGraduationPercent;
	private String applicantStatus;
    public int getApplicantId() {
        return applicantId;
    }
    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
    public String getApplicantName() {
        return applicantName;
    }
    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }
    public int getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getApplicantDegree() {
        return applicantDegree;
    }
    public void setApplicantDegree(String applicantDegree) {
        this.applicantDegree = applicantDegree;
    }
    public int getApplicantGraduationPercent() {
        return applicantGraduationPercent;
    }
    public void setApplicantGraduationPercent(int applicantGraduationPercent) {
        this.applicantGraduationPercent = applicantGraduationPercent;
    }
    public String getApplicantStatus() {
    	return applicantStatus;
    }
    public void setApplicantStatus(String applicantStatus) {
        this.applicantStatus = applicantStatus;
    }
    @Override
    public String toString() {
        return "Applicant [applicantId=" + applicantId + ", applicantName=" + applicantName + ", mobileNumber="
                + mobileNumber + ", applicantDegree=" + applicantDegree + ", applicantGraduationPercent="
                + applicantGraduationPercent + ", applicantStatus=" + applicantStatus +"]";
    }
	public void setError(String string) {
		System.out.println("Not Found");
		
	}
	public void setStatus(int value) {
		System.out.println("not found");
		
	}
	
    
    
    

 

}