package edu.in.batch1_sdet_trainer.spring.withspring;

import edu.in.batch1_sdet_trainer.spring.training.Student;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrainingTestWithSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        ApplicationContext context1=new AnnotationConfigApplicationContext(SpringJavaConfig.class);

        Student student = context.getBean(Student.class);
        student.writeExam();

        Student student1 = context1.getBean("getStudent",Student.class);
        student1.writeExam();
    }




}
