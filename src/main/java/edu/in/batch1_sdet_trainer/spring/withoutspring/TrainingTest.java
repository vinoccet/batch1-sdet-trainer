package edu.in.batch1_sdet_trainer.spring.withoutspring;

import edu.in.batch1_sdet_trainer.spring.training.Coherts;
import edu.in.batch1_sdet_trainer.spring.training.SdetCoherts;
import edu.in.batch1_sdet_trainer.spring.training.TrainingService;

public class TrainingTest {
    public static void main(String[] args) {

        Coherts sdetCoherts = new SdetCoherts();
        //


        TrainingService training = new TrainingService(sdetCoherts);
//        training.getProjectDetails();

    }


}
