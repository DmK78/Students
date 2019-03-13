package com.dmk78.students;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Student.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);

        /*databaseHandler.addStudent(new Student("Biology", "Ivanov", "Ivan","5"));
        databaseHandler.addStudent(new Student("Biology", "Petrov", "Petr","4"));
        databaseHandler.addStudent(new Student("Philosify", "Romanov", "Roman","4"));
        databaseHandler.addStudent(new Student("Physycs", "Ivanova", "Darya","3"));*/


        /*Student deletingStudent = databaseHandler.getStudent(1);
        databaseHandler.deleteStudent(deletingStudent);*/

        Student student = databaseHandler.getStudent(2);
        Log.d("studentInfo:", "ID " + student.getId() + ", FACULTY " + student.getFaculty() + " , SURNAME " + student.getSurname() + ", NAME " + student.getName() + ", AGP " + student.getAvrGradePoint());

        student.setName("Vasya");
        student.setAvrGradePoint("5");
        databaseHandler.updateStudent(student);




        List<Student> studentsList = databaseHandler.getAllStudents();
        for (Student student1 : studentsList) {
            Log.d("studentInfo:", "ID " + student1.getId() + ", FACULTY " + student1.getFaculty() + " , SURNAME " + student1.getSurname() + ", NAME " + student1.getName() + ", AGP " + student1.getAvrGradePoint());
        }


    }
}