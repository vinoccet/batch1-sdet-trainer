package edu.in.batch1_sdet_trainer.spring.training;

public class TrainingService {

    private Coherts coherts;

    public Coherts getSdetCoherts() {
        return coherts;
    }

    public void setCoherts(Coherts coherts) {
        this.coherts = coherts;
    }
    public TrainingService(Coherts coherts) {
        this.coherts = coherts;
    }

    public void getProjectDetails(){
        this.coherts.projectDetails();
    }

}
