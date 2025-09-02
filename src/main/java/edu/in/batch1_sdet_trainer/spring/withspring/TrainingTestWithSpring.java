package edu.in.batch1_sdet_trainer.spring.withspring;

import edu.in.batch1_sdet_trainer.spring.training.Student;
import edu.in.batch1_sdet_trainer.spring.training.TrainingService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainingTestWithSpring {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
//        TrainingService trainingService = context.getBean("trainService", TrainingService.class);
//        trainingService.getProjectDetails();
//        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
//        Student student=context.getBean("getStudent", Student.class);
//        System.out.println(student.getAge());
//        ApplicationContext context=new AnnotationConfigApplicationContext(JavaAnnotationConfig.class);
        ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
        Student student = context.getBean(Student.class);
        System.out.println(student.getAge());
    }


}
