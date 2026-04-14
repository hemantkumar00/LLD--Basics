package com.advanceJava.DesignPatterns.Creational.Factory;

public class AbstractFactory {

    static void main() {
        ClassroomFactory classroomFactory = new BiologyClassroomFactory();
        Student student = classroomFactory.createStudent("hemant", "kumar");
        Teacher teacher = classroomFactory.createTeacher("hemant", "kumar");
        System.out.println(student);
        System.out.println(teacher);
    }
}

/*
 * The abstract factory pattern is a creational pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 */

abstract class User {}

class Student extends User {
    String firstName;
    String lastName;
    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
class Teacher extends User {
    String firstName;
    String lastName;
    Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

class BiologyStudent extends Student {
    BiologyStudent (String firstName, String lastName) {
        super(firstName, lastName);
    }
}

class BiologyTeacher extends Teacher {
    BiologyTeacher (String firstName, String lastName) {
        super(firstName, lastName);
    }
}

abstract class ClassroomFactory{
    abstract Student createStudent(String firstName, String lastName);
    abstract Teacher createTeacher(String firstName, String lastName);
}

class BiologyClassroomFactory extends ClassroomFactory{
    @Override
    Student createStudent(String firstName, String lastName) {
        return new BiologyStudent (firstName, lastName);
    }
    @Override
    Teacher createTeacher(String firstName, String lastName) {
        return new BiologyTeacher (firstName, lastName);
    }
}

//class StudentFactory {
//    public User createStudent(int firstName, int lastName) {
//        return new Student(firstName, lastName);
//    }
//}
//class TeacherFactory {
//    public User createTeacher(int firstName, int lastName) {
//        return new Teacher(firstName, lastName);
//    }
//}
