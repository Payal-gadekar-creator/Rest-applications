package com.rest.springbasicrest.services;
import com.rest.springbasicrest.dao.CourseDao;
import com.rest.springbasicrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService{

  @Autowired
  private CourseDao courseDao;

 // List<Course> list;
  public CourseServiceImpl(){
//    list =new ArrayList<>();
//    list.add(new Course(145,"java core course","course for beginners to advance"));
//    list.add(new Course(146,"python course","course for beginner to intermediate"));

  }

  @Override
  public List<Course> getCourses() {
    return courseDao.findAll();
  }
  @Override
  public Course getCourses(long courseId){
//    Course c =null;
//    for(Course course:list)
//    {
//      if(course.getId()==courseId)
//      {
//        c=course;
//        break;
//      }
//    }
    return courseDao.getOne(courseId);
    }

  @Override
  public Course addCourse(Course course) {
//    list.add(course);
    courseDao.save(course);
    return course;
  }

  @Override
  public Course updateCourse(Course course) {
//   list.forEach(e->{
//     if (e.getId()==course.getId()) {
//       e.setTitle(course.getTitle());
//       e.setDescription(course.getDescription());
//     }
//   });
    courseDao.save(course);
    return course;
    }
    
@Override
public void deleteCourse(long parselong){
//  list=this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList());
Course entity=courseDao.getReferenceById(parselong);
courseDao.delete(entity);

  }
}
