package edu.in.batch1_sdet_trainer.spring.training;

public class TrainingTest {
    public static void main(String[] args) {

        Coherts sdetCoherts = new SdetCoherts();
        //


        Training training = new Training(sdetCoherts);
        training.getProjectDetails();

    }


}
