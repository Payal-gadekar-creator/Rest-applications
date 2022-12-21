package com.rest.springbasicrest.dao;

import com.rest.springbasicrest.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface CourseDao extends JpaRepository<Course,Long> {

}
