package dev;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import bootcamp.Bootcamp;
import course.Course;

public class Dev implements IDev {
    private static int nextId = 1;
    private int id;
    private String name;
    private String birthDate;
    private String email;
    private List<Bootcamp> enrolledBootcamps;
    private List<Course> enrolledCourses;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Dev(String name, LocalDate birthDate, String email) {
        this.id = nextId++;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate.format(formatter);
        this.enrolledBootcamps = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public List<Bootcamp> getEnrolledBootcamps() {
        return this.enrolledBootcamps;
    }

    public List<Course> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    @Override
    public void enrollInBootcamp(Bootcamp bootcamp) { 
        enrolledBootcamps.add(bootcamp);
    }

    @Override
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
    }
}
