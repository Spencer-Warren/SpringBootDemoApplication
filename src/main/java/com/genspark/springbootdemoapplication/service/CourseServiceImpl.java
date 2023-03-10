package com.genspark.springbootdemoapplication.service;

import com.genspark.springbootdemoapplication.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private List<Course> courses;

    public CourseServiceImpl() {
        courses = new ArrayList<>();
        courses.add(new Course(1, "Java", "John"));
        courses.add(new Course(2, "Python", "Mike"));
        courses.add(new Course(3, "C++", "Jack"));
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Course getCourse(int courseId) {
        return courses.stream()
                .filter(course -> course.getCourseId() == courseId)
                .findFirst()
                .orElse(new Course(0, "No course", "No instructor"));
    }

    @Override
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course updatedCourse) {
        Course courseToUpdate = courses.stream()
                .filter(c -> c.getCourseId() == updatedCourse.getCourseId())
                .findFirst()
                .orElse(null);
        if (courseToUpdate != null) {
            courseToUpdate.setCourseName(updatedCourse.getCourseName());
            courseToUpdate.setInstructorName(updatedCourse.getInstructorName());
        }
        return courseToUpdate;
    }

    @Override
    public String deleteCourse(int courseId) {
        courses.removeIf(course -> course.getCourseId() == courseId);
        return "Course with id " + courseId + " deleted";
    }
}
