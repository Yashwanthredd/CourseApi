package com.Yashwanth.Service;

import com.Yashwanth.Entity.Course;
import com.Yashwanth.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository courseRepository;
    
    // Add a new course
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }
    
    // Get all courses
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    // Get a course by ID
    public Optional<Course> getCourseById(Long id) {
        return courseRepository.findById(id);
    }

    // Update a course by ID
    public Course updateCourse(Long id, Course courseDetails) {
        Course course = courseRepository.findById(id).orElseThrow();
        course.setTitle(courseDetails.getTitle());
        course.setDescription(courseDetails.getDescription());
        course.setDuration(courseDetails.getDuration());
        return courseRepository.save(course);
    }

    // Delete a course by ID
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
