package com.genspark.springbootdemoapplication.service;

import com.genspark.springbootdemoapplication.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getCourses();
    Course getCourse(int courseId);
    Course addCourse(Course course);
    Course updateCourse(Course course);
    String deleteCourse(int courseId);
}
