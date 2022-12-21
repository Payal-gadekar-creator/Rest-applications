package com.rest.springbasicrest.services;
import java.util.List;
import com.rest.springbasicrest.entities.Course;
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourses(long courseId);
    public Course addCourse(Course course);
   public Course updateCourse(Course course);

   public void deleteCourse(long parseLong);
}
