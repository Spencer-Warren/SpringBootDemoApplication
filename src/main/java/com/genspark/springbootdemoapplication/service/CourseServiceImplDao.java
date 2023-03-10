package com.genspark.springbootdemoapplication.service;

import com.genspark.springbootdemoapplication.dao.CourseDao;
import com.genspark.springbootdemoapplication.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplDao implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(int courseId) {
        return courseDao.findById(courseId).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseDao.save(course);
    }

    @Override
    public String deleteCourse(int courseId) {
        courseDao.deleteById(courseId);
        return "Course with id " + courseId + " deleted";
    }
}
