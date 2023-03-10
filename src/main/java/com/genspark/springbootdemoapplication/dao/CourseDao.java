package com.genspark.springbootdemoapplication.dao;

import com.genspark.springbootdemoapplication.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDao extends JpaRepository<Course, Integer> {
}
