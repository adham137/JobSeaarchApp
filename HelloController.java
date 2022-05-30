package com.example.seekerapp;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {
    Job_Seeker jobSeeker = Controller.Khaled;

    static String jt;
    @FXML
    private Label oldApplications;
    @FXML
    private TextField experience;
    @FXML
    private Label success3;
    @FXML
    private TextField appNo;
    @FXML
    private TextField skills;
    @FXML
    private Label success;
    @FXML
    private Label success2;
    @FXML
    private Label Resume;
    @FXML
    private TextField Reviewno;
    @FXML
    private Label choosenJob;
    @FXML
    private Label googleVacencies;
    @FXML
    private Label ibmVacencies;
    @FXML
    private Label siemensVacencies;
    @FXML
    private Label amazonVacencies;
    @FXML
    private Label microsoftVacencies;
    @FXML
    private Label noOfSoftwareEngJobs;
    @FXML
    private Label noOfAccountantJobs;
    @FXML
    private Label noOfMangers;
    @FXML
    private Label noOfHRs;
    @FXML
    private Label noOfDesigners;
    @FXML
    private Label noOfAnalysts;
    @FXML
    private Label googleRev;
    @FXML
    private Label siemensRev;
    @FXML
    private Label ibmRev;
    @FXML
    private Label microsoftRev;
    @FXML
    private Label amazonRev;
    public void setLabels(){
        noOfSoftwareEngJobs.setText(String.valueOf(Job.noOfJobsWithThis("Software Engineer")));
        noOfAccountantJobs.setText(String.valueOf(Job.noOfJobsWithThis("Accountant")));
        noOfMangers.setText(String.valueOf(Job.noOfJobsWithThis("Manager")));
        noOfHRs.setText(String.valueOf(Job.noOfJobsWithThis("HR")));
        noOfDesigners.setText(String.valueOf(Job.noOfJobsWithThis("Designer")));
        noOfAnalysts.setText(String.valueOf(Job.noOfJobsWithThis("Analyst")));
    }
    @FXML
    public void openApplyForJobSE() throws IOException {
        String jobTitle = "Software Engineer";

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;

    }
    public void openApplyForJobAcc() throws IOException {
        String jobTitle = "Accountant";
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;
    }
    public void openApplyForJobMan() throws IOException {
        String jobTitle = "Manager";
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;
    }
    public void openApplyForJobHR() throws IOException {
        String jobTitle = "HR";
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;
    }
    public void openApplyForJobDes() throws IOException {
        String jobTitle = "Designer";
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;
    }
    public void openApplyForJobAn() throws IOException {
        String jobTitle = "Analyst";
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("JobToApplyFor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle(jobTitle);
        stage.setScene(scene);
        stage.show();
        jt = jobTitle;
    }
    @FXML
    public void show(){
        choosenJob.setText(jt);
        googleVacencies.setText(String.valueOf(Job.noOfJobsWithThis(jt,"Google")));
        amazonVacencies.setText(String.valueOf(Job.noOfJobsWithThis(jt,"Amazon")));
        ibmVacencies.setText(String.valueOf(Job.noOfJobsWithThis(jt,"IBM")));
        microsoftVacencies.setText(String.valueOf(Job.noOfJobsWithThis(jt,"Microsoft")));
        siemensVacencies.setText(String.valueOf(Job.noOfJobsWithThis(jt,"Siemens")));
        googleRev.setText(String.valueOf(Controller.Google.getReview()));
        microsoftRev.setText(String.valueOf(Controller.Microsoft.getReview()));
        siemensRev.setText(String.valueOf(Controller.Siemens.getReview()));
        amazonRev.setText(String.valueOf(Controller.Amazon.getReview()));
        ibmRev.setText(String.valueOf(Controller.IBM.getReview()));
    }
    @FXML
    public void ApplyForGoogle(){
        int n=  Job.getJobIndex(jt,"Google");
        jobSeeker.applyGUI(n);
        int r = Integer.valueOf(Reviewno.getText());
        Job.leaveReviewGUI(n ,r);
        success.setText("Applied for job successfully!");
        show();

    }
    public void ApplyForAmazon(){
        int n=  Job.getJobIndex(jt,"Amazon");
        jobSeeker.applyGUI(n);
        int r = Integer.valueOf(Reviewno.getText());
        Job.leaveReviewGUI(n ,r);
        success.setText("Applied for job successfully!");
        show();
    }
    public void ApplyForMicrosoft(){
        int n=  Job.getJobIndex(jt,"Microsoft");
        jobSeeker.applyGUI(n);
        int r = Integer.valueOf(Reviewno.getText());
        Job.leaveReviewGUI(n ,r);
        success.setText("Applied for job successfully!");
        show();
    }
    public void ApplyForIBM(){
        int n=  Job.getJobIndex(jt,"IBM");
        jobSeeker.applyGUI(n);
        int r = Integer.valueOf(Reviewno.getText());
        Job.leaveReviewGUI(n ,r);
        success.setText("Applied for job successfully!");
        show();
    }
    public void ApplyForSiemens(){
        int n=  Job.getJobIndex(jt,"Siemens");
        jobSeeker.applyGUI(n);
        int r = Integer.valueOf(Reviewno.getText());
        Job.leaveReviewGUI(n ,r);
        success.setText("Applied for job successfully!");
        show();
    }
    @FXML
    public void viewOldResume(){
        Resume.setText(String.valueOf(jobSeeker.getResume()));
    }
    public void setResume(){
        int exp = Integer.valueOf(experience.getText());
        String sk = skills.getText();
        jobSeeker.setResumeGUI(exp,sk);
        success2.setText("Updated Successfully!");
        viewOldResume();
    }
    public void viewOldAppl(){
        jobSeeker.removeGUI(oldApplications);
    }
    public void removeOldAppl(){
        jobSeeker.furtherRemoveGUI(appNo,success3);
        viewOldAppl();
    }

}