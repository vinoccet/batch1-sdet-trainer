package edu.in.batch1_sdet_trainer.spring.training;

public class Training {
    Coherts coherts;

    public Training(Coherts coherts) {
        this.coherts = coherts;
    }

    public  void getProjectDetails() {

        this.coherts.projectDetails();
    }


}
