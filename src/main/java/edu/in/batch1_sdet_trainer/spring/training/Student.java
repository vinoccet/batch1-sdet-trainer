package edu.in.batch1_sdet_trainer.spring.training;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setting age");
        if (age > 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
    }

    public Student() {
        System.out.println("i am in student constructor");
    }

    public void writeExam() {
        System.out.println("appearing for exam" + this.age);
    }
}
