package com.example.seekerapp;

import java.util.ArrayList;
import java.util.Scanner;

public class Job {
    static Scanner scanner = new Scanner(System.in);
    private String JobTitle;
    private Company company;
    static ArrayList<Job> allJobs = new ArrayList<>();
    private ArrayList<Application> applications;

    private int job_vacancy;


    public Job(String jobTitle, int job_vacancy , Company company) {
        JobTitle = jobTitle;
        this.job_vacancy = job_vacancy;
        applications = new ArrayList<>();
        this.company = company;
        allJobs.add(this);
    }

    public Job(String jobTitle, int job_vacancy) {
        JobTitle = jobTitle;
        this.job_vacancy = job_vacancy;
        allJobs.add(this);
    }

    public String getJobTitle() {
        return JobTitle;
    }
    static Job getJob(int n) {
        return allJobs.get(n);
    }
    static Job getJob(String jobTitle){
        for(Job job:allJobs){
            if(job.getJobTitle().equals(jobTitle)){
                return job;
            }

        }
        return null;
    }

    public ArrayList<Application> getApplications() {
        return applications;
    }

    public static ArrayList<Job> getAllJobs() {
        return allJobs;
    }

    static void addApplication(int n , Application application){
        allJobs.get(n).applications.add(application);
    }
    static int getJobIndex(String jt , String CompanyName) {
        int n = 0;
        int i = 0;
        for (Job job : allJobs) {
            if (job.getJobTitle().equals(jt) && job.company.getName().equals(CompanyName)) {
                n = i + 1;
            }
            i++;
        }
        return n;
    }

    public void viewApplications(){
        int i = 0;
        for(Application application: applications){
            System.out.println("Application no. "+(i+1));
            application.viewApplication();
            System.out.println("--------------------");
            i++;
        }
    }

    public int getJob_vacancy() { return job_vacancy; }

    public void acceptApplication(int n){
        if(n > applications.size()){
            System.out.println("Application doesn't exist.");
        } else{
            applications.get(n-1).accept();
        }
    }

    static void leaveReview(int n){
        System.out.println("please leave a review between 0 and 5");
        double input = Double.valueOf(scanner.nextLine());
        allJobs.get(n).company.addReview(input);
    }
    static void leaveReviewGUI(int n , int rev){

        allJobs.get(n).company.addReview(rev);
    }

    public Company getCompany(){
        return company;
    }

    static void viewJobs(){
        int i=1;
        for(Job job : allJobs){
            System.out.println(i +"- Job Title: "+job.getJobTitle()+"\n"+"Job vacancies: "+job.job_vacancy+"\n"+"Company name: "+job.company.getName()+"\n"+
                    "----------------------");
             i++;
        }


    }
    public void removeApplication(Job_Seeker jobSeeker){
//        if(applications.size() == 0){
//            System.out.println("Mafish haga fel applications array");
//        }
        for(Application app :applications ){
            if(app.getJobSeeker().getUsername().equals(jobSeeker.getUsername())){
                applications.remove(app);
            }
        }
    }
    static int noOfJobsWithThis(String jobTitle){
        int n = 0;
        for(Job job : allJobs){
            if(job.getJobTitle().equals(jobTitle)){
                n++;
            }
        }
        return n;
    }
    static int noOfJobsWithThis(String jobTitle , String companyName){
        int n = 0;
        for(Job job : allJobs){
            if(job.getJobTitle().equals(jobTitle) && job.company.getName().equals(companyName)){
                n++;
            }
        }
        return n;
    }
    @Override
    public String toString(){
        return JobTitle+" "+job_vacancy;
    }


    // push temsah
}